/*
 [The "BSD licence"]
 Copyright (c) 2013 Sam Harwell
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** C 2011 grammar built from the C11 Spec */
/** Made better thanks to an imaginary spec */
grammar CMieux;


autoStructDeclaration
    :   'auto' 'struct' Identifier (autoStructBody ';'? | ';')
    ;

autoStructBody
    :   '{' structDeclarationList? '}'
    ;

autoStructAllocation
    : 'new' Identifier ('(' argumentExpressionList? ')')?
    ;

deferStatement
    : 'defer' statement
    ;

freeStatement
    : 'free' Identifier ';'
    ;

methodDeclaration
    : declarationSpecifiers? Identifier '@' typeSpecifier '(' parameterTypeList? ')' ';'
    ;

methodDefinition
    : declarationSpecifiers? Identifier '@' typeSpecifier '(' parameterTypeList? ')' compoundStatement
    ;

autoCastExpression
    :   '(' ')' assignmentExpression
    ;

lineDirective
    :   '#' line=IntegerConstant StringLiteral otherNumbers=IntegerConstant*
    ;

primaryExpression
    :   Identifier          # Identifier
    |   IntegerConstant     # IntegerConstant
    |   FloatingConstant    # FloatingConstant
    |   CharacterConstant   # CharacterConstant
    |   StringLiteral+      # StringLiteral
    |   '(' expression ')'  # ParenExpression
    |   genericSelection    # GenericSelectionExpression
    |   '__extension__'? '(' compoundStatement ')' # Block // Blocks (GCC extension)
    |   '__builtin_va_arg' '(' unaryExpression ',' typeName ')'   # BuiltinVaArg
    |   '__builtin_offsetof' '(' typeName ',' unaryExpression ')' # BuiltinOffsetOf
    ;

genericSelection
    :   '_Generic' '(' assignmentExpression ',' assocList+=genericAssociation (',' assocList+=genericAssociation)* ')'
    ;

genericAssociation
    :   typeName  ':' assignmentExpression # GenericTypeAssoc
    |   'default' ':' assignmentExpression # GenericDefaultAssoc
    ;

postfixExpression
    :   primaryExpression                                 # Postfix_PrimaryExpression
    |   postfixExpression '[' expression ']'              # ArrayAccess
    |   postfixExpression '(' argumentExpressionList? ')' # FunctionCall
    |   postfixExpression '.' Identifier                  # FieldAccess
    |   postfixExpression '->' Identifier                 # FieldAcessPtr
    |   postfixExpression '++'                            # IncrementAfter
    |   postfixExpression '--'                            # DecrementAfter
    |   '(' typeName ')' '{' initializerList ','? '}'     # InlineStructInit
    |   '__extension__' '(' typeName ')' '{' initializerList ','? '}' # InlineExtensionStructInit
    ;

argumentExpressionList
    :   args+=assignmentExpression (',' args+=assignmentExpression)*
    ;

unaryExpression
    :   postfixExpression            # Unary_PostfixExpression
    |   '++' unaryExpression         # IncrementBefore
    |   '--' unaryExpression         # DecrementBefore
    |   unaryOperator castExpression # UnaryOpAndCast
    |   'sizeof' unaryExpression     # SizeofUnaryExpression
    |   'sizeof' '(' typeName ')'    # SizeofExpression
    |   '_Alignof' '(' typeName ')'  # AlignofExpression
    |   '&&' Identifier              # LabelAddress // GCC extension address of label
    ;

unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;

castExpression
    :   '(' typeName ')' castExpression                  # Cast
    |   '__extension__' '(' typeName ')' castExpression  # ExtensionCast
    |   unaryExpression                                  # CastUnaryExpression
    |   digitSequence                                    # CastDigitSequence // for
    ;

multiplicativeExpression
    :   castExpression                              # Mul_CastExpression
    |   multiplicativeExpression '*' castExpression # MulExpression
    |   multiplicativeExpression '/' castExpression # DivExpression
    |   multiplicativeExpression '%' castExpression # ModExpression
    ;

additiveExpression
    :   multiplicativeExpression                        # Add_MulExpression
    |   additiveExpression '+' multiplicativeExpression # AddExpression
    |   additiveExpression '-' multiplicativeExpression # SubExpression
    ;

shiftExpression
    :   additiveExpression                      # Shift_AddExpression
    |   shiftExpression '<<' additiveExpression # LShiftExpression
    |   shiftExpression '>>' additiveExpression # RShiftExpression
    ;

