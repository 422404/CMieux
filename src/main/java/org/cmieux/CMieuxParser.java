// Generated from /home/elyan/Documents/CMieux/src/main/antlr/org/cmieux/CMieux.g4 by ANTLR 4.8
package org.cmieux;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMieuxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Auto=20, Break=21, Case=22, Char=23, Const=24, Continue=25, 
		Default=26, Do=27, Double=28, Else=29, Enum=30, Extern=31, Float=32, For=33, 
		Goto=34, If=35, Inline=36, Int=37, Long=38, Register=39, Restrict=40, 
		Return=41, Short=42, Signed=43, Sizeof=44, Static=45, Struct=46, Switch=47, 
		Typedef=48, Union=49, Unsigned=50, Void=51, Volatile=52, While=53, Alignas=54, 
		Alignof=55, Atomic=56, Bool=57, Complex=58, Generic=59, Imaginary=60, 
		Noreturn=61, StaticAssert=62, ThreadLocal=63, LeftParen=64, RightParen=65, 
		LeftBracket=66, RightBracket=67, LeftBrace=68, RightBrace=69, Less=70, 
		LessEqual=71, Greater=72, GreaterEqual=73, LeftShift=74, RightShift=75, 
		Plus=76, PlusPlus=77, Minus=78, MinusMinus=79, Star=80, Div=81, Mod=82, 
		And=83, Or=84, AndAnd=85, OrOr=86, Caret=87, Not=88, Tilde=89, Question=90, 
		Colon=91, Semi=92, Comma=93, Assign=94, StarAssign=95, DivAssign=96, ModAssign=97, 
		PlusAssign=98, MinusAssign=99, LeftShiftAssign=100, RightShiftAssign=101, 
		AndAssign=102, XorAssign=103, OrAssign=104, Equal=105, NotEqual=106, Arrow=107, 
		Dot=108, Ellipsis=109, Identifier=110, IntegerConstant=111, FloatingConstant=112, 
		DigitSequence=113, CharacterConstant=114, StringLiteral=115, ComplexDefine=116, 
		IncludeDirective=117, AsmBlock=118, LineAfterPreprocessing=119, PragmaDirective=120, 
		NullDirective=121, Whitespace=122, Newline=123, BlockComment=124, LineComment=125;
	public static final int
		RULE_autoStructDeclaration = 0, RULE_autoStructBody = 1, RULE_autoStructAllocation = 2, 
		RULE_deferStatement = 3, RULE_freeStatement = 4, RULE_methodDeclaration = 5, 
		RULE_methodDefinition = 6, RULE_autoCastExpression = 7, RULE_lineDirective = 8, 
		RULE_primaryExpression = 9, RULE_genericSelection = 10, RULE_genericAssociation = 11, 
		RULE_postfixExpression = 12, RULE_argumentExpressionList = 13, RULE_unaryExpression = 14, 
		RULE_unaryOperator = 15, RULE_castExpression = 16, RULE_multiplicativeExpression = 17, 
		RULE_additiveExpression = 18, RULE_shiftExpression = 19, RULE_relationalExpression = 20, 
		RULE_equalityExpression = 21, RULE_binAndExpression = 22, RULE_exclusiveOrExpression = 23, 
		RULE_inclusiveOrExpression = 24, RULE_logicalAndExpression = 25, RULE_logicalOrExpression = 26, 
		RULE_conditionalExpression = 27, RULE_assignmentExpression = 28, RULE_assignmentOperator = 29, 
		RULE_expression = 30, RULE_constantExpression = 31, RULE_declaration = 32, 
		RULE_declarationSpecifiers = 33, RULE_declarationSpecifiers2 = 34, RULE_declarationSpecifier = 35, 
		RULE_initDeclaratorList = 36, RULE_initDeclarator = 37, RULE_storageClassSpecifier = 38, 
		RULE_typeSpecifier = 39, RULE_structOrUnionSpecifier = 40, RULE_structDeclarationList = 41, 
		RULE_structDeclaration = 42, RULE_specifierQualifierList = 43, RULE_structDeclaratorList = 44, 
		RULE_structDeclarator = 45, RULE_enumSpecifier = 46, RULE_enumeratorList = 47, 
		RULE_enumerator = 48, RULE_enumerationConstant = 49, RULE_atomicTypeSpecifier = 50, 
		RULE_typeQualifier = 51, RULE_functionSpecifier = 52, RULE_alignmentSpecifier = 53, 
		RULE_declarator = 54, RULE_directDeclarator = 55, RULE_gccDeclaratorExtension = 56, 
		RULE_gccAsmDeclarator = 57, RULE_gccAttributeSpecifier = 58, RULE_gccAttributeList = 59, 
		RULE_gccAttribute = 60, RULE_pointer = 61, RULE_typeQualifierList = 62, 
		RULE_parameterTypeList = 63, RULE_parameterList = 64, RULE_parameterDeclaration = 65, 
		RULE_identifierList = 66, RULE_typeName = 67, RULE_abstractDeclarator = 68, 
		RULE_directAbstractDeclarator = 69, RULE_typedefName = 70, RULE_initializer = 71, 
		RULE_arrayOrStructInitializer = 72, RULE_initializerList = 73, RULE_initializerListItem = 74, 
		RULE_arrayElementInit = 75, RULE_arrayIndexedInit = 76, RULE_structFieldInit = 77, 
		RULE_staticAssertDeclaration = 78, RULE_statement = 79, RULE_asmStatement = 80, 
		RULE_labeledStatement = 81, RULE_compoundStatement = 82, RULE_blockItem = 83, 
		RULE_expressionStatement = 84, RULE_selectionStatement = 85, RULE_iterationStatement = 86, 
		RULE_forCondition = 87, RULE_forDeclaration = 88, RULE_forExpression = 89, 
		RULE_jumpStatement = 90, RULE_compilationUnit = 91, RULE_topLevelStatement = 92, 
		RULE_externalDeclaration = 93, RULE_functionDefinition = 94, RULE_declarationList = 95, 
		RULE_digitSequence = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"autoStructDeclaration", "autoStructBody", "autoStructAllocation", "deferStatement", 
			"freeStatement", "methodDeclaration", "methodDefinition", "autoCastExpression", 
			"lineDirective", "primaryExpression", "genericSelection", "genericAssociation", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "binAndExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
			"conditionalExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"gccDeclaratorExtension", "gccAsmDeclarator", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "pointer", "typeQualifierList", "parameterTypeList", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "typedefName", "initializer", 
			"arrayOrStructInitializer", "initializerList", "initializerListItem", 
			"arrayElementInit", "arrayIndexedInit", "structFieldInit", "staticAssertDeclaration", 
			"statement", "asmStatement", "labeledStatement", "compoundStatement", 
			"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
			"forCondition", "forDeclaration", "forExpression", "jumpStatement", "compilationUnit", 
			"topLevelStatement", "externalDeclaration", "functionDefinition", "declarationList", 
			"digitSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'defer'", "'free'", "'@'", "'#'", "'__extension__'", 
			"'__builtin_va_arg'", "'__builtin_offsetof'", "'__m128'", "'__m128d'", 
			"'__m128i'", "'__typeof__'", "'__inline__'", "'__stdcall'", "'__declspec'", 
			"'__asm'", "'__asm__'", "'__attribute__'", "'__volatile__'", "'auto'", 
			"'break'", "'case'", "'char'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", "'for'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", "'restrict'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'struct'", 
			"'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", 
			"'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", 
			"'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
			"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
			"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
			"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Auto", "Break", "Case", 
			"Char", "Const", "Continue", "Default", "Do", "Double", "Else", "Enum", 
			"Extern", "Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", 
			"Restrict", "Return", "Short", "Signed", "Sizeof", "Static", "Struct", 
			"Switch", "Typedef", "Union", "Unsigned", "Void", "Volatile", "While", 
			"Alignas", "Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", 
			"Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", "IntegerConstant", 
			"FloatingConstant", "DigitSequence", "CharacterConstant", "StringLiteral", 
			"ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing", 
			"PragmaDirective", "NullDirective", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMieux.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMieuxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AutoStructDeclarationContext extends ParserRuleContext {
		public TerminalNode Auto() { return getToken(CMieuxParser.Auto, 0); }
		public TerminalNode Struct() { return getToken(CMieuxParser.Struct, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public AutoStructBodyContext autoStructBody() {
			return getRuleContext(AutoStructBodyContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public AutoStructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoStructDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAutoStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAutoStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAutoStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoStructDeclarationContext autoStructDeclaration() throws RecognitionException {
		AutoStructDeclarationContext _localctx = new AutoStructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_autoStructDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Auto);
			setState(195);
			match(Struct);
			setState(196);
			match(Identifier);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(197);
				autoStructBody();
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(198);
					match(Semi);
					}
					break;
				}
				}
				break;
			case Semi:
				{
				setState(201);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoStructBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public AutoStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAutoStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAutoStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAutoStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoStructBodyContext autoStructBody() throws RecognitionException {
		AutoStructBodyContext _localctx = new AutoStructBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_autoStructBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LeftBrace);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier) {
				{
				setState(205);
				structDeclarationList();
				}
			}

			setState(208);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoStructAllocationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public AutoStructAllocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoStructAllocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAutoStructAllocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAutoStructAllocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAutoStructAllocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoStructAllocationContext autoStructAllocation() throws RecognitionException {
		AutoStructAllocationContext _localctx = new AutoStructAllocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_autoStructAllocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__0);
			setState(211);
			match(Identifier);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(212);
				match(LeftParen);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(213);
					argumentExpressionList();
					}
				}

				setState(216);
				match(RightParen);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeferStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeferStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__1);
			setState(220);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public FreeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFreeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFreeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFreeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreeStatementContext freeStatement() throws RecognitionException {
		FreeStatementContext _localctx = new FreeStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_freeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__2);
			setState(223);
			match(Identifier);
			setState(224);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(226);
				declarationSpecifiers();
				}
				break;
			}
			setState(229);
			match(Identifier);
			setState(230);
			match(T__3);
			setState(231);
			typeSpecifier(0);
			setState(232);
			match(LeftParen);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(233);
				parameterTypeList();
				}
			}

			setState(236);
			match(RightParen);
			setState(237);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(239);
				declarationSpecifiers();
				}
				break;
			}
			setState(242);
			match(Identifier);
			setState(243);
			match(T__3);
			setState(244);
			typeSpecifier(0);
			setState(245);
			match(LeftParen);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(246);
				parameterTypeList();
				}
			}

			setState(249);
			match(RightParen);
			setState(250);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoCastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AutoCastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCastExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAutoCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAutoCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAutoCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoCastExpressionContext autoCastExpression() throws RecognitionException {
		AutoCastExpressionContext _localctx = new AutoCastExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_autoCastExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LeftParen);
			setState(253);
			match(RightParen);
			setState(254);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineDirectiveContext extends ParserRuleContext {
		public Token line;
		public Token otherNumbers;
		public TerminalNode StringLiteral() { return getToken(CMieuxParser.StringLiteral, 0); }
		public List<TerminalNode> IntegerConstant() { return getTokens(CMieuxParser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(CMieuxParser.IntegerConstant, i);
		}
		public LineDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLineDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLineDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLineDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineDirectiveContext lineDirective() throws RecognitionException {
		LineDirectiveContext _localctx = new LineDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__4);
			setState(257);
			((LineDirectiveContext)_localctx).line = match(IntegerConstant);
			setState(258);
			match(StringLiteral);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IntegerConstant) {
				{
				{
				setState(259);
				((LineDirectiveContext)_localctx).otherNumbers = match(IntegerConstant);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharacterConstantContext extends PrimaryExpressionContext {
		public TerminalNode CharacterConstant() { return getToken(CMieuxParser.CharacterConstant, 0); }
		public CharacterConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends PrimaryExpressionContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public IdentifierContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatingConstantContext extends PrimaryExpressionContext {
		public TerminalNode FloatingConstant() { return getToken(CMieuxParser.FloatingConstant, 0); }
		public FloatingConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFloatingConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFloatingConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFloatingConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public List<TerminalNode> StringLiteral() { return getTokens(CMieuxParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CMieuxParser.StringLiteral, i);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ParenExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends PrimaryExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public BlockContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinOffsetOfContext extends PrimaryExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public BuiltinOffsetOfContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBuiltinOffsetOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBuiltinOffsetOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBuiltinOffsetOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinVaArgContext extends PrimaryExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public BuiltinVaArgContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBuiltinVaArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBuiltinVaArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBuiltinVaArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstantContext extends PrimaryExpressionContext {
		public TerminalNode IntegerConstant() { return getToken(CMieuxParser.IntegerConstant, 0); }
		public IntegerConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericSelectionExpressionContext extends PrimaryExpressionContext {
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public GenericSelectionExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericSelectionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericSelectionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericSelectionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new IntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(IntegerConstant);
				}
				break;
			case 3:
				_localctx = new FloatingConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(FloatingConstant);
				}
				break;
			case 4:
				_localctx = new CharacterConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(CharacterConstant);
				}
				break;
			case 5:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(LeftParen);
				setState(275);
				expression();
				setState(276);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new GenericSelectionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				genericSelection();
				}
				break;
			case 8:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(279);
					match(T__5);
					}
				}

				setState(282);
				match(LeftParen);
				setState(283);
				compoundStatement();
				setState(284);
				match(RightParen);
				}
				break;
			case 9:
				_localctx = new BuiltinVaArgContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				match(T__6);
				setState(287);
				match(LeftParen);
				setState(288);
				unaryExpression();
				setState(289);
				match(Comma);
				setState(290);
				typeName();
				setState(291);
				match(RightParen);
				}
				break;
			case 10:
				_localctx = new BuiltinOffsetOfContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(T__7);
				setState(294);
				match(LeftParen);
				setState(295);
				typeName();
				setState(296);
				match(Comma);
				setState(297);
				unaryExpression();
				setState(298);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation;
		public List<GenericAssociationContext> assocList = new ArrayList<GenericAssociationContext>();
		public TerminalNode Generic() { return getToken(CMieuxParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericSelection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Generic);
			setState(303);
			match(LeftParen);
			setState(304);
			assignmentExpression();
			setState(305);
			match(Comma);
			setState(306);
			((GenericSelectionContext)_localctx).genericAssociation = genericAssociation();
			((GenericSelectionContext)_localctx).assocList.add(((GenericSelectionContext)_localctx).genericAssociation);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(307);
				match(Comma);
				setState(308);
				((GenericSelectionContext)_localctx).genericAssociation = genericAssociation();
				((GenericSelectionContext)_localctx).assocList.add(((GenericSelectionContext)_localctx).genericAssociation);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	 
		public GenericAssociationContext() { }
		public void copyFrom(GenericAssociationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericTypeAssocContext extends GenericAssociationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericTypeAssocContext(GenericAssociationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericTypeAssoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericTypeAssoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericTypeAssoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericDefaultAssocContext extends GenericAssociationContext {
		public TerminalNode Default() { return getToken(CMieuxParser.Default, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericDefaultAssocContext(GenericAssociationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericDefaultAssoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericDefaultAssoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericDefaultAssoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_genericAssociation);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				_localctx = new GenericTypeAssocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				typeName();
				setState(317);
				match(Colon);
				setState(318);
				assignmentExpression();
				}
				break;
			case Default:
				_localctx = new GenericDefaultAssocContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(Default);
				setState(321);
				match(Colon);
				setState(322);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementAfterContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CMieuxParser.PlusPlus, 0); }
		public IncrementAfterContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIncrementAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIncrementAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIncrementAfter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayAccessContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementAfterContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CMieuxParser.MinusMinus, 0); }
		public DecrementAfterContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDecrementAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDecrementAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDecrementAfter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_PrimaryExpressionContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public Postfix_PrimaryExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPostfix_PrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPostfix_PrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPostfix_PrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineStructInitContext extends PostfixExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public InlineStructInitContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInlineStructInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInlineStructInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInlineStructInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCallContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(CMieuxParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public FieldAccessContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineExtensionStructInitContext extends PostfixExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public InlineExtensionStructInitContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInlineExtensionStructInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInlineExtensionStructInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInlineExtensionStructInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAcessPtrContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(CMieuxParser.Arrow, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public FieldAcessPtrContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFieldAcessPtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFieldAcessPtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFieldAcessPtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new Postfix_PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(326);
				primaryExpression();
				}
				break;
			case 2:
				{
				_localctx = new InlineStructInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(LeftParen);
				setState(328);
				typeName();
				setState(329);
				match(RightParen);
				setState(330);
				match(LeftBrace);
				setState(331);
				initializerList();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(332);
					match(Comma);
					}
				}

				setState(335);
				match(RightBrace);
				}
				break;
			case 3:
				{
				_localctx = new InlineExtensionStructInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(T__5);
				setState(338);
				match(LeftParen);
				setState(339);
				typeName();
				setState(340);
				match(RightParen);
				setState(341);
				match(LeftBrace);
				setState(342);
				initializerList();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(343);
					match(Comma);
					}
				}

				setState(346);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(350);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(351);
						match(LeftBracket);
						setState(352);
						expression();
						setState(353);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(355);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(356);
						match(LeftParen);
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(357);
							argumentExpressionList();
							}
						}

						setState(360);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new FieldAccessContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(361);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(362);
						match(Dot);
						setState(363);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new FieldAcessPtrContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(364);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(365);
						match(Arrow);
						setState(366);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new IncrementAfterContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(367);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(368);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new DecrementAfterContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(369);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(370);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression;
		public List<AssignmentExpressionContext> args = new ArrayList<AssignmentExpressionContext>();
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((ArgumentExpressionListContext)_localctx).assignmentExpression = assignmentExpression();
			((ArgumentExpressionListContext)_localctx).args.add(((ArgumentExpressionListContext)_localctx).assignmentExpression);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(377);
				match(Comma);
				setState(378);
				((ArgumentExpressionListContext)_localctx).assignmentExpression = assignmentExpression();
				((ArgumentExpressionListContext)_localctx).args.add(((ArgumentExpressionListContext)_localctx).assignmentExpression);
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecrementBeforeContext extends UnaryExpressionContext {
		public TerminalNode MinusMinus() { return getToken(CMieuxParser.MinusMinus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public DecrementBeforeContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDecrementBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDecrementBefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDecrementBefore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeofExpressionContext extends UnaryExpressionContext {
		public TerminalNode Sizeof() { return getToken(CMieuxParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public SizeofExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSizeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSizeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSizeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlignofExpressionContext extends UnaryExpressionContext {
		public TerminalNode Alignof() { return getToken(CMieuxParser.Alignof, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public AlignofExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAlignofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAlignofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAlignofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelAddressContext extends UnaryExpressionContext {
		public TerminalNode AndAnd() { return getToken(CMieuxParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public LabelAddressContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLabelAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLabelAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLabelAddress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeofUnaryExpressionContext extends UnaryExpressionContext {
		public TerminalNode Sizeof() { return getToken(CMieuxParser.Sizeof, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public SizeofUnaryExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSizeofUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSizeofUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSizeofUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementBeforeContext extends UnaryExpressionContext {
		public TerminalNode PlusPlus() { return getToken(CMieuxParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public IncrementBeforeContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIncrementBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIncrementBefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIncrementBefore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_PostfixExpressionContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public Unary_PostfixExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterUnary_PostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitUnary_PostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitUnary_PostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpAndCastContext extends UnaryExpressionContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryOpAndCastContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterUnaryOpAndCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitUnaryOpAndCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitUnaryOpAndCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryExpression);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Unary_PostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				postfixExpression(0);
				}
				break;
			case 2:
				_localctx = new IncrementBeforeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(PlusPlus);
				setState(386);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new DecrementBeforeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(MinusMinus);
				setState(388);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new UnaryOpAndCastContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				unaryOperator();
				setState(390);
				castExpression();
				}
				break;
			case 5:
				_localctx = new SizeofUnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(Sizeof);
				setState(393);
				unaryExpression();
				}
				break;
			case 6:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				match(Sizeof);
				setState(395);
				match(LeftParen);
				setState(396);
				typeName();
				setState(397);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new AlignofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				match(Alignof);
				setState(400);
				match(LeftParen);
				setState(401);
				typeName();
				setState(402);
				match(RightParen);
				}
				break;
			case 8:
				_localctx = new LabelAddressContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(404);
				match(AndAnd);
				setState(405);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CMieuxParser.And, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CMieuxParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CMieuxParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CMieuxParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CMieuxParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Plus - 76)) | (1L << (Minus - 76)) | (1L << (Star - 76)) | (1L << (And - 76)) | (1L << (Not - 76)) | (1L << (Tilde - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastContext extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtensionCastContext extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExtensionCastContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExtensionCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExtensionCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExtensionCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastDigitSequenceContext extends CastExpressionContext {
		public DigitSequenceContext digitSequence() {
			return getRuleContext(DigitSequenceContext.class,0);
		}
		public CastDigitSequenceContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCastDigitSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCastDigitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCastDigitSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastUnaryExpressionContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastUnaryExpressionContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCastUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCastUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCastUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_castExpression);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(LeftParen);
				setState(411);
				typeName();
				setState(412);
				match(RightParen);
				setState(413);
				castExpression();
				}
				break;
			case 2:
				_localctx = new ExtensionCastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(T__5);
				setState(416);
				match(LeftParen);
				setState(417);
				typeName();
				setState(418);
				match(RightParen);
				setState(419);
				castExpression();
				}
				break;
			case 3:
				_localctx = new CastUnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new CastDigitSequenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				digitSequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mul_CastExpressionContext extends MultiplicativeExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public Mul_CastExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterMul_CastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitMul_CastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitMul_CastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Mod() { return getToken(CMieuxParser.Mod, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ModExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(CMieuxParser.Div, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public DivExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MulExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_CastExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(426);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(428);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(429);
						match(Star);
						setState(430);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(431);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(432);
						match(Div);
						setState(433);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new ModExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(434);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(435);
						match(Mod);
						setState(436);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CMieuxParser.Plus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(CMieuxParser.Minus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public SubExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Add_MulExpressionContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Add_MulExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAdd_MulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAdd_MulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAdd_MulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_MulExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(443);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpressionContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(445);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(446);
						match(Plus);
						setState(447);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubExpressionContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(448);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(449);
						match(Minus);
						setState(450);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LShiftExpressionContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CMieuxParser.LeftShift, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LShiftExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RShiftExpressionContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(CMieuxParser.RightShift, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RShiftExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterRShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitRShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitRShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Shift_AddExpressionContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public Shift_AddExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterShift_AddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitShift_AddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitShift_AddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Shift_AddExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(457);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new LShiftExpressionContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(460);
						match(LeftShift);
						setState(461);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RShiftExpressionContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(462);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(463);
						match(RightShift);
						setState(464);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GTEExpressionContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode GreaterEqual() { return getToken(CMieuxParser.GreaterEqual, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public GTEExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGTEExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGTEExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGTEExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LTEExpressionContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LessEqual() { return getToken(CMieuxParser.LessEqual, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public LTEExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLTEExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLTEExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLTEExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LTExpressionContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CMieuxParser.Less, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public LTExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLTExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLTExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLTExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rel_ShiftExpressionContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Rel_ShiftExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterRel_ShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitRel_ShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitRel_ShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTExpressionContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CMieuxParser.Greater, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public GTExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGTExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGTExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGTExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Rel_ShiftExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(471);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new LTExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(473);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(474);
						match(Less);
						setState(475);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GTExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(476);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(477);
						match(Greater);
						setState(478);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new LTEExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(479);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(480);
						match(LessEqual);
						setState(481);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GTEExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(482);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(483);
						match(GreaterEqual);
						setState(484);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NeqExpressionContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(CMieuxParser.NotEqual, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public NeqExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterNeqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitNeqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitNeqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_RelExpressionContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public Eq_RelExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEq_RelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEq_RelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEq_RelExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CMieuxParser.Equal, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Eq_RelExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(491);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(499);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new EqExpressionContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(493);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(494);
						match(Equal);
						setState(495);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NeqExpressionContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(496);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(497);
						match(NotEqual);
						setState(498);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinAndExpressionContext extends ParserRuleContext {
		public BinAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binAndExpression; }
	 
		public BinAndExpressionContext() { }
		public void copyFrom(BinAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryAndExpressionContext extends BinAndExpressionContext {
		public BinAndExpressionContext binAndExpression() {
			return getRuleContext(BinAndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CMieuxParser.And, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public BinaryAndExpressionContext(BinAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBinaryAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBinaryAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBinaryAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryAnd_EqExpressionContext extends BinAndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public BinaryAnd_EqExpressionContext(BinAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBinaryAnd_EqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBinaryAnd_EqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBinaryAnd_EqExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinAndExpressionContext binAndExpression() throws RecognitionException {
		return binAndExpression(0);
	}

	private BinAndExpressionContext binAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinAndExpressionContext _localctx = new BinAndExpressionContext(_ctx, _parentState);
		BinAndExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_binAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BinaryAnd_EqExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(505);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryAndExpressionContext(new BinAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_binAndExpression);
					setState(507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(508);
					match(And);
					setState(509);
					equalityExpression(0);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XorExpressionContext extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CMieuxParser.Caret, 0); }
		public BinAndExpressionContext binAndExpression() {
			return getRuleContext(BinAndExpressionContext.class,0);
		}
		public XorExpressionContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xor_AndExpressionContext extends ExclusiveOrExpressionContext {
		public BinAndExpressionContext binAndExpression() {
			return getRuleContext(BinAndExpressionContext.class,0);
		}
		public Xor_AndExpressionContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterXor_AndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitXor_AndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitXor_AndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Xor_AndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(516);
			binAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XorExpressionContext(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(518);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(519);
					match(Caret);
					setState(520);
					binAndExpression(0);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryOr_XorExpressionContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public BinaryOr_XorExpressionContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBinaryOr_XorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBinaryOr_XorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBinaryOr_XorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOrExpressionContext extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CMieuxParser.Or, 0); }
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public BinaryOrExpressionContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBinaryOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBinaryOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBinaryOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BinaryOr_XorExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(527);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOrExpressionContext(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(530);
					match(Or);
					setState(531);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpressionContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(CMieuxParser.AndAnd, 0); }
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_BinaryOrExpressionContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public And_BinaryOrExpressionContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAnd_BinaryOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAnd_BinaryOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAnd_BinaryOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_BinaryOrExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(538);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(540);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(541);
					match(AndAnd);
					setState(542);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Or_AndExpressionContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public Or_AndExpressionContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterOr_AndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitOr_AndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitOr_AndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CMieuxParser.OrOr, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public OrExpressionContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Or_AndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(549);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(551);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(552);
					match(OrOr);
					setState(553);
					logicalAndExpression(0);
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CMieuxParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TernaryExpressionContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ternary_OrExpressionContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public Ternary_OrExpressionContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTernary_OrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTernary_OrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTernary_OrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditionalExpression);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new Ternary_OrExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				logicalOrExpression(0);
				}
				break;
			case 2:
				_localctx = new TernaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				logicalOrExpression(0);
				setState(561);
				match(Question);
				setState(562);
				expression();
				setState(563);
				match(Colon);
				setState(564);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AutoStructAllocationContext autoStructAllocation() {
			return getRuleContext(AutoStructAllocationContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DigitSequenceContext digitSequence() {
			return getRuleContext(DigitSequenceContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignmentExpression);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				autoStructAllocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				unaryExpression();
				setState(571);
				assignmentOperator();
				setState(572);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				digitSequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CMieuxParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CMieuxParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CMieuxParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CMieuxParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CMieuxParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CMieuxParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CMieuxParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CMieuxParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CMieuxParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CMieuxParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Assign - 94)) | (1L << (StarAssign - 94)) | (1L << (DivAssign - 94)) | (1L << (ModAssign - 94)) | (1L << (PlusAssign - 94)) | (1L << (MinusAssign - 94)) | (1L << (LeftShiftAssign - 94)) | (1L << (RightShiftAssign - 94)) | (1L << (AndAssign - 94)) | (1L << (XorAssign - 94)) | (1L << (OrAssign - 94)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			assignmentExpression();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(580);
				match(Comma);
				setState(581);
				assignmentExpression();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				declarationSpecifiers();
				setState(590);
				initDeclaratorList();
				setState(591);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				declarationSpecifiers();
				setState(594);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(599);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(602); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclarationSpecifiers2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(604);
				declarationSpecifier();
				}
				}
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declarationSpecifier);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			initDeclarator();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(617);
				match(Comma);
				setState(618);
				initDeclarator();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_initDeclarator);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				declarator();
				setState(626);
				match(Assign);
				setState(627);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CMieuxParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CMieuxParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(CMieuxParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(CMieuxParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CMieuxParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleTypeSpecifierContext extends TypeSpecifierContext {
		public TerminalNode Void() { return getToken(CMieuxParser.Void, 0); }
		public TerminalNode Char() { return getToken(CMieuxParser.Char, 0); }
		public TerminalNode Short() { return getToken(CMieuxParser.Short, 0); }
		public TerminalNode Int() { return getToken(CMieuxParser.Int, 0); }
		public TerminalNode Long() { return getToken(CMieuxParser.Long, 0); }
		public TerminalNode Float() { return getToken(CMieuxParser.Float, 0); }
		public TerminalNode Double() { return getToken(CMieuxParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CMieuxParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CMieuxParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(CMieuxParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(CMieuxParser.Complex, 0); }
		public SimpleTypeSpecifierContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeSpecifier_AtomicContext extends TypeSpecifierContext {
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public TypeSpecifier_AtomicContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeSpecifier_Atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeSpecifier_Atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeSpecifier_Atomic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerTypeSpecifierContext extends TypeSpecifierContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerTypeSpecifierContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPointerTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPointerTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPointerTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeSpecifier_StructOrUnionContext extends TypeSpecifierContext {
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public TypeSpecifier_StructOrUnionContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeSpecifier_StructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeSpecifier_StructOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeSpecifier_StructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeSpecifier_EnumContext extends TypeSpecifierContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifier_EnumContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeSpecifier_Enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeSpecifier_Enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeSpecifier_Enum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofTypeSpecifierContext extends TypeSpecifierContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TypeofTypeSpecifierContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeofTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeofTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeofTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeSpecifier_TypedefNameContext extends TypeSpecifierContext {
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifier_TypedefNameContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeSpecifier_TypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeSpecifier_TypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeSpecifier_TypedefName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtensionTypeSpecifierContext extends TypeSpecifierContext {
		public Token type;
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ExtensionTypeSpecifierContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExtensionTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExtensionTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExtensionTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				_localctx = new SimpleTypeSpecifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(634);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__5:
				{
				_localctx = new ExtensionTypeSpecifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(635);
				match(T__5);
				setState(636);
				match(LeftParen);
				setState(637);
				((ExtensionTypeSpecifierContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
					((ExtensionTypeSpecifierContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(638);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				_localctx = new TypeSpecifier_AtomicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				_localctx = new TypeSpecifier_StructOrUnionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				_localctx = new TypeSpecifier_EnumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(641);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				_localctx = new TypeSpecifier_TypedefNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				typedefName();
				}
				break;
			case T__11:
				{
				_localctx = new TypeofTypeSpecifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				match(T__11);
				setState(644);
				match(LeftParen);
				setState(645);
				constantExpression();
				setState(646);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PointerTypeSpecifierContext(new TypeSpecifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(650);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(651);
					pointer();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	 
		public StructOrUnionSpecifierContext() { }
		public void copyFrom(StructOrUnionSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnionSpecifierContext extends StructOrUnionSpecifierContext {
		public Token name;
		public TerminalNode Union() { return getToken(CMieuxParser.Union, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public UnionSpecifierContext(StructOrUnionSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructSpecifierContext extends StructOrUnionSpecifierContext {
		public Token name;
		public TerminalNode Struct() { return getToken(CMieuxParser.Struct, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public StructSpecifierContext(StructOrUnionSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structOrUnionSpecifier);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Struct:
				_localctx = new StructSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(Struct);
				setState(659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(658);
					((StructSpecifierContext)_localctx).name = match(Identifier);
					}
					break;
				}
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(661);
					match(LeftBrace);
					setState(662);
					structDeclarationList();
					setState(663);
					match(RightBrace);
					}
					break;
				}
				}
				break;
			case Union:
				_localctx = new UnionSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(Union);
				setState(669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(668);
					((UnionSpecifierContext)_localctx).name = match(Identifier);
					}
					break;
				}
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(671);
					match(LeftBrace);
					setState(672);
					structDeclarationList();
					setState(673);
					match(RightBrace);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(679);
				structDeclaration();
				}
				}
				setState(682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structDeclaration);
		int _la;
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				specifierQualifierList();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (Colon - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(685);
					structDeclaratorList();
					}
				}

				setState(688);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(693);
						typeSpecifier(0);
						}
						break;
					case 2:
						{
						setState(694);
						typeQualifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(697); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			structDeclarator();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(700);
				match(Comma);
				setState(701);
				structDeclarator();
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_structDeclarator);
		int _la;
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(708);
					declarator();
					}
				}

				setState(711);
				match(Colon);
				setState(712);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	 
		public EnumSpecifierContext() { }
		public void copyFrom(EnumSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnumContext extends EnumSpecifierContext {
		public TerminalNode Enum() { return getToken(CMieuxParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public EnumContext(EnumSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumTypeContext extends EnumSpecifierContext {
		public TerminalNode Enum() { return getToken(CMieuxParser.Enum, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public EnumTypeContext(EnumSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumSpecifier);
		int _la;
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new EnumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(Enum);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(716);
					match(Identifier);
					}
				}

				setState(719);
				match(LeftBrace);
				setState(720);
				enumeratorList();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(721);
					match(Comma);
					}
				}

				setState(724);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new EnumTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				match(Enum);
				setState(727);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			enumerator();
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(731);
					match(Comma);
					setState(732);
					enumerator();
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumerator);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				enumerationConstant();
				setState(740);
				match(Assign);
				setState(741);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnumerationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(CMieuxParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAtomicTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(Atomic);
			setState(748);
			match(LeftParen);
			setState(749);
			typeName();
			setState(750);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CMieuxParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CMieuxParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CMieuxParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CMieuxParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
	 
		public FunctionSpecifierContext() { }
		public void copyFrom(FunctionSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GCCFunctionAttributeContext extends FunctionSpecifierContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GCCFunctionAttributeContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGCCFunctionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGCCFunctionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGCCFunctionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclSpecAttributeContext extends FunctionSpecifierContext {
		public Token storageInfo;
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public DeclSpecAttributeContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclSpecAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclSpecAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclSpecAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionAttributeContext extends FunctionSpecifierContext {
		public TerminalNode Inline() { return getToken(CMieuxParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CMieuxParser.Noreturn, 0); }
		public FunctionAttributeContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionSpecifier);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case Inline:
			case Noreturn:
				_localctx = new FunctionAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__17:
				_localctx = new GCCFunctionAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				gccAttributeSpecifier();
				}
				break;
			case T__14:
				_localctx = new DeclSpecAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(T__14);
				setState(757);
				match(LeftParen);
				setState(758);
				((DeclSpecAttributeContext)_localctx).storageInfo = match(Identifier);
				setState(759);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CMieuxParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAlignmentSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alignmentSpecifier);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(Alignas);
				setState(763);
				match(LeftParen);
				setState(764);
				typeName();
				setState(765);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(Alignas);
				setState(768);
				match(LeftParen);
				setState(769);
				constantExpression();
				setState(770);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(774);
				pointer();
				}
			}

			setState(777);
			directDeclarator(0);
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(778);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclaratorArgNamesOnlyContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public FunctionDeclaratorArgNamesOnlyContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionDeclaratorArgNamesOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionDeclaratorArgNamesOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionDeclaratorArgNamesOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitFieldContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public DigitSequenceContext digitSequence() {
			return getRuleContext(DigitSequenceContext.class,0);
		}
		public BitFieldContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBitField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBitField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionPointerContext extends DirectDeclaratorContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionPointerContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarator1Context extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArrayDeclarator1Context(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayDeclarator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayDeclarator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayDeclarator1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNameContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public VariableNameContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarator2Context extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public ArrayDeclarator2Context(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayDeclarator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayDeclarator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayDeclarator2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarator3Context extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayDeclarator3Context(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayDeclarator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayDeclarator3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayDeclarator3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarator4Context extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public ArrayDeclarator4Context(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayDeclarator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayDeclarator4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayDeclarator4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenDeclaratorContext extends DirectDeclaratorContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ParenDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParenDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParenDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParenDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclaratorContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public FunctionDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				_localctx = new VariableNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(785);
				match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new ParenDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				match(LeftParen);
				setState(787);
				declarator();
				setState(788);
				match(RightParen);
				}
				break;
			case 3:
				{
				_localctx = new BitFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(790);
				match(Identifier);
				setState(791);
				match(Colon);
				setState(792);
				digitSequence();
				}
				break;
			case 4:
				{
				_localctx = new FunctionPointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(793);
				match(LeftParen);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(794);
					typeSpecifier(0);
					}
				}

				setState(797);
				pointer();
				setState(798);
				directDeclarator(0);
				setState(799);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayDeclarator1Context(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(803);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(804);
						match(LeftBracket);
						setState(806);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(805);
							typeQualifierList();
							}
						}

						setState(809);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(808);
							assignmentExpression();
							}
						}

						setState(811);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new ArrayDeclarator2Context(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(812);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(813);
						match(LeftBracket);
						setState(814);
						match(Static);
						setState(816);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(815);
							typeQualifierList();
							}
						}

						setState(818);
						assignmentExpression();
						setState(819);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new ArrayDeclarator3Context(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(821);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(822);
						match(LeftBracket);
						setState(823);
						typeQualifierList();
						setState(824);
						match(Static);
						setState(825);
						assignmentExpression();
						setState(826);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new ArrayDeclarator4Context(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(828);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(829);
						match(LeftBracket);
						setState(831);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(830);
							typeQualifierList();
							}
						}

						setState(833);
						match(Star);
						setState(834);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new FunctionDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(835);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(836);
						match(LeftParen);
						setState(837);
						parameterTypeList();
						setState(838);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new FunctionDeclaratorArgNamesOnlyContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(840);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(841);
						match(LeftParen);
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(842);
							identifierList();
							}
						}

						setState(845);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public GccAsmDeclaratorContext gccAsmDeclarator() {
			return getRuleContext(GccAsmDeclaratorContext.class,0);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGccDeclaratorExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gccDeclaratorExtension);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				gccAsmDeclarator();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAsmDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CMieuxParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CMieuxParser.StringLiteral, i);
		}
		public GccAsmDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAsmDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGccAsmDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGccAsmDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGccAsmDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAsmDeclaratorContext gccAsmDeclarator() throws RecognitionException {
		GccAsmDeclaratorContext _localctx = new GccAsmDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gccAsmDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(856);
			match(LeftParen);
			setState(858); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(857);
				match(StringLiteral);
				}
				}
				setState(860); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(862);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CMieuxParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CMieuxParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CMieuxParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CMieuxParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGccAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__17);
			setState(865);
			match(LeftParen);
			setState(866);
			match(LeftParen);
			setState(867);
			gccAttributeList();
			setState(868);
			match(RightParen);
			setState(869);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGccAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_gccAttributeList);
		int _la;
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				gccAttribute();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(872);
					match(Comma);
					setState(873);
					gccAttribute();
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public Token identifierOrReservedWord;
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CMieuxParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CMieuxParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CMieuxParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CMieuxParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGccAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_gccAttribute);
		int _la;
		try {
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case IntegerConstant:
			case FloatingConstant:
			case DigitSequence:
			case CharacterConstant:
			case StringLiteral:
			case ComplexDefine:
			case IncludeDirective:
			case AsmBlock:
			case LineAfterPreprocessing:
			case PragmaDirective:
			case NullDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				((GccAttributeContext)_localctx).identifierOrReservedWord = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (RightParen - 64)) | (1L << (Comma - 64)))) != 0)) ) {
					((GccAttributeContext)_localctx).identifierOrReservedWord = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(883);
					match(LeftParen);
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(884);
						argumentExpressionList();
						}
					}

					setState(887);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	 
		public PointerContext() { }
		public void copyFrom(PointerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockPointerComponentContext extends PointerContext {
		public TerminalNode Caret() { return getToken(CMieuxParser.Caret, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public BlockPointerComponentContext(PointerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBlockPointerComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBlockPointerComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBlockPointerComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerComponentContext extends PointerContext {
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerComponentContext(PointerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPointerComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPointerComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPointerComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pointer);
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				_localctx = new PointerComponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				match(Star);
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(894);
					typeQualifierList();
					}
					break;
				}
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(897);
					pointer();
					}
					break;
				}
				}
				break;
			case Caret:
				_localctx = new BlockPointerComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(Caret);
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(901);
					typeQualifierList();
					}
					break;
				}
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(904);
					pointer();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(909);
					typeQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(912); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	 
		public ParameterTypeListContext() { }
		public void copyFrom(ParameterTypeListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleParameterListContext extends ParameterTypeListContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public SimpleParameterListContext(ParameterTypeListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSimpleParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSimpleParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSimpleParameterList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarArgParameterListContext extends ParameterTypeListContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CMieuxParser.Ellipsis, 0); }
		public VarArgParameterListContext(ParameterTypeListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterVarArgParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitVarArgParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitVarArgParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameterTypeList);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new SimpleParameterListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				parameterList();
				}
				break;
			case 2:
				_localctx = new VarArgParameterListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				parameterList();
				setState(916);
				match(Comma);
				setState(917);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			parameterDeclaration();
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					match(Comma);
					setState(923);
					parameterDeclaration();
					}
					} 
				}
				setState(928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	 
		public ParameterDeclarationContext() { }
		public void copyFrom(ParameterDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbstractParameterDeclarationContext extends ParameterDeclarationContext {
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public AbstractParameterDeclarationContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAbstractParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAbstractParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAbstractParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleParameterDeclarationContext extends ParameterDeclarationContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public SimpleParameterDeclarationContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSimpleParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSimpleParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSimpleParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterDeclaration);
		int _la;
		try {
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new SimpleParameterDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				declarationSpecifiers();
				setState(930);
				declarator();
				}
				break;
			case 2:
				_localctx = new AbstractParameterDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				declarationSpecifiers2();
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)))) != 0)) {
					{
					setState(933);
					abstractDeclarator();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> identifiers = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(CMieuxParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CMieuxParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			((IdentifierListContext)_localctx).Identifier = match(Identifier);
			((IdentifierListContext)_localctx).identifiers.add(((IdentifierListContext)_localctx).Identifier);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(939);
				match(Comma);
				setState(940);
				((IdentifierListContext)_localctx).Identifier = match(Identifier);
				((IdentifierListContext)_localctx).identifiers.add(((IdentifierListContext)_localctx).Identifier);
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			specifierQualifierList();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)))) != 0)) {
				{
				setState(947);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_abstractDeclarator);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(951);
					pointer();
					}
				}

				setState(954);
				directAbstractDeclarator(0);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
					{
					{
					setState(955);
					gccDeclaratorExtension();
					}
					}
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	 
		public DirectAbstractDeclaratorContext() { }
		public void copyFrom(DirectAbstractDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAbstractDeclarator4Context extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayAbstractDeclarator4Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator5Context extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArrayAbstractDeclarator5Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator6Context extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public ArrayAbstractDeclarator6Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionAbstractDeclarator2Context extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public FunctionAbstractDeclarator2Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionAbstractDeclarator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionAbstractDeclarator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionAbstractDeclarator2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionAbstractDeclarator1Context extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public FunctionAbstractDeclarator1Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionAbstractDeclarator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionAbstractDeclarator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionAbstractDeclarator1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator7Context extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayAbstractDeclarator7Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator8Context extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayAbstractDeclarator8Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenAbstractDeclaratorContext extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public ParenAbstractDeclaratorContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParenAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParenAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParenAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator1Context extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArrayAbstractDeclarator1Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator2Context extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public ArrayAbstractDeclarator2Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAbstractDeclarator3Context extends DirectAbstractDeclaratorContext {
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArrayAbstractDeclarator3Context(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayAbstractDeclarator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayAbstractDeclarator3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayAbstractDeclarator3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				_localctx = new ParenAbstractDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(964);
				match(LeftParen);
				setState(965);
				abstractDeclarator();
				setState(966);
				match(RightParen);
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(967);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(972);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new ArrayAbstractDeclarator1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(973);
				match(LeftBracket);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(974);
					typeQualifierList();
					}
				}

				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(977);
					assignmentExpression();
					}
				}

				setState(980);
				match(RightBracket);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAbstractDeclarator2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(981);
				match(LeftBracket);
				setState(982);
				match(Static);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(983);
					typeQualifierList();
					}
				}

				setState(986);
				assignmentExpression();
				setState(987);
				match(RightBracket);
				}
				break;
			case 4:
				{
				_localctx = new ArrayAbstractDeclarator3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(989);
				match(LeftBracket);
				setState(990);
				typeQualifierList();
				setState(991);
				match(Static);
				setState(992);
				assignmentExpression();
				setState(993);
				match(RightBracket);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAbstractDeclarator4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995);
				match(LeftBracket);
				setState(996);
				match(Star);
				setState(997);
				match(RightBracket);
				}
				break;
			case 6:
				{
				_localctx = new FunctionAbstractDeclarator1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(998);
				match(LeftParen);
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(999);
					parameterTypeList();
					}
				}

				setState(1002);
				match(RightParen);
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1003);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1052);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAbstractDeclarator5Context(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1011);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1012);
						match(LeftBracket);
						setState(1014);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1013);
							typeQualifierList();
							}
						}

						setState(1017);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(1016);
							assignmentExpression();
							}
						}

						setState(1019);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAbstractDeclarator6Context(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1020);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1021);
						match(LeftBracket);
						setState(1022);
						match(Static);
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1023);
							typeQualifierList();
							}
						}

						setState(1026);
						assignmentExpression();
						setState(1027);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new ArrayAbstractDeclarator7Context(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1029);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1030);
						match(LeftBracket);
						setState(1031);
						typeQualifierList();
						setState(1032);
						match(Static);
						setState(1033);
						assignmentExpression();
						setState(1034);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new ArrayAbstractDeclarator8Context(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1036);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1037);
						match(LeftBracket);
						setState(1038);
						match(Star);
						setState(1039);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new FunctionAbstractDeclarator2Context(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1040);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1041);
						match(LeftParen);
						setState(1043);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(1042);
							parameterTypeList();
							}
						}

						setState(1045);
						match(RightParen);
						setState(1049);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1046);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1051);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AutoCastExpressionContext autoCastExpression() {
			return getRuleContext(AutoCastExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArrayOrStructInitializerContext arrayOrStructInitializer() {
			return getRuleContext(ArrayOrStructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_initializer);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				autoCastExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
				arrayOrStructInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayOrStructInitializerContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public ArrayOrStructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOrStructInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayOrStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayOrStructInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayOrStructInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOrStructInitializerContext arrayOrStructInitializer() throws RecognitionException {
		ArrayOrStructInitializerContext _localctx = new ArrayOrStructInitializerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arrayOrStructInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(LeftBrace);
			setState(1065);
			initializerList();
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1066);
				match(Comma);
				}
			}

			setState(1069);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerListItemContext> initializerListItem() {
			return getRuleContexts(InitializerListItemContext.class);
		}
		public InitializerListItemContext initializerListItem(int i) {
			return getRuleContext(InitializerListItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			initializerListItem();
			setState(1076);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072);
					match(Comma);
					setState(1073);
					initializerListItem();
					}
					} 
				}
				setState(1078);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListItemContext extends ParserRuleContext {
		public ArrayElementInitContext arrayElementInit() {
			return getRuleContext(ArrayElementInitContext.class,0);
		}
		public ArrayIndexedInitContext arrayIndexedInit() {
			return getRuleContext(ArrayIndexedInitContext.class,0);
		}
		public StructFieldInitContext structFieldInit() {
			return getRuleContext(StructFieldInitContext.class,0);
		}
		public InitializerListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInitializerListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInitializerListItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInitializerListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListItemContext initializerListItem() throws RecognitionException {
		InitializerListItemContext _localctx = new InitializerListItemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_initializerListItem);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case LeftBrace:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case IntegerConstant:
			case FloatingConstant:
			case DigitSequence:
			case CharacterConstant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				arrayElementInit();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1080);
				arrayIndexedInit();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				structFieldInit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementInitContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ArrayElementInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayElementInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayElementInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayElementInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementInitContext arrayElementInit() throws RecognitionException {
		ArrayElementInitContext _localctx = new ArrayElementInitContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arrayElementInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexedInitContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression;
		public List<ConstantExpressionContext> indexes = new ArrayList<ConstantExpressionContext>();
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CMieuxParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CMieuxParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CMieuxParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CMieuxParser.RightBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public ArrayIndexedInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexedInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterArrayIndexedInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitArrayIndexedInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitArrayIndexedInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexedInitContext arrayIndexedInit() throws RecognitionException {
		ArrayIndexedInitContext _localctx = new ArrayIndexedInitContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arrayIndexedInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1086);
				match(LeftBracket);
				setState(1087);
				((ArrayIndexedInitContext)_localctx).constantExpression = constantExpression();
				((ArrayIndexedInitContext)_localctx).indexes.add(((ArrayIndexedInitContext)_localctx).constantExpression);
				setState(1088);
				match(RightBracket);
				}
				}
				setState(1092); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket );
			setState(1094);
			match(Assign);
			setState(1095);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructFieldInitContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> fields = new ArrayList<Token>();
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(CMieuxParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CMieuxParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CMieuxParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CMieuxParser.Identifier, i);
		}
		public StructFieldInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructFieldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructFieldInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructFieldInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldInitContext structFieldInit() throws RecognitionException {
		StructFieldInitContext _localctx = new StructFieldInitContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structFieldInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1097);
				match(Dot);
				setState(1098);
				((StructFieldInitContext)_localctx).Identifier = match(Identifier);
				((StructFieldInitContext)_localctx).fields.add(((StructFieldInitContext)_localctx).Identifier);
				}
				}
				setState(1101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Dot );
			setState(1103);
			match(Assign);
			setState(1104);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(CMieuxParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CMieuxParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CMieuxParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(StaticAssert);
			setState(1107);
			match(LeftParen);
			setState(1108);
			constantExpression();
			setState(1109);
			match(Comma);
			setState(1111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1110);
				match(StringLiteral);
				}
				}
				setState(1113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1115);
			match(RightParen);
			setState(1116);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public FreeStatementContext freeStatement() {
			return getRuleContext(FreeStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public AsmStatementContext asmStatement() {
			return getRuleContext(AsmStatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_statement);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				deferStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				freeStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				labeledStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1121);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1122);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1123);
				selectionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1124);
				iterationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1125);
				jumpStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1126);
				asmStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1127);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmStatementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(CMieuxParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(CMieuxParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CMieuxParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public AsmStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAsmStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAsmStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAsmStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmStatementContext asmStatement() throws RecognitionException {
		AsmStatementContext _localctx = new AsmStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_asmStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1131);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1132);
			match(LeftParen);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(1133);
				logicalOrExpression(0);
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1134);
					match(Comma);
					setState(1135);
					logicalOrExpression(0);
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1143);
				match(Colon);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1144);
					logicalOrExpression(0);
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1145);
						match(Comma);
						setState(1146);
						logicalOrExpression(0);
						}
						}
						setState(1151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			match(RightParen);
			setState(1160);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	 
		public LabeledStatementContext() { }
		public void copyFrom(LabeledStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LabelContext extends LabeledStatementContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelContext(LabeledStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseLabelContext extends LabeledStatementContext {
		public TerminalNode Case() { return getToken(CMieuxParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseLabelContext(LabeledStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseDefaultLabelContext extends LabeledStatementContext {
		public TerminalNode Default() { return getToken(CMieuxParser.Default, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseDefaultLabelContext(LabeledStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCaseDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCaseDefaultLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCaseDefaultLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_labeledStatement);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				match(Identifier);
				setState(1163);
				match(Colon);
				setState(1164);
				statement();
				}
				break;
			case Case:
				_localctx = new CaseLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				match(Case);
				setState(1166);
				constantExpression();
				setState(1167);
				match(Colon);
				setState(1168);
				statement();
				}
				break;
			case Default:
				_localctx = new CaseDefaultLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				match(Default);
				setState(1171);
				match(Colon);
				setState(1172);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(LeftBrace);
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(1176);
				blockItem();
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1182);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_blockItem);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			expression();
			setState(1189);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CMieuxParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CMieuxParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CMieuxParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_selectionStatement);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				match(If);
				setState(1192);
				match(LeftParen);
				setState(1193);
				expression();
				setState(1194);
				match(RightParen);
				setState(1195);
				statement();
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1196);
					match(Else);
					setState(1197);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(Switch);
				setState(1201);
				match(LeftParen);
				setState(1202);
				expression();
				setState(1203);
				match(RightParen);
				setState(1204);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CMieuxParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CMieuxParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public TerminalNode For() { return getToken(CMieuxParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_iterationStatement);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				match(While);
				setState(1209);
				match(LeftParen);
				setState(1210);
				expression();
				setState(1211);
				match(RightParen);
				setState(1212);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				match(Do);
				setState(1215);
				statement();
				setState(1216);
				match(While);
				setState(1217);
				match(LeftParen);
				setState(1218);
				expression();
				setState(1219);
				match(RightParen);
				setState(1220);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				match(For);
				setState(1223);
				match(LeftParen);
				setState(1224);
				forCondition();
				setState(1225);
				match(RightParen);
				setState(1226);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(CMieuxParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CMieuxParser.Semi, i);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forCondition);
		int _la;
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				forDeclaration();
				setState(1231);
				match(Semi);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1232);
					forExpression();
					}
				}

				setState(1235);
				match(Semi);
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1236);
					forExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1239);
					expression();
					}
				}

				setState(1242);
				match(Semi);
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1243);
					forExpression();
					}
				}

				setState(1246);
				match(Semi);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1247);
					forExpression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			declarationSpecifiers();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1253);
				initDeclaratorList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CMieuxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CMieuxParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			assignmentExpression();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1257);
				match(Comma);
				setState(1258);
				assignmentExpression();
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(CMieuxParser.Break, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(CMieuxParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public GotoStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends JumpStatementContext {
		public TerminalNode Return() { return getToken(CMieuxParser.Return, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GCCDynamicGotoStatementContext extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(CMieuxParser.Goto, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public GCCDynamicGotoStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGCCDynamicGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGCCDynamicGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGCCDynamicGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(CMieuxParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_jumpStatement);
		int _la;
		try {
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(Goto);
				setState(1265);
				match(Identifier);
				setState(1266);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				match(Continue);
				setState(1268);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(Break);
				setState(1270);
				match(Semi);
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1271);
				match(Return);
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (CharacterConstant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1272);
					expression();
					}
				}

				setState(1275);
				match(Semi);
				}
				break;
			case 5:
				_localctx = new GCCDynamicGotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1276);
				match(Goto);
				setState(1277);
				unaryExpression();
				setState(1278);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CMieuxParser.EOF, 0); }
		public List<TopLevelStatementContext> topLevelStatement() {
			return getRuleContexts(TopLevelStatementContext.class);
		}
		public TopLevelStatementContext topLevelStatement(int i) {
			return getRuleContext(TopLevelStatementContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(CMieuxParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CMieuxParser.Semi, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__17:
				case Auto:
				case Char:
				case Const:
				case Double:
				case Enum:
				case Extern:
				case Float:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Short:
				case Signed:
				case Static:
				case Struct:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case Alignas:
				case Atomic:
				case Bool:
				case Complex:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftParen:
				case Star:
				case Caret:
				case Identifier:
					{
					setState(1282);
					topLevelStatement();
					}
					break;
				case Semi:
					{
					setState(1283);
					match(Semi);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelStatementContext extends ParserRuleContext {
		public LineDirectiveContext lineDirective() {
			return getRuleContext(LineDirectiveContext.class,0);
		}
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TopLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTopLevelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTopLevelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTopLevelStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelStatementContext topLevelStatement() throws RecognitionException {
		TopLevelStatementContext _localctx = new TopLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_topLevelStatement);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				lineDirective();
				}
				break;
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__17:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftParen:
			case Star:
			case Caret:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				externalDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public AutoStructDeclarationContext autoStructDeclaration() {
			return getRuleContext(AutoStructDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_externalDeclaration);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				autoStructDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				methodDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1298);
				methodDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1299);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1302);
				declarationSpecifiers();
				}
				break;
			}
			setState(1305);
			declarator();
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1306);
				declarationList();
				}
			}

			setState(1309);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1311);
				declaration();
				}
				}
				setState(1314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitSequenceContext extends ParserRuleContext {
		public TerminalNode DigitSequence() { return getToken(CMieuxParser.DigitSequence, 0); }
		public DigitSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDigitSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDigitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDigitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitSequenceContext digitSequence() throws RecognitionException {
		DigitSequenceContext _localctx = new DigitSequenceContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_digitSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(DigitSequence);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 17:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 18:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 19:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 20:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 21:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 22:
			return binAndExpression_sempred((BinAndExpressionContext)_localctx, predIndex);
		case 23:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 24:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 25:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 26:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 39:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 55:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 69:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean binAndExpression_sempred(BinAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 8);
		case 26:
			return precpred(_ctx, 7);
		case 27:
			return precpred(_ctx, 6);
		case 28:
			return precpred(_ctx, 5);
		case 29:
			return precpred(_ctx, 4);
		case 30:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 5);
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		case 34:
			return precpred(_ctx, 2);
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u0529\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\5\2\u00ca\n\2\3\2\5\2\u00cd\n\2\3"+
		"\3\3\3\5\3\u00d1\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00d9\n\4\3\4\5\4\u00dc"+
		"\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\5\7\u00e6\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00ed\n\7\3\7\3\7\3\7\3\b\5\b\u00f3\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fa"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0107\n\n\f\n\16"+
		"\n\u010a\13\n\3\13\3\13\3\13\3\13\3\13\6\13\u0111\n\13\r\13\16\13\u0112"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011b\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u012f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0138\n\f\f\f\16\f\u013b\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0146\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0150\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u015b\n\16\3\16\3\16\5\16\u015f\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0169\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0176\n\16\f\16\16\16\u0179\13\16"+
		"\3\17\3\17\3\17\7\17\u017e\n\17\f\17\16\17\u0181\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0199\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01aa\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b8\n\23\f\23"+
		"\16\23\u01bb\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01c6"+
		"\n\24\f\24\16\24\u01c9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u01d4\n\25\f\25\16\25\u01d7\13\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01e8\n\26\f\26"+
		"\16\26\u01eb\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01f6"+
		"\n\27\f\27\16\27\u01f9\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0201"+
		"\n\30\f\30\16\30\u0204\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u020c"+
		"\n\31\f\31\16\31\u020f\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0217"+
		"\n\32\f\32\16\32\u021a\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0222"+
		"\n\33\f\33\16\33\u0225\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u022d"+
		"\n\34\f\34\16\34\u0230\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0239"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0242\n\36\3\37\3\37\3 "+
		"\3 \3 \7 \u0249\n \f \16 \u024c\13 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0258\n\"\3#\6#\u025b\n#\r#\16#\u025c\3$\6$\u0260\n$\r$\16$\u0261"+
		"\3%\3%\3%\3%\3%\5%\u0269\n%\3&\3&\3&\7&\u026e\n&\f&\16&\u0271\13&\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0278\n\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\5)\u028b\n)\3)\3)\7)\u028f\n)\f)\16)\u0292\13)\3*\3*\5*\u0296"+
		"\n*\3*\3*\3*\3*\5*\u029c\n*\3*\3*\5*\u02a0\n*\3*\3*\3*\3*\5*\u02a6\n*"+
		"\5*\u02a8\n*\3+\6+\u02ab\n+\r+\16+\u02ac\3,\3,\5,\u02b1\n,\3,\3,\3,\5"+
		",\u02b6\n,\3-\3-\6-\u02ba\n-\r-\16-\u02bb\3.\3.\3.\7.\u02c1\n.\f.\16."+
		"\u02c4\13.\3/\3/\5/\u02c8\n/\3/\3/\5/\u02cc\n/\3\60\3\60\5\60\u02d0\n"+
		"\60\3\60\3\60\3\60\5\60\u02d5\n\60\3\60\3\60\3\60\3\60\5\60\u02db\n\60"+
		"\3\61\3\61\3\61\7\61\u02e0\n\61\f\61\16\61\u02e3\13\61\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u02ea\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02fb\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0307\n\67\38\58\u030a\n8\38\38\78\u030e"+
		"\n8\f8\168\u0311\138\39\39\39\39\39\39\39\39\39\39\39\59\u031e\n9\39\3"+
		"9\39\39\59\u0324\n9\39\39\39\59\u0329\n9\39\59\u032c\n9\39\39\39\39\3"+
		"9\59\u0333\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0342\n9\39\3"+
		"9\39\39\39\39\39\39\39\39\59\u034e\n9\39\79\u0351\n9\f9\169\u0354\139"+
		"\3:\3:\5:\u0358\n:\3;\3;\3;\6;\u035d\n;\r;\16;\u035e\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\7=\u036d\n=\f=\16=\u0370\13=\3=\5=\u0373\n=\3>\3>"+
		"\3>\5>\u0378\n>\3>\5>\u037b\n>\3>\5>\u037e\n>\3?\3?\5?\u0382\n?\3?\5?"+
		"\u0385\n?\3?\3?\5?\u0389\n?\3?\5?\u038c\n?\5?\u038e\n?\3@\6@\u0391\n@"+
		"\r@\16@\u0392\3A\3A\3A\3A\3A\5A\u039a\nA\3B\3B\3B\7B\u039f\nB\fB\16B\u03a2"+
		"\13B\3C\3C\3C\3C\3C\5C\u03a9\nC\5C\u03ab\nC\3D\3D\3D\7D\u03b0\nD\fD\16"+
		"D\u03b3\13D\3E\3E\5E\u03b7\nE\3F\3F\5F\u03bb\nF\3F\3F\7F\u03bf\nF\fF\16"+
		"F\u03c2\13F\5F\u03c4\nF\3G\3G\3G\3G\3G\7G\u03cb\nG\fG\16G\u03ce\13G\3"+
		"G\3G\5G\u03d2\nG\3G\5G\u03d5\nG\3G\3G\3G\3G\5G\u03db\nG\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03eb\nG\3G\3G\7G\u03ef\nG\fG\16G\u03f2"+
		"\13G\5G\u03f4\nG\3G\3G\3G\5G\u03f9\nG\3G\5G\u03fc\nG\3G\3G\3G\3G\3G\5"+
		"G\u0403\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0416"+
		"\nG\3G\3G\7G\u041a\nG\fG\16G\u041d\13G\7G\u041f\nG\fG\16G\u0422\13G\3"+
		"H\3H\3I\3I\3I\5I\u0429\nI\3J\3J\3J\5J\u042e\nJ\3J\3J\3K\3K\3K\7K\u0435"+
		"\nK\fK\16K\u0438\13K\3L\3L\3L\5L\u043d\nL\3M\3M\3N\3N\3N\3N\6N\u0445\n"+
		"N\rN\16N\u0446\3N\3N\3N\3O\3O\6O\u044e\nO\rO\16O\u044f\3O\3O\3O\3P\3P"+
		"\3P\3P\3P\6P\u045a\nP\rP\16P\u045b\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u046b\nQ\3R\3R\3R\3R\3R\3R\7R\u0473\nR\fR\16R\u0476\13R\5R\u0478"+
		"\nR\3R\3R\3R\3R\7R\u047e\nR\fR\16R\u0481\13R\5R\u0483\nR\7R\u0485\nR\f"+
		"R\16R\u0488\13R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0498\nS"+
		"\3T\3T\7T\u049c\nT\fT\16T\u049f\13T\3T\3T\3U\3U\5U\u04a5\nU\3V\3V\3V\3"+
		"W\3W\3W\3W\3W\3W\3W\5W\u04b1\nW\3W\3W\3W\3W\3W\3W\5W\u04b9\nW\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04cf\nX\3Y\3"+
		"Y\3Y\5Y\u04d4\nY\3Y\3Y\5Y\u04d8\nY\3Y\5Y\u04db\nY\3Y\3Y\5Y\u04df\nY\3"+
		"Y\3Y\5Y\u04e3\nY\5Y\u04e5\nY\3Z\3Z\5Z\u04e9\nZ\3[\3[\3[\7[\u04ee\n[\f"+
		"[\16[\u04f1\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04fc\n\\\3\\"+
		"\3\\\3\\\3\\\3\\\5\\\u0503\n\\\3]\3]\7]\u0507\n]\f]\16]\u050a\13]\3]\3"+
		"]\3^\3^\5^\u0510\n^\3_\3_\3_\3_\3_\5_\u0517\n_\3`\5`\u051a\n`\3`\3`\5"+
		"`\u051e\n`\3`\3`\3a\6a\u0523\na\ra\16a\u0524\3b\3b\3b\2\20\32$&(*,.\60"+
		"\62\64\66Pp\u008cc\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\f\7\2NNPPRRUUZ[\3\2`j\b\2\26\26"+
		"!!))//\62\62AA\n\2\13\r\31\31\36\36\"\"\'(,-\64\65;<\3\2\13\r\6\2\32\32"+
		"**\66\66::\5\2\17\20&&??\3\2\22\23\4\2BC__\4\2\25\25\66\66\2\u05a3\2\u00c4"+
		"\3\2\2\2\4\u00ce\3\2\2\2\6\u00d4\3\2\2\2\b\u00dd\3\2\2\2\n\u00e0\3\2\2"+
		"\2\f\u00e5\3\2\2\2\16\u00f2\3\2\2\2\20\u00fe\3\2\2\2\22\u0102\3\2\2\2"+
		"\24\u012e\3\2\2\2\26\u0130\3\2\2\2\30\u0145\3\2\2\2\32\u015e\3\2\2\2\34"+
		"\u017a\3\2\2\2\36\u0198\3\2\2\2 \u019a\3\2\2\2\"\u01a9\3\2\2\2$\u01ab"+
		"\3\2\2\2&\u01bc\3\2\2\2(\u01ca\3\2\2\2*\u01d8\3\2\2\2,\u01ec\3\2\2\2."+
		"\u01fa\3\2\2\2\60\u0205\3\2\2\2\62\u0210\3\2\2\2\64\u021b\3\2\2\2\66\u0226"+
		"\3\2\2\28\u0238\3\2\2\2:\u0241\3\2\2\2<\u0243\3\2\2\2>\u0245\3\2\2\2@"+
		"\u024d\3\2\2\2B\u0257\3\2\2\2D\u025a\3\2\2\2F\u025f\3\2\2\2H\u0268\3\2"+
		"\2\2J\u026a\3\2\2\2L\u0277\3\2\2\2N\u0279\3\2\2\2P\u028a\3\2\2\2R\u02a7"+
		"\3\2\2\2T\u02aa\3\2\2\2V\u02b5\3\2\2\2X\u02b9\3\2\2\2Z\u02bd\3\2\2\2\\"+
		"\u02cb\3\2\2\2^\u02da\3\2\2\2`\u02dc\3\2\2\2b\u02e9\3\2\2\2d\u02eb\3\2"+
		"\2\2f\u02ed\3\2\2\2h\u02f2\3\2\2\2j\u02fa\3\2\2\2l\u0306\3\2\2\2n\u0309"+
		"\3\2\2\2p\u0323\3\2\2\2r\u0357\3\2\2\2t\u0359\3\2\2\2v\u0362\3\2\2\2x"+
		"\u0372\3\2\2\2z\u037d\3\2\2\2|\u038d\3\2\2\2~\u0390\3\2\2\2\u0080\u0399"+
		"\3\2\2\2\u0082\u039b\3\2\2\2\u0084\u03aa\3\2\2\2\u0086\u03ac\3\2\2\2\u0088"+
		"\u03b4\3\2\2\2\u008a\u03c3\3\2\2\2\u008c\u03f3\3\2\2\2\u008e\u0423\3\2"+
		"\2\2\u0090\u0428\3\2\2\2\u0092\u042a\3\2\2\2\u0094\u0431\3\2\2\2\u0096"+
		"\u043c\3\2\2\2\u0098\u043e\3\2\2\2\u009a\u0444\3\2\2\2\u009c\u044d\3\2"+
		"\2\2\u009e\u0454\3\2\2\2\u00a0\u046a\3\2\2\2\u00a2\u046c\3\2\2\2\u00a4"+
		"\u0497\3\2\2\2\u00a6\u0499\3\2\2\2\u00a8\u04a4\3\2\2\2\u00aa\u04a6\3\2"+
		"\2\2\u00ac\u04b8\3\2\2\2\u00ae\u04ce\3\2\2\2\u00b0\u04e4\3\2\2\2\u00b2"+
		"\u04e6\3\2\2\2\u00b4\u04ea\3\2\2\2\u00b6\u0502\3\2\2\2\u00b8\u0508\3\2"+
		"\2\2\u00ba\u050f\3\2\2\2\u00bc\u0516\3\2\2\2\u00be\u0519\3\2\2\2\u00c0"+
		"\u0522\3\2\2\2\u00c2\u0526\3\2\2\2\u00c4\u00c5\7\26\2\2\u00c5\u00c6\7"+
		"\60\2\2\u00c6\u00cc\7p\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00ca\7^\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\7^"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\3\3\2\2\2\u00ce\u00d0"+
		"\7F\2\2\u00cf\u00d1\5T+\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\7G\2\2\u00d3\5\3\2\2\2\u00d4\u00d5\7\3\2\2"+
		"\u00d5\u00db\7p\2\2\u00d6\u00d8\7B\2\2\u00d7\u00d9\5\34\17\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7C\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\7\3\2\2\2\u00dd\u00de\7\4\2\2"+
		"\u00de\u00df\5\u00a0Q\2\u00df\t\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7^\2\2\u00e3\13\3\2\2\2\u00e4\u00e6\5D#\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7\6\2\2\u00e9\u00ea\5P)\2\u00ea\u00ec\7B\2\2\u00eb\u00ed\5\u0080"+
		"A\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7C\2\2\u00ef\u00f0\7^\2\2\u00f0\r\3\2\2\2\u00f1\u00f3\5D#\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7p"+
		"\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5P)\2\u00f7\u00f9\7B\2\2\u00f8\u00fa"+
		"\5\u0080A\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2"+
		"\2\u00fb\u00fc\7C\2\2\u00fc\u00fd\5\u00a6T\2\u00fd\17\3\2\2\2\u00fe\u00ff"+
		"\7B\2\2\u00ff\u0100\7C\2\2\u0100\u0101\5:\36\2\u0101\21\3\2\2\2\u0102"+
		"\u0103\7\7\2\2\u0103\u0104\7q\2\2\u0104\u0108\7u\2\2\u0105\u0107\7q\2"+
		"\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\23\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u012f\7p\2\2\u010c"+
		"\u012f\7q\2\2\u010d\u012f\7r\2\2\u010e\u012f\7t\2\2\u010f\u0111\7u\2\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u012f\3\2\2\2\u0114\u0115\7B\2\2\u0115\u0116\5> \2\u0116"+
		"\u0117\7C\2\2\u0117\u012f\3\2\2\2\u0118\u012f\5\26\f\2\u0119\u011b\7\b"+
		"\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7B\2\2\u011d\u011e\5\u00a6T\2\u011e\u011f\7C\2\2\u011f\u012f\3"+
		"\2\2\2\u0120\u0121\7\t\2\2\u0121\u0122\7B\2\2\u0122\u0123\5\36\20\2\u0123"+
		"\u0124\7_\2\2\u0124\u0125\5\u0088E\2\u0125\u0126\7C\2\2\u0126\u012f\3"+
		"\2\2\2\u0127\u0128\7\n\2\2\u0128\u0129\7B\2\2\u0129\u012a\5\u0088E\2\u012a"+
		"\u012b\7_\2\2\u012b\u012c\5\36\20\2\u012c\u012d\7C\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u010b\3\2\2\2\u012e\u010c\3\2\2\2\u012e\u010d\3\2\2\2\u012e"+
		"\u010e\3\2\2\2\u012e\u0110\3\2\2\2\u012e\u0114\3\2\2\2\u012e\u0118\3\2"+
		"\2\2\u012e\u011a\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0127\3\2\2\2\u012f"+
		"\25\3\2\2\2\u0130\u0131\7=\2\2\u0131\u0132\7B\2\2\u0132\u0133\5:\36\2"+
		"\u0133\u0134\7_\2\2\u0134\u0139\5\30\r\2\u0135\u0136\7_\2\2\u0136\u0138"+
		"\5\30\r\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d"+
		"\7C\2\2\u013d\27\3\2\2\2\u013e\u013f\5\u0088E\2\u013f\u0140\7]\2\2\u0140"+
		"\u0141\5:\36\2\u0141\u0146\3\2\2\2\u0142\u0143\7\34\2\2\u0143\u0144\7"+
		"]\2\2\u0144\u0146\5:\36\2\u0145\u013e\3\2\2\2\u0145\u0142\3\2\2\2\u0146"+
		"\31\3\2\2\2\u0147\u0148\b\16\1\2\u0148\u015f\5\24\13\2\u0149\u014a\7B"+
		"\2\2\u014a\u014b\5\u0088E\2\u014b\u014c\7C\2\2\u014c\u014d\7F\2\2\u014d"+
		"\u014f\5\u0094K\2\u014e\u0150\7_\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7G\2\2\u0152\u015f\3\2\2\2\u0153"+
		"\u0154\7\b\2\2\u0154\u0155\7B\2\2\u0155\u0156\5\u0088E\2\u0156\u0157\7"+
		"C\2\2\u0157\u0158\7F\2\2\u0158\u015a\5\u0094K\2\u0159\u015b\7_\2\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7G"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u0147\3\2\2\2\u015e\u0149\3\2\2\2\u015e"+
		"\u0153\3\2\2\2\u015f\u0177\3\2\2\2\u0160\u0161\f\n\2\2\u0161\u0162\7D"+
		"\2\2\u0162\u0163\5> \2\u0163\u0164\7E\2\2\u0164\u0176\3\2\2\2\u0165\u0166"+
		"\f\t\2\2\u0166\u0168\7B\2\2\u0167\u0169\5\34\17\2\u0168\u0167\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0176\7C\2\2\u016b\u016c"+
		"\f\b\2\2\u016c\u016d\7n\2\2\u016d\u0176\7p\2\2\u016e\u016f\f\7\2\2\u016f"+
		"\u0170\7m\2\2\u0170\u0176\7p\2\2\u0171\u0172\f\6\2\2\u0172\u0176\7O\2"+
		"\2\u0173\u0174\f\5\2\2\u0174\u0176\7Q\2\2\u0175\u0160\3\2\2\2\u0175\u0165"+
		"\3\2\2\2\u0175\u016b\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u0171\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\33\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017f\5:\36\2\u017b\u017c"+
		"\7_\2\2\u017c\u017e\5:\36\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\35\3\2\2\2\u0181\u017f\3\2\2"+
		"\2\u0182\u0199\5\32\16\2\u0183\u0184\7O\2\2\u0184\u0199\5\36\20\2\u0185"+
		"\u0186\7Q\2\2\u0186\u0199\5\36\20\2\u0187\u0188\5 \21\2\u0188\u0189\5"+
		"\"\22\2\u0189\u0199\3\2\2\2\u018a\u018b\7.\2\2\u018b\u0199\5\36\20\2\u018c"+
		"\u018d\7.\2\2\u018d\u018e\7B\2\2\u018e\u018f\5\u0088E\2\u018f\u0190\7"+
		"C\2\2\u0190\u0199\3\2\2\2\u0191\u0192\79\2\2\u0192\u0193\7B\2\2\u0193"+
		"\u0194\5\u0088E\2\u0194\u0195\7C\2\2\u0195\u0199\3\2\2\2\u0196\u0197\7"+
		"W\2\2\u0197\u0199\7p\2\2\u0198\u0182\3\2\2\2\u0198\u0183\3\2\2\2\u0198"+
		"\u0185\3\2\2\2\u0198\u0187\3\2\2\2\u0198\u018a\3\2\2\2\u0198\u018c\3\2"+
		"\2\2\u0198\u0191\3\2\2\2\u0198\u0196\3\2\2\2\u0199\37\3\2\2\2\u019a\u019b"+
		"\t\2\2\2\u019b!\3\2\2\2\u019c\u019d\7B\2\2\u019d\u019e\5\u0088E\2\u019e"+
		"\u019f\7C\2\2\u019f\u01a0\5\"\22\2\u01a0\u01aa\3\2\2\2\u01a1\u01a2\7\b"+
		"\2\2\u01a2\u01a3\7B\2\2\u01a3\u01a4\5\u0088E\2\u01a4\u01a5\7C\2\2\u01a5"+
		"\u01a6\5\"\22\2\u01a6\u01aa\3\2\2\2\u01a7\u01aa\5\36\20\2\u01a8\u01aa"+
		"\5\u00c2b\2\u01a9\u019c\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a7\3\2\2"+
		"\2\u01a9\u01a8\3\2\2\2\u01aa#\3\2\2\2\u01ab\u01ac\b\23\1\2\u01ac\u01ad"+
		"\5\"\22\2\u01ad\u01b9\3\2\2\2\u01ae\u01af\f\5\2\2\u01af\u01b0\7R\2\2\u01b0"+
		"\u01b8\5\"\22\2\u01b1\u01b2\f\4\2\2\u01b2\u01b3\7S\2\2\u01b3\u01b8\5\""+
		"\22\2\u01b4\u01b5\f\3\2\2\u01b5\u01b6\7T\2\2\u01b6\u01b8\5\"\22\2\u01b7"+
		"\u01ae\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba%\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01bd\b\24\1\2\u01bd\u01be\5$\23\2\u01be\u01c7\3\2\2\2"+
		"\u01bf\u01c0\f\4\2\2\u01c0\u01c1\7N\2\2\u01c1\u01c6\5$\23\2\u01c2\u01c3"+
		"\f\3\2\2\u01c3\u01c4\7P\2\2\u01c4\u01c6\5$\23\2\u01c5\u01bf\3\2\2\2\u01c5"+
		"\u01c2\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\'\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\b\25\1\2\u01cb\u01cc"+
		"\5&\24\2\u01cc\u01d5\3\2\2\2\u01cd\u01ce\f\4\2\2\u01ce\u01cf\7L\2\2\u01cf"+
		"\u01d4\5&\24\2\u01d0\u01d1\f\3\2\2\u01d1\u01d2\7M\2\2\u01d2\u01d4\5&\24"+
		"\2\u01d3\u01cd\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6)\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\b\26\1\2\u01d9\u01da\5(\25\2\u01da\u01e9\3\2\2\2\u01db\u01dc\f"+
		"\6\2\2\u01dc\u01dd\7H\2\2\u01dd\u01e8\5(\25\2\u01de\u01df\f\5\2\2\u01df"+
		"\u01e0\7J\2\2\u01e0\u01e8\5(\25\2\u01e1\u01e2\f\4\2\2\u01e2\u01e3\7I\2"+
		"\2\u01e3\u01e8\5(\25\2\u01e4\u01e5\f\3\2\2\u01e5\u01e6\7K\2\2\u01e6\u01e8"+
		"\5(\25\2\u01e7\u01db\3\2\2\2\u01e7\u01de\3\2\2\2\u01e7\u01e1\3\2\2\2\u01e7"+
		"\u01e4\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea+\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\b\27\1\2\u01ed\u01ee"+
		"\5*\26\2\u01ee\u01f7\3\2\2\2\u01ef\u01f0\f\4\2\2\u01f0\u01f1\7k\2\2\u01f1"+
		"\u01f6\5*\26\2\u01f2\u01f3\f\3\2\2\u01f3\u01f4\7l\2\2\u01f4\u01f6\5*\26"+
		"\2\u01f5\u01ef\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8-\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\b\30\1\2\u01fb\u01fc\5,\27\2\u01fc\u0202\3\2\2\2\u01fd\u01fe\f"+
		"\3\2\2\u01fe\u01ff\7U\2\2\u01ff\u0201\5,\27\2\u0200\u01fd\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203/\3\2\2\2"+
		"\u0204\u0202\3\2\2\2\u0205\u0206\b\31\1\2\u0206\u0207\5.\30\2\u0207\u020d"+
		"\3\2\2\2\u0208\u0209\f\3\2\2\u0209\u020a\7Y\2\2\u020a\u020c\5.\30\2\u020b"+
		"\u0208\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\61\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\b\32\1\2\u0211\u0212"+
		"\5\60\31\2\u0212\u0218\3\2\2\2\u0213\u0214\f\3\2\2\u0214\u0215\7V\2\2"+
		"\u0215\u0217\5\60\31\2\u0216\u0213\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\63\3\2\2\2\u021a\u0218\3\2\2\2\u021b"+
		"\u021c\b\33\1\2\u021c\u021d\5\62\32\2\u021d\u0223\3\2\2\2\u021e\u021f"+
		"\f\3\2\2\u021f\u0220\7W\2\2\u0220\u0222\5\62\32\2\u0221\u021e\3\2\2\2"+
		"\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\65"+
		"\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\b\34\1\2\u0227\u0228\5\64\33"+
		"\2\u0228\u022e\3\2\2\2\u0229\u022a\f\3\2\2\u022a\u022b\7X\2\2\u022b\u022d"+
		"\5\64\33\2\u022c\u0229\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2"+
		"\u022e\u022f\3\2\2\2\u022f\67\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0239"+
		"\5\66\34\2\u0232\u0233\5\66\34\2\u0233\u0234\7\\\2\2\u0234\u0235\5> \2"+
		"\u0235\u0236\7]\2\2\u0236\u0237\58\35\2\u0237\u0239\3\2\2\2\u0238\u0231"+
		"\3\2\2\2\u0238\u0232\3\2\2\2\u02399\3\2\2\2\u023a\u0242\5\6\4\2\u023b"+
		"\u0242\58\35\2\u023c\u023d\5\36\20\2\u023d\u023e\5<\37\2\u023e\u023f\5"+
		":\36\2\u023f\u0242\3\2\2\2\u0240\u0242\5\u00c2b\2\u0241\u023a\3\2\2\2"+
		"\u0241\u023b\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u0240\3\2\2\2\u0242;\3"+
		"\2\2\2\u0243\u0244\t\3\2\2\u0244=\3\2\2\2\u0245\u024a\5:\36\2\u0246\u0247"+
		"\7_\2\2\u0247\u0249\5:\36\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b?\3\2\2\2\u024c\u024a\3\2\2\2"+
		"\u024d\u024e\58\35\2\u024eA\3\2\2\2\u024f\u0250\5D#\2\u0250\u0251\5J&"+
		"\2\u0251\u0252\7^\2\2\u0252\u0258\3\2\2\2\u0253\u0254\5D#\2\u0254\u0255"+
		"\7^\2\2\u0255\u0258\3\2\2\2\u0256\u0258\5\u009eP\2\u0257\u024f\3\2\2\2"+
		"\u0257\u0253\3\2\2\2\u0257\u0256\3\2\2\2\u0258C\3\2\2\2\u0259\u025b\5"+
		"H%\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025dE\3\2\2\2\u025e\u0260\5H%\2\u025f\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262G\3\2\2\2"+
		"\u0263\u0269\5N(\2\u0264\u0269\5P)\2\u0265\u0269\5h\65\2\u0266\u0269\5"+
		"j\66\2\u0267\u0269\5l\67\2\u0268\u0263\3\2\2\2\u0268\u0264\3\2\2\2\u0268"+
		"\u0265\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269I\3\2\2\2"+
		"\u026a\u026f\5L\'\2\u026b\u026c\7_\2\2\u026c\u026e\5L\'\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"K\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0278\5n8\2\u0273\u0274\5n8\2\u0274"+
		"\u0275\7`\2\2\u0275\u0276\5\u0090I\2\u0276\u0278\3\2\2\2\u0277\u0272\3"+
		"\2\2\2\u0277\u0273\3\2\2\2\u0278M\3\2\2\2\u0279\u027a\t\4\2\2\u027aO\3"+
		"\2\2\2\u027b\u027c\b)\1\2\u027c\u028b\t\5\2\2\u027d\u027e\7\b\2\2\u027e"+
		"\u027f\7B\2\2\u027f\u0280\t\6\2\2\u0280\u028b\7C\2\2\u0281\u028b\5f\64"+
		"\2\u0282\u028b\5R*\2\u0283\u028b\5^\60\2\u0284\u028b\5\u008eH\2\u0285"+
		"\u0286\7\16\2\2\u0286\u0287\7B\2\2\u0287\u0288\5@!\2\u0288\u0289\7C\2"+
		"\2\u0289\u028b\3\2\2\2\u028a\u027b\3\2\2\2\u028a\u027d\3\2\2\2\u028a\u0281"+
		"\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u0283\3\2\2\2\u028a\u0284\3\2\2\2\u028a"+
		"\u0285\3\2\2\2\u028b\u0290\3\2\2\2\u028c\u028d\f\3\2\2\u028d\u028f\5|"+
		"?\2\u028e\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291Q\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0295\7\60\2\2"+
		"\u0294\u0296\7p\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029b"+
		"\3\2\2\2\u0297\u0298\7F\2\2\u0298\u0299\5T+\2\u0299\u029a\7G\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u0297\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a8\3\2"+
		"\2\2\u029d\u029f\7\63\2\2\u029e\u02a0\7p\2\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a5\3\2\2\2\u02a1\u02a2\7F\2\2\u02a2\u02a3\5T+"+
		"\2\u02a3\u02a4\7G\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u0293\3\2\2\2\u02a7\u029d\3\2\2\2\u02a8"+
		"S\3\2\2\2\u02a9\u02ab\5V,\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02adU\3\2\2\2\u02ae\u02b0\5X-\2\u02af"+
		"\u02b1\5Z.\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2"+
		"\2\u02b2\u02b3\7^\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b6\5\u009eP\2\u02b5"+
		"\u02ae\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6W\3\2\2\2\u02b7\u02ba\5P)\2\u02b8"+
		"\u02ba\5h\65\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcY\3\2\2\2\u02bd\u02c2"+
		"\5\\/\2\u02be\u02bf\7_\2\2\u02bf\u02c1\5\\/\2\u02c0\u02be\3\2\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3[\3\2\2\2"+
		"\u02c4\u02c2\3\2\2\2\u02c5\u02cc\5n8\2\u02c6\u02c8\5n8\2\u02c7\u02c6\3"+
		"\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7]\2\2\u02ca"+
		"\u02cc\5@!\2\u02cb\u02c5\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cc]\3\2\2\2\u02cd"+
		"\u02cf\7 \2\2\u02ce\u02d0\7p\2\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2"+
		"\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7F\2\2\u02d2\u02d4\5`\61\2\u02d3\u02d5"+
		"\7_\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d7\7G\2\2\u02d7\u02db\3\2\2\2\u02d8\u02d9\7 \2\2\u02d9\u02db\7p\2"+
		"\2\u02da\u02cd\3\2\2\2\u02da\u02d8\3\2\2\2\u02db_\3\2\2\2\u02dc\u02e1"+
		"\5b\62\2\u02dd\u02de\7_\2\2\u02de\u02e0\5b\62\2\u02df\u02dd\3\2\2\2\u02e0"+
		"\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2a\3\2\2\2"+
		"\u02e3\u02e1\3\2\2\2\u02e4\u02ea\5d\63\2\u02e5\u02e6\5d\63\2\u02e6\u02e7"+
		"\7`\2\2\u02e7\u02e8\5@!\2\u02e8\u02ea\3\2\2\2\u02e9\u02e4\3\2\2\2\u02e9"+
		"\u02e5\3\2\2\2\u02eac\3\2\2\2\u02eb\u02ec\7p\2\2\u02ece\3\2\2\2\u02ed"+
		"\u02ee\7:\2\2\u02ee\u02ef\7B\2\2\u02ef\u02f0\5\u0088E\2\u02f0\u02f1\7"+
		"C\2\2\u02f1g\3\2\2\2\u02f2\u02f3\t\7\2\2\u02f3i\3\2\2\2\u02f4\u02fb\t"+
		"\b\2\2\u02f5\u02fb\5v<\2\u02f6\u02f7\7\21\2\2\u02f7\u02f8\7B\2\2\u02f8"+
		"\u02f9\7p\2\2\u02f9\u02fb\7C\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f5\3\2\2"+
		"\2\u02fa\u02f6\3\2\2\2\u02fbk\3\2\2\2\u02fc\u02fd\78\2\2\u02fd\u02fe\7"+
		"B\2\2\u02fe\u02ff\5\u0088E\2\u02ff\u0300\7C\2\2\u0300\u0307\3\2\2\2\u0301"+
		"\u0302\78\2\2\u0302\u0303\7B\2\2\u0303\u0304\5@!\2\u0304\u0305\7C\2\2"+
		"\u0305\u0307\3\2\2\2\u0306\u02fc\3\2\2\2\u0306\u0301\3\2\2\2\u0307m\3"+
		"\2\2\2\u0308\u030a\5|?\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030f\5p9\2\u030c\u030e\5r:\2\u030d\u030c\3\2\2\2"+
		"\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310o\3"+
		"\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\b9\1\2\u0313\u0324\7p\2\2\u0314"+
		"\u0315\7B\2\2\u0315\u0316\5n8\2\u0316\u0317\7C\2\2\u0317\u0324\3\2\2\2"+
		"\u0318\u0319\7p\2\2\u0319\u031a\7]\2\2\u031a\u0324\5\u00c2b\2\u031b\u031d"+
		"\7B\2\2\u031c\u031e\5P)\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0320\5|?\2\u0320\u0321\5p9\2\u0321\u0322\7C\2\2"+
		"\u0322\u0324\3\2\2\2\u0323\u0312\3\2\2\2\u0323\u0314\3\2\2\2\u0323\u0318"+
		"\3\2\2\2\u0323\u031b\3\2\2\2\u0324\u0352\3\2\2\2\u0325\u0326\f\n\2\2\u0326"+
		"\u0328\7D\2\2\u0327\u0329\5~@\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2"+
		"\2\u0329\u032b\3\2\2\2\u032a\u032c\5:\36\2\u032b\u032a\3\2\2\2\u032b\u032c"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0351\7E\2\2\u032e\u032f\f\t\2\2\u032f"+
		"\u0330\7D\2\2\u0330\u0332\7/\2\2\u0331\u0333\5~@\2\u0332\u0331\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\5:\36\2\u0335\u0336"+
		"\7E\2\2\u0336\u0351\3\2\2\2\u0337\u0338\f\b\2\2\u0338\u0339\7D\2\2\u0339"+
		"\u033a\5~@\2\u033a\u033b\7/\2\2\u033b\u033c\5:\36\2\u033c\u033d\7E\2\2"+
		"\u033d\u0351\3\2\2\2\u033e\u033f\f\7\2\2\u033f\u0341\7D\2\2\u0340\u0342"+
		"\5~@\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0344\7R\2\2\u0344\u0351\7E\2\2\u0345\u0346\f\6\2\2\u0346\u0347\7B\2"+
		"\2\u0347\u0348\5\u0080A\2\u0348\u0349\7C\2\2\u0349\u0351\3\2\2\2\u034a"+
		"\u034b\f\5\2\2\u034b\u034d\7B\2\2\u034c\u034e\5\u0086D\2\u034d\u034c\3"+
		"\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\7C\2\2\u0350"+
		"\u0325\3\2\2\2\u0350\u032e\3\2\2\2\u0350\u0337\3\2\2\2\u0350\u033e\3\2"+
		"\2\2\u0350\u0345\3\2\2\2\u0350\u034a\3\2\2\2\u0351\u0354\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353q\3\2\2\2\u0354\u0352\3\2\2\2"+
		"\u0355\u0358\5t;\2\u0356\u0358\5v<\2\u0357\u0355\3\2\2\2\u0357\u0356\3"+
		"\2\2\2\u0358s\3\2\2\2\u0359\u035a\t\t\2\2\u035a\u035c\7B\2\2\u035b\u035d"+
		"\7u\2\2\u035c\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\7C\2\2\u0361u\3\2\2\2\u0362"+
		"\u0363\7\24\2\2\u0363\u0364\7B\2\2\u0364\u0365\7B\2\2\u0365\u0366\5x="+
		"\2\u0366\u0367\7C\2\2\u0367\u0368\7C\2\2\u0368w\3\2\2\2\u0369\u036e\5"+
		"z>\2\u036a\u036b\7_\2\2\u036b\u036d\5z>\2\u036c\u036a\3\2\2\2\u036d\u0370"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0373\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0369\3\2\2\2\u0372\u0371\3\2"+
		"\2\2\u0373y\3\2\2\2\u0374\u037a\n\n\2\2\u0375\u0377\7B\2\2\u0376\u0378"+
		"\5\34\17\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2"+
		"\u0379\u037b\7C\2\2\u037a\u0375\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037e"+
		"\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u0374\3\2\2\2\u037d\u037c\3\2\2\2\u037e"+
		"{\3\2\2\2\u037f\u0381\7R\2\2\u0380\u0382\5~@\2\u0381\u0380\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0385\5|?\2\u0384\u0383\3\2\2"+
		"\2\u0384\u0385\3\2\2\2\u0385\u038e\3\2\2\2\u0386\u0388\7Y\2\2\u0387\u0389"+
		"\5~@\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u038c\5|?\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2"+
		"\2\u038d\u037f\3\2\2\2\u038d\u0386\3\2\2\2\u038e}\3\2\2\2\u038f\u0391"+
		"\5h\65\2\u0390\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\177\3\2\2\2\u0394\u039a\5\u0082B\2\u0395\u0396\5"+
		"\u0082B\2\u0396\u0397\7_\2\2\u0397\u0398\7o\2\2\u0398\u039a\3\2\2\2\u0399"+
		"\u0394\3\2\2\2\u0399\u0395\3\2\2\2\u039a\u0081\3\2\2\2\u039b\u03a0\5\u0084"+
		"C\2\u039c\u039d\7_\2\2\u039d\u039f\5\u0084C\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u0083\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\5D#\2\u03a4\u03a5\5n8\2\u03a5\u03ab"+
		"\3\2\2\2\u03a6\u03a8\5F$\2\u03a7\u03a9\5\u008aF\2\u03a8\u03a7\3\2\2\2"+
		"\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a3\3\2\2\2\u03aa\u03a6"+
		"\3\2\2\2\u03ab\u0085\3\2\2\2\u03ac\u03b1\7p\2\2\u03ad\u03ae\7_\2\2\u03ae"+
		"\u03b0\7p\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u0087\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b6\5X-\2\u03b5\u03b7\5\u008aF\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3"+
		"\2\2\2\u03b7\u0089\3\2\2\2\u03b8\u03c4\5|?\2\u03b9\u03bb\5|?\2\u03ba\u03b9"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c0\5\u008cG"+
		"\2\u03bd\u03bf\5r:\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3"+
		"\u03b8\3\2\2\2\u03c3\u03ba\3\2\2\2\u03c4\u008b\3\2\2\2\u03c5\u03c6\bG"+
		"\1\2\u03c6\u03c7\7B\2\2\u03c7\u03c8\5\u008aF\2\u03c8\u03cc\7C\2\2\u03c9"+
		"\u03cb\5r:\2\u03ca\u03c9\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2"+
		"\2\u03cc\u03cd\3\2\2\2\u03cd\u03f4\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d1"+
		"\7D\2\2\u03d0\u03d2\5~@\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03d5\5:\36\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03f4\7E\2\2\u03d7\u03d8\7D\2\2\u03d8\u03da"+
		"\7/\2\2\u03d9\u03db\5~@\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03dd\5:\36\2\u03dd\u03de\7E\2\2\u03de\u03f4\3\2"+
		"\2\2\u03df\u03e0\7D\2\2\u03e0\u03e1\5~@\2\u03e1\u03e2\7/\2\2\u03e2\u03e3"+
		"\5:\36\2\u03e3\u03e4\7E\2\2\u03e4\u03f4\3\2\2\2\u03e5\u03e6\7D\2\2\u03e6"+
		"\u03e7\7R\2\2\u03e7\u03f4\7E\2\2\u03e8\u03ea\7B\2\2\u03e9\u03eb\5\u0080"+
		"A\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03f0\7C\2\2\u03ed\u03ef\5r:\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2"+
		"\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0"+
		"\3\2\2\2\u03f3\u03c5\3\2\2\2\u03f3\u03cf\3\2\2\2\u03f3\u03d7\3\2\2\2\u03f3"+
		"\u03df\3\2\2\2\u03f3\u03e5\3\2\2\2\u03f3\u03e8\3\2\2\2\u03f4\u0420\3\2"+
		"\2\2\u03f5\u03f6\f\7\2\2\u03f6\u03f8\7D\2\2\u03f7\u03f9\5~@\2\u03f8\u03f7"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03fc\5:\36\2\u03fb"+
		"\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u041f\7E"+
		"\2\2\u03fe\u03ff\f\6\2\2\u03ff\u0400\7D\2\2\u0400\u0402\7/\2\2\u0401\u0403"+
		"\5~@\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\5:\36\2\u0405\u0406\7E\2\2\u0406\u041f\3\2\2\2\u0407\u0408\f\5"+
		"\2\2\u0408\u0409\7D\2\2\u0409\u040a\5~@\2\u040a\u040b\7/\2\2\u040b\u040c"+
		"\5:\36\2\u040c\u040d\7E\2\2\u040d\u041f\3\2\2\2\u040e\u040f\f\4\2\2\u040f"+
		"\u0410\7D\2\2\u0410\u0411\7R\2\2\u0411\u041f\7E\2\2\u0412\u0413\f\3\2"+
		"\2\u0413\u0415\7B\2\2\u0414\u0416\5\u0080A\2\u0415\u0414\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u041b\7C\2\2\u0418\u041a\5r:"+
		"\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u03f5\3\2\2\2\u041e"+
		"\u03fe\3\2\2\2\u041e\u0407\3\2\2\2\u041e\u040e\3\2\2\2\u041e\u0412\3\2"+
		"\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u008d\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424\7p\2\2\u0424\u008f\3\2"+
		"\2\2\u0425\u0429\5\20\t\2\u0426\u0429\5:\36\2\u0427\u0429\5\u0092J\2\u0428"+
		"\u0425\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0427\3\2\2\2\u0429\u0091\3\2"+
		"\2\2\u042a\u042b\7F\2\2\u042b\u042d\5\u0094K\2\u042c\u042e\7_\2\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7G"+
		"\2\2\u0430\u0093\3\2\2\2\u0431\u0436\5\u0096L\2\u0432\u0433\7_\2\2\u0433"+
		"\u0435\5\u0096L\2\u0434\u0432\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0095\3\2\2\2\u0438\u0436\3\2\2\2\u0439"+
		"\u043d\5\u0098M\2\u043a\u043d\5\u009aN\2\u043b\u043d\5\u009cO\2\u043c"+
		"\u0439\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u0097\3\2"+
		"\2\2\u043e\u043f\5\u0090I\2\u043f\u0099\3\2\2\2\u0440\u0441\7D\2\2\u0441"+
		"\u0442\5@!\2\u0442\u0443\7E\2\2\u0443\u0445\3\2\2\2\u0444\u0440\3\2\2"+
		"\2\u0445\u0446\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448"+
		"\3\2\2\2\u0448\u0449\7`\2\2\u0449\u044a\5\u0090I\2\u044a\u009b\3\2\2\2"+
		"\u044b\u044c\7n\2\2\u044c\u044e\7p\2\2\u044d\u044b\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0452\7`\2\2\u0452\u0453\5\u0090I\2\u0453\u009d\3\2\2\2\u0454\u0455\7"+
		"@\2\2\u0455\u0456\7B\2\2\u0456\u0457\5@!\2\u0457\u0459\7_\2\2\u0458\u045a"+
		"\7u\2\2\u0459\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7C\2\2\u045e\u045f\7^\2"+
		"\2\u045f\u009f\3\2\2\2\u0460\u046b\5\b\5\2\u0461\u046b\5\n\6\2\u0462\u046b"+
		"\5\u00a4S\2\u0463\u046b\5\u00a6T\2\u0464\u046b\5\u00aaV\2\u0465\u046b"+
		"\5\u00acW\2\u0466\u046b\5\u00aeX\2\u0467\u046b\5\u00b6\\\2\u0468\u046b"+
		"\5\u00a2R\2\u0469\u046b\7^\2\2\u046a\u0460\3\2\2\2\u046a\u0461\3\2\2\2"+
		"\u046a\u0462\3\2\2\2\u046a\u0463\3\2\2\2\u046a\u0464\3\2\2\2\u046a\u0465"+
		"\3\2\2\2\u046a\u0466\3\2\2\2\u046a\u0467\3\2\2\2\u046a\u0468\3\2\2\2\u046a"+
		"\u0469\3\2\2\2\u046b\u00a1\3\2\2\2\u046c\u046d\t\t\2\2\u046d\u046e\t\13"+
		"\2\2\u046e\u0477\7B\2\2\u046f\u0474\5\66\34\2\u0470\u0471\7_\2\2\u0471"+
		"\u0473\5\66\34\2\u0472\u0470\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0477"+
		"\u046f\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0486\3\2\2\2\u0479\u0482\7]"+
		"\2\2\u047a\u047f\5\66\34\2\u047b\u047c\7_\2\2\u047c\u047e\5\66\34\2\u047d"+
		"\u047b\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2"+
		"\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u047a\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0479\3\2\2\2\u0485\u0488\3\2"+
		"\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048a\7C\2\2\u048a\u048b\7^\2\2\u048b\u00a3\3\2\2"+
		"\2\u048c\u048d\7p\2\2\u048d\u048e\7]\2\2\u048e\u0498\5\u00a0Q\2\u048f"+
		"\u0490\7\30\2\2\u0490\u0491\5@!\2\u0491\u0492\7]\2\2\u0492\u0493\5\u00a0"+
		"Q\2\u0493\u0498\3\2\2\2\u0494\u0495\7\34\2\2\u0495\u0496\7]\2\2\u0496"+
		"\u0498\5\u00a0Q\2\u0497\u048c\3\2\2\2\u0497\u048f\3\2\2\2\u0497\u0494"+
		"\3\2\2\2\u0498\u00a5\3\2\2\2\u0499\u049d\7F\2\2\u049a\u049c\5\u00a8U\2"+
		"\u049b\u049a\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e"+
		"\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a1\7G\2\2\u04a1"+
		"\u00a7\3\2\2\2\u04a2\u04a5\5\u00a0Q\2\u04a3\u04a5\5B\"\2\u04a4\u04a2\3"+
		"\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u00a9\3\2\2\2\u04a6\u04a7\5> \2\u04a7"+
		"\u04a8\7^\2\2\u04a8\u00ab\3\2\2\2\u04a9\u04aa\7%\2\2\u04aa\u04ab\7B\2"+
		"\2\u04ab\u04ac\5> \2\u04ac\u04ad\7C\2\2\u04ad\u04b0\5\u00a0Q\2\u04ae\u04af"+
		"\7\37\2\2\u04af\u04b1\5\u00a0Q\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2"+
		"\2\u04b1\u04b9\3\2\2\2\u04b2\u04b3\7\61\2\2\u04b3\u04b4\7B\2\2\u04b4\u04b5"+
		"\5> \2\u04b5\u04b6\7C\2\2\u04b6\u04b7\5\u00a0Q\2\u04b7\u04b9\3\2\2\2\u04b8"+
		"\u04a9\3\2\2\2\u04b8\u04b2\3\2\2\2\u04b9\u00ad\3\2\2\2\u04ba\u04bb\7\67"+
		"\2\2\u04bb\u04bc\7B\2\2\u04bc\u04bd\5> \2\u04bd\u04be\7C\2\2\u04be\u04bf"+
		"\5\u00a0Q\2\u04bf\u04cf\3\2\2\2\u04c0\u04c1\7\35\2\2\u04c1\u04c2\5\u00a0"+
		"Q\2\u04c2\u04c3\7\67\2\2\u04c3\u04c4\7B\2\2\u04c4\u04c5\5> \2\u04c5\u04c6"+
		"\7C\2\2\u04c6\u04c7\7^\2\2\u04c7\u04cf\3\2\2\2\u04c8\u04c9\7#\2\2\u04c9"+
		"\u04ca\7B\2\2\u04ca\u04cb\5\u00b0Y\2\u04cb\u04cc\7C\2\2\u04cc\u04cd\5"+
		"\u00a0Q\2\u04cd\u04cf\3\2\2\2\u04ce\u04ba\3\2\2\2\u04ce\u04c0\3\2\2\2"+
		"\u04ce\u04c8\3\2\2\2\u04cf\u00af\3\2\2\2\u04d0\u04d1\5\u00b2Z\2\u04d1"+
		"\u04d3\7^\2\2\u04d2\u04d4\5\u00b4[\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3"+
		"\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\7^\2\2\u04d6\u04d8\5\u00b4[\2\u04d7"+
		"\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04e5\3\2\2\2\u04d9\u04db\5>"+
		" \2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04de\7^\2\2\u04dd\u04df\5\u00b4[\2\u04de\u04dd\3\2\2\2\u04de\u04df\3"+
		"\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\7^\2\2\u04e1\u04e3\5\u00b4[\2\u04e2"+
		"\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04d0\3\2"+
		"\2\2\u04e4\u04da\3\2\2\2\u04e5\u00b1\3\2\2\2\u04e6\u04e8\5D#\2\u04e7\u04e9"+
		"\5J&\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00b3\3\2\2\2\u04ea"+
		"\u04ef\5:\36\2\u04eb\u04ec\7_\2\2\u04ec\u04ee\5:\36\2\u04ed\u04eb\3\2"+
		"\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u00b5\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2\u04f3\7$\2\2\u04f3\u04f4\7p\2"+
		"\2\u04f4\u0503\7^\2\2\u04f5\u04f6\7\33\2\2\u04f6\u0503\7^\2\2\u04f7\u04f8"+
		"\7\27\2\2\u04f8\u0503\7^\2\2\u04f9\u04fb\7+\2\2\u04fa\u04fc\5> \2\u04fb"+
		"\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0503\7^"+
		"\2\2\u04fe\u04ff\7$\2\2\u04ff\u0500\5\36\20\2\u0500\u0501\7^\2\2\u0501"+
		"\u0503\3\2\2\2\u0502\u04f2\3\2\2\2\u0502\u04f5\3\2\2\2\u0502\u04f7\3\2"+
		"\2\2\u0502\u04f9\3\2\2\2\u0502\u04fe\3\2\2\2\u0503\u00b7\3\2\2\2\u0504"+
		"\u0507\5\u00ba^\2\u0505\u0507\7^\2\2\u0506\u0504\3\2\2\2\u0506\u0505\3"+
		"\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050b\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050c\7\2\2\3\u050c\u00b9\3\2"+
		"\2\2\u050d\u0510\5\22\n\2\u050e\u0510\5\u00bc_\2\u050f\u050d\3\2\2\2\u050f"+
		"\u050e\3\2\2\2\u0510\u00bb\3\2\2\2\u0511\u0517\5\2\2\2\u0512\u0517\5\u00be"+
		"`\2\u0513\u0517\5\16\b\2\u0514\u0517\5\f\7\2\u0515\u0517\5B\"\2\u0516"+
		"\u0511\3\2\2\2\u0516\u0512\3\2\2\2\u0516\u0513\3\2\2\2\u0516\u0514\3\2"+
		"\2\2\u0516\u0515\3\2\2\2\u0517\u00bd\3\2\2\2\u0518\u051a\5D#\2\u0519\u0518"+
		"\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\5n8\2\u051c"+
		"\u051e\5\u00c0a\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u0520\5\u00a6T\2\u0520\u00bf\3\2\2\2\u0521\u0523\5B\"\2"+
		"\u0522\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525"+
		"\3\2\2\2\u0525\u00c1\3\2\2\2\u0526\u0527\7s\2\2\u0527\u00c3\3\2\2\2\u009b"+
		"\u00c9\u00cc\u00d0\u00d8\u00db\u00e5\u00ec\u00f2\u00f9\u0108\u0112\u011a"+
		"\u012e\u0139\u0145\u014f\u015a\u015e\u0168\u0175\u0177\u017f\u0198\u01a9"+
		"\u01b7\u01b9\u01c5\u01c7\u01d3\u01d5\u01e7\u01e9\u01f5\u01f7\u0202\u020d"+
		"\u0218\u0223\u022e\u0238\u0241\u024a\u0257\u025c\u0261\u0268\u026f\u0277"+
		"\u028a\u0290\u0295\u029b\u029f\u02a5\u02a7\u02ac\u02b0\u02b5\u02b9\u02bb"+
		"\u02c2\u02c7\u02cb\u02cf\u02d4\u02da\u02e1\u02e9\u02fa\u0306\u0309\u030f"+
		"\u031d\u0323\u0328\u032b\u0332\u0341\u034d\u0350\u0352\u0357\u035e\u036e"+
		"\u0372\u0377\u037a\u037d\u0381\u0384\u0388\u038b\u038d\u0392\u0399\u03a0"+
		"\u03a8\u03aa\u03b1\u03b6\u03ba\u03c0\u03c3\u03cc\u03d1\u03d4\u03da\u03ea"+
		"\u03f0\u03f3\u03f8\u03fb\u0402\u0415\u041b\u041e\u0420\u0428\u042d\u0436"+
		"\u043c\u0446\u044f\u045b\u046a\u0474\u0477\u047f\u0482\u0486\u0497\u049d"+
		"\u04a4\u04b0\u04b8\u04ce\u04d3\u04d7\u04da\u04de\u04e2\u04e4\u04e8\u04ef"+
		"\u04fb\u0502\u0506\u0508\u050f\u0516\u0519\u051d\u0524";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}