relationalExpression
    :   shiftExpression                            # Rel_ShiftExpression
    |   relationalExpression '<' shiftExpression   # LTExpression
    |   relationalExpression '>' shiftExpression   # GTExpression
    |   relationalExpression '<=' shiftExpression  # LTEExpression
    |   relationalExpression '>=' shiftExpression  # GTEExpression
    ;

equalityExpression
    :   relationalExpression                         # Eq_RelExpression
    |   equalityExpression '==' relationalExpression # EqExpression
    |   equalityExpression '!=' relationalExpression # NeqExpression
    ;

binAndExpression
    :   equalityExpression                      # BinaryAnd_EqExpression
    |   binAndExpression '&' equalityExpression # BinaryAndExpression
    ;

exclusiveOrExpression
    :   binAndExpression                           # Xor_AndExpression
    |   exclusiveOrExpression '^' binAndExpression # XorExpression
    ;

inclusiveOrExpression
    :   exclusiveOrExpression                            # BinaryOr_XorExpression
    |   inclusiveOrExpression '|' exclusiveOrExpression  # BinaryOrExpression
    ;

logicalAndExpression
    :   inclusiveOrExpression                           # And_BinaryOrExpression
    |   logicalAndExpression '&&' inclusiveOrExpression # AndExpression
    ;

logicalOrExpression
    :   logicalAndExpression                          # Or_AndExpression
    |   logicalOrExpression '||' logicalAndExpression # OrExpression
    ;

conditionalExpression
    :   logicalOrExpression # Ternary_OrExpression
    |   logicalOrExpression '?' expression ':' conditionalExpression # TernaryExpression
    ;

assignmentExpression
    :   autoStructAllocation
    |   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    |   digitSequence // for
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;

expression
    :   assignmentExpression (',' assignmentExpression)*
    ;

constantExpression
    :   conditionalExpression
    ;

declaration
    :   declarationSpecifiers initDeclaratorList ';'
	| 	declarationSpecifiers ';'
    |   staticAssertDeclaration
    ;

declarationSpecifiers
    :   declarationSpecifier+
    ;

declarationSpecifiers2
    :   declarationSpecifier+
    ;

declarationSpecifier
    :   storageClassSpecifier
    |   typeSpecifier
    |   typeQualifier
    |   functionSpecifier
    |   alignmentSpecifier
    ;

initDeclaratorList
    :   initDeclarator (',' initDeclarator)*
    ;

initDeclarator
    :   declarator
    |   declarator '=' initializer
    ;

storageClassSpecifier
    :   'typedef'
    |   'extern'
    |   'static'
    |   '_Thread_local'
    |   'auto'
    |   'register'
    ;

typeSpecifier
    :   ('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    |   '_Bool'
    |   '_Complex'
    |   '__m128'
    |   '__m128d'
    |   '__m128i') # SimpleTypeSpecifier
    |   '__extension__' '(' type=('__m128' | '__m128d' | '__m128i') ')' # ExtensionTypeSpecifier
    |   atomicTypeSpecifier                     # TypeSpecifier_Atomic
    |   structOrUnionSpecifier                  # TypeSpecifier_StructOrUnion
    |   enumSpecifier                           # TypeSpecifier_Enum
    |   typedefName                             # TypeSpecifier_TypedefName
    |   '__typeof__' '(' constantExpression ')' # TypeofTypeSpecifier // GCC extension
    |   typeSpecifier pointer                   # PointerTypeSpecifier
    ;

structOrUnionSpecifier
    :   'struct' name=Identifier? ('{' structDeclarationList '}')? # StructSpecifier
    |   'union'  name=Identifier? ('{' structDeclarationList '}')? # UnionSpecifier
    ;

structDeclarationList
    :   structDeclaration+
    ;

structDeclaration
    :   specifierQualifierList structDeclaratorList? ';'
    |   staticAssertDeclaration
    ;

specifierQualifierList
    :   (typeSpecifier | typeQualifier)+
    ;

structDeclaratorList
    :   structDeclarator (',' structDeclarator)*
    ;

structDeclarator
    :   declarator
    |   declarator? ':' constantExpression
    ;

enumSpecifier
    :   'enum' Identifier? '{' enumeratorList ','? '}'     # Enum
    |   'enum' Identifier                             # EnumType
    ;

enumeratorList
    :   enumerator (',' enumerator)*
    ;

enumerator
    :   enumerationConstant
    |   enumerationConstant '=' constantExpression
    ;

enumerationConstant
    :   Identifier
    ;

atomicTypeSpecifier
    :   '_Atomic' '(' typeName ')'
    ;

typeQualifier
    :   'const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic'
    ;

functionSpecifier
    :   ('inline'
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')          # FunctionAttribute
    |   gccAttributeSpecifier # GCCFunctionAttribute
    |   '__declspec' '(' storageInfo=Identifier ')' # DeclSpecAttribute
    ;

alignmentSpecifier
    :   '_Alignas' '(' typeName ')'
    |   '_Alignas' '(' constantExpression ')'
    ;

declarator
    :   pointer? directDeclarator gccDeclaratorExtension*
    ;

directDeclarator
    :   Identifier         # VariableName
    |   '(' declarator ')' # ParenDeclarator
    |   directDeclarator '[' typeQualifierList? assignmentExpression? ']'         # ArrayDeclarator1
    |   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']' # ArrayDeclarator2
    |   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'  # ArrayDeclarator3
    |   directDeclarator '[' typeQualifierList? '*' ']'                           # ArrayDeclarator4
    |   directDeclarator '(' parameterTypeList ')'      # FunctionDeclarator
    |   directDeclarator '(' identifierList? ')'        # FunctionDeclaratorArgNamesOnly
    |   Identifier ':' digitSequence                    # BitField
    |   '(' typeSpecifier? pointer directDeclarator ')' # FunctionPointer
    ;

gccDeclaratorExtension
    :   gccAsmDeclarator
    |   gccAttributeSpecifier
    ;

gccAsmDeclarator
    :   ('__asm' | '__asm__') '(' StringLiteral+ ')'
    ;

gccAttributeSpecifier
    :   '__attribute__' '(' '(' gccAttributeList ')' ')'
    ;

gccAttributeList
    :   gccAttribute (',' gccAttribute)*
    |   // empty
    ;

gccAttribute
    :   identifierOrReservedWord=~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
        ('(' argumentExpressionList? ')')?
    |   // empty
    ;

pointer
    :   '*' typeQualifierList? pointer? # PointerComponent
    |   '^' typeQualifierList? pointer? # BlockPointerComponent // Blocks language extension
    ;

typeQualifierList
    :   typeQualifier+
    ;

parameterTypeList
    :   parameterList            # SimpleParameterList
    |   parameterList ',' '...'  # VarArgParameterList
    ;

parameterList
    :   parameterDeclaration (',' parameterDeclaration)*
    ;

parameterDeclaration
    :   declarationSpecifiers declarator            # SimpleParameterDeclaration
    |   declarationSpecifiers2 abstractDeclarator?  # AbstractParameterDeclaration
    ;

identifierList
    :   identifiers+=Identifier (',' identifiers+=Identifier)*
    ;

typeName
    :   specifierQualifierList abstractDeclarator?
    ;

abstractDeclarator
    :   pointer
    |   pointer? directAbstractDeclarator gccDeclaratorExtension*
    ;

directAbstractDeclarator
    :   '(' abstractDeclarator ')' gccDeclaratorExtension*       # ParenAbstractDeclarator
    |   '[' typeQualifierList? assignmentExpression? ']'         # ArrayAbstractDeclarator1
    |   '[' 'static' typeQualifierList? assignmentExpression ']' # ArrayAbstractDeclarator2
    |   '[' typeQualifierList 'static' assignmentExpression ']'  # ArrayAbstractDeclarator3
    |   '[' '*' ']'                                              # ArrayAbstractDeclarator4
    |   '(' parameterTypeList? ')' gccDeclaratorExtension*       # FunctionAbstractDeclarator1
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'          # ArrayAbstractDeclarator5
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'  # ArrayAbstractDeclarator6
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'   # ArrayAbstractDeclarator7
    |   directAbstractDeclarator '[' '*' ']'                                               # ArrayAbstractDeclarator8
    |   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension* # FunctionAbstractDeclarator2
    ;

typedefName
    :   Identifier
    ;

initializer
    :   autoCastExpression
    |   assignmentExpression
    |   arrayOrStructInitializer
    ;

arrayOrStructInitializer
    :   '{' initializerList ','? '}'
    ;

initializerList
    :   initializerListItem (',' initializerListItem)*
    ;

initializerListItem
    : arrayElementInit
    | arrayIndexedInit
    | structFieldInit
    ;

arrayElementInit
    : initializer
    ;

arrayIndexedInit
    :   ('[' indexes+=constantExpression ']')+ '=' initializer
    ;

structFieldInit
    :   ('.' fields+=Identifier)+ '=' initializer
    ;

staticAssertDeclaration
    :   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
    ;

statement
    :   deferStatement
    |   freeStatement
    |   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    |   asmStatement
    |   ';'
    ;

asmStatement
    :   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;

labeledStatement
    :   Identifier ':' statement                # Label
    |   'case' constantExpression ':' statement # CaseLabel
    |   'default' ':' statement                 # CaseDefaultLabel
    ;

compoundStatement
    :   '{' blockItem* '}'
    ;

blockItem
    :   statement
    |   declaration
    ;

expressionStatement
    :   expression ';'
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    |   'switch' '(' expression ')' statement
    ;

iterationStatement
    :   While '(' expression ')' statement
    |   Do statement While '(' expression ')' ';'
    |   For '(' forCondition ')' statement
    ;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
    :   declarationSpecifiers initDeclaratorList?
    ;

forExpression
    :   assignmentExpression (',' assignmentExpression)*
    ;

jumpStatement
    :   'goto' Identifier ';'      # GotoStatement
    |   'continue' ';'             # ContinueStatement
    |   'break' ';'                # BreakStatement
    |   'return' expression? ';'   # ReturnStatement
    |   'goto' unaryExpression ';' # GCCDynamicGotoStatement // GCC extension
    ;

compilationUnit
    :   (topLevelStatement | ';')* EOF
    ;

topLevelStatement
    :   lineDirective
    |   externalDeclaration
    ;

externalDeclaration
    :   autoStructDeclaration
    |   functionDefinition
    |   methodDefinition
    |   methodDeclaration
    |   declaration
    ;

functionDefinition
    :   declarationSpecifiers? declarator declarationList? compoundStatement
    ;

declarationList
    :   declaration+
    ;

digitSequence
    : DigitSequence
    ;

Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
If : 'if';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';

Alignas : '_Alignas';
Alignof : '_Alignof';
Atomic : '_Atomic';
Bool : '_Bool';
Complex : '_Complex';
Generic : '_Generic';
Imaginary : '_Imaginary';
Noreturn : '_Noreturn';
StaticAssert : '_Static_assert';
ThreadLocal : '_Thread_local';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
Ellipsis : '...';

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    |   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

fragment
HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

IntegerConstant
    :   DecimalConstant IntegerSuffix?
    |   OctalConstant IntegerSuffix?
    |   HexadecimalConstant IntegerSuffix?
    |	BinaryConstant
    ;

fragment
BinaryConstant
	:	'0' [bB] [0-1]+
	;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
OctalConstant
    :   '0' OctalDigit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
IntegerSuffix
    :   UnsignedSuffix LongSuffix?
    |   UnsignedSuffix LongLongSuffix
    |   LongSuffix UnsignedSuffix?
    |   LongLongSuffix UnsignedSuffix?
    ;

fragment
UnsignedSuffix
    :   [uU]
    ;

fragment
LongSuffix
    :   [lL]
    ;

fragment
LongLongSuffix
    :   'll' | 'LL'
    ;

FloatingConstant
    :   DecimalFloatingConstant
    |   HexadecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant ExponentPart? FloatingSuffix?
    |   DigitSequence ExponentPart FloatingSuffix?
    ;

fragment
HexadecimalFloatingConstant
    :   HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
    |   HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

DigitSequence
    :   Digit+
    ;

fragment
HexadecimalFractionalConstant
    :   HexadecimalDigitSequence? '.' HexadecimalDigitSequence
    |   HexadecimalDigitSequence '.'
    ;

fragment
BinaryExponentPart
    :   'p' Sign? DigitSequence
    |   'P' Sign? DigitSequence
    ;

fragment
HexadecimalDigitSequence
    :   HexadecimalDigit+
    ;

fragment
FloatingSuffix
    :   'f' | 'l' | 'F' | 'L'
    ;

CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;

fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;

StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;

fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

ComplexDefine
    :   '#' Whitespace? 'define'  ~[#]*
        -> skip
    ;

IncludeDirective
    :   '#' Whitespace? 'include' Whitespace? (('"' ~[\r\n]* '"') | ('<' ~[\r\n]* '>' )) Whitespace? Newline
        -> skip
    ;

// ignore the following asm blocks:
/*
    asm
    {
        mfspr x, 286;
    }
 */
AsmBlock
    :   'asm' ~'{'* '{' ~'}'* '}'
	-> skip
    ;

// ignore the lines generated by c preprocessor
// sample line : '#line 1 "/home/dm/files/dk1.h" 1'
LineAfterPreprocessing
    :   '#line' Whitespace* ~[\r\n]*
        -> skip
    ;

PragmaDirective
    :   '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
        -> skip
    ;

NullDirective
    :   '#' Whitespace* Newline
        -> skip
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
