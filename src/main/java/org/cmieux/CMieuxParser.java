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
		T__17=18, Auto=19, Break=20, Case=21, Char=22, Const=23, Continue=24, 
		Default=25, Do=26, Double=27, Else=28, Enum=29, Extern=30, Float=31, For=32, 
		Goto=33, If=34, Inline=35, Int=36, Long=37, Register=38, Restrict=39, 
		Return=40, Short=41, Signed=42, Sizeof=43, Static=44, Struct=45, Switch=46, 
		Typedef=47, Union=48, Unsigned=49, Void=50, Volatile=51, While=52, Alignas=53, 
		Alignof=54, Atomic=55, Bool=56, Complex=57, Generic=58, Imaginary=59, 
		Noreturn=60, StaticAssert=61, ThreadLocal=62, LeftParen=63, RightParen=64, 
		LeftBracket=65, RightBracket=66, LeftBrace=67, RightBrace=68, Less=69, 
		LessEqual=70, Greater=71, GreaterEqual=72, LeftShift=73, RightShift=74, 
		Plus=75, PlusPlus=76, Minus=77, MinusMinus=78, Star=79, Div=80, Mod=81, 
		And=82, Or=83, AndAnd=84, OrOr=85, Caret=86, Not=87, Tilde=88, Question=89, 
		Colon=90, Semi=91, Comma=92, Assign=93, StarAssign=94, DivAssign=95, ModAssign=96, 
		PlusAssign=97, MinusAssign=98, LeftShiftAssign=99, RightShiftAssign=100, 
		AndAssign=101, XorAssign=102, OrAssign=103, Equal=104, NotEqual=105, Arrow=106, 
		Dot=107, Ellipsis=108, Identifier=109, Constant=110, DigitSequence=111, 
		StringLiteral=112, ComplexDefine=113, IncludeDirective=114, AsmBlock=115, 
		LineAfterPreprocessing=116, LineDirective=117, PragmaDirective=118, Whitespace=119, 
		Newline=120, BlockComment=121, LineComment=122;
	public static final int
		RULE_autoStructDeclaration = 0, RULE_autoStructBody = 1, RULE_autoStructAllocation = 2, 
		RULE_deferStatement = 3, RULE_freeStatement = 4, RULE_methodDeclaration = 5, 
		RULE_methodDefinition = 6, RULE_primaryExpression = 7, RULE_genericSelection = 8, 
		RULE_genericAssocList = 9, RULE_genericAssociation = 10, RULE_postfixExpression = 11, 
		RULE_argumentExpressionList = 12, RULE_unaryExpression = 13, RULE_unaryOperator = 14, 
		RULE_castExpression = 15, RULE_multiplicativeExpression = 16, RULE_additiveExpression = 17, 
		RULE_shiftExpression = 18, RULE_relationalExpression = 19, RULE_equalityExpression = 20, 
		RULE_andExpression = 21, RULE_exclusiveOrExpression = 22, RULE_inclusiveOrExpression = 23, 
		RULE_logicalAndExpression = 24, RULE_logicalOrExpression = 25, RULE_conditionalExpression = 26, 
		RULE_assignmentExpression = 27, RULE_assignmentOperator = 28, RULE_expression = 29, 
		RULE_constantExpression = 30, RULE_declaration = 31, RULE_declarationSpecifiers = 32, 
		RULE_declarationSpecifiers2 = 33, RULE_declarationSpecifier = 34, RULE_initDeclaratorList = 35, 
		RULE_initDeclarator = 36, RULE_storageClassSpecifier = 37, RULE_typeSpecifier = 38, 
		RULE_structOrUnionSpecifier = 39, RULE_structOrUnion = 40, RULE_structDeclarationList = 41, 
		RULE_structDeclaration = 42, RULE_specifierQualifierList = 43, RULE_structDeclaratorList = 44, 
		RULE_structDeclarator = 45, RULE_enumSpecifier = 46, RULE_enumeratorList = 47, 
		RULE_enumerator = 48, RULE_enumerationConstant = 49, RULE_atomicTypeSpecifier = 50, 
		RULE_typeQualifier = 51, RULE_functionSpecifier = 52, RULE_alignmentSpecifier = 53, 
		RULE_declarator = 54, RULE_directDeclarator = 55, RULE_gccDeclaratorExtension = 56, 
		RULE_gccAttributeSpecifier = 57, RULE_gccAttributeList = 58, RULE_gccAttribute = 59, 
		RULE_nestedParenthesesBlock = 60, RULE_pointer = 61, RULE_typeQualifierList = 62, 
		RULE_parameterTypeList = 63, RULE_parameterList = 64, RULE_parameterDeclaration = 65, 
		RULE_identifierList = 66, RULE_typeName = 67, RULE_abstractDeclarator = 68, 
		RULE_directAbstractDeclarator = 69, RULE_typedefName = 70, RULE_initializer = 71, 
		RULE_initializerList = 72, RULE_designation = 73, RULE_designatorList = 74, 
		RULE_designator = 75, RULE_staticAssertDeclaration = 76, RULE_statement = 77, 
		RULE_labeledStatement = 78, RULE_compoundStatement = 79, RULE_blockItemList = 80, 
		RULE_blockItem = 81, RULE_expressionStatement = 82, RULE_selectionStatement = 83, 
		RULE_iterationStatement = 84, RULE_forCondition = 85, RULE_forDeclaration = 86, 
		RULE_forExpression = 87, RULE_jumpStatement = 88, RULE_compilationUnit = 89, 
		RULE_translationUnit = 90, RULE_externalDeclaration = 91, RULE_functionDefinition = 92, 
		RULE_declarationList = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"autoStructDeclaration", "autoStructBody", "autoStructAllocation", "deferStatement", 
			"freeStatement", "methodDeclaration", "methodDefinition", "primaryExpression", 
			"genericSelection", "genericAssocList", "genericAssociation", "postfixExpression", 
			"argumentExpressionList", "unaryExpression", "unaryOperator", "castExpression", 
			"multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
			"conditionalExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
			"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
			"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
			"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
			"initializer", "initializerList", "designation", "designatorList", "designator", 
			"staticAssertDeclaration", "statement", "labeledStatement", "compoundStatement", 
			"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
			"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
			"functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'defer'", "'free'", "'@'", "'__extension__'", "'__builtin_va_arg'", 
			"'__builtin_offsetof'", "'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", 
			"'__inline__'", "'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", 
			"'__asm__'", "'__volatile__'", "'auto'", "'break'", "'case'", "'char'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
			"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
			"'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
			"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Auto", "Break", "Case", "Char", 
			"Const", "Continue", "Default", "Do", "Double", "Else", "Enum", "Extern", 
			"Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", 
			"Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", 
			"Typedef", "Union", "Unsigned", "Void", "Volatile", "While", "Alignas", 
			"Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", 
			"StaticAssert", "ThreadLocal", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
			"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
			"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
			"Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
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
			setState(188);
			match(Auto);
			setState(189);
			match(Struct);
			setState(190);
			match(Identifier);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(191);
				autoStructBody();
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(192);
					match(Semi);
					}
					break;
				}
				}
				break;
			case Semi:
				{
				setState(195);
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
			setState(198);
			match(LeftBrace);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier) {
				{
				setState(199);
				structDeclarationList(0);
				}
			}

			setState(202);
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
			setState(204);
			match(T__0);
			setState(205);
			match(Identifier);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(206);
				match(LeftParen);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(207);
					argumentExpressionList(0);
					}
				}

				setState(210);
				match(RightParen);
				}
				break;
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
			setState(213);
			match(T__1);
			setState(214);
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
			setState(216);
			match(T__2);
			setState(217);
			match(Identifier);
			setState(218);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(220);
				declarationSpecifiers();
				}
				break;
			}
			setState(223);
			match(Identifier);
			setState(224);
			match(T__3);
			setState(225);
			typeSpecifier(0);
			setState(226);
			match(LeftParen);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(227);
				parameterTypeList();
				}
			}

			setState(230);
			match(RightParen);
			setState(231);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(233);
				declarationSpecifiers();
				}
				break;
			}
			setState(236);
			match(Identifier);
			setState(237);
			match(T__3);
			setState(238);
			typeSpecifier(0);
			setState(239);
			match(LeftParen);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(240);
				parameterTypeList();
				}
			}

			setState(243);
			match(RightParen);
			setState(244);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CMieuxParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CMieuxParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CMieuxParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(248);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(LeftParen);
				setState(254);
				expression(0);
				setState(255);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(258);
					match(T__4);
					}
				}

				setState(261);
				match(LeftParen);
				setState(262);
				compoundStatement();
				setState(263);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				match(T__5);
				setState(266);
				match(LeftParen);
				setState(267);
				unaryExpression();
				setState(268);
				match(Comma);
				setState(269);
				typeName();
				setState(270);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				match(T__6);
				setState(273);
				match(LeftParen);
				setState(274);
				typeName();
				setState(275);
				match(Comma);
				setState(276);
				unaryExpression();
				setState(277);
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
		public TerminalNode Generic() { return getToken(CMieuxParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
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
		enterRule(_localctx, 16, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Generic);
			setState(282);
			match(LeftParen);
			setState(283);
			assignmentExpression();
			setState(284);
			match(Comma);
			setState(285);
			genericAssocList(0);
			setState(286);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericAssocList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(Comma);
					setState(293);
					genericAssociation();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CMieuxParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitGenericAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericAssociation);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				setState(299);
				typeName();
				setState(300);
				match(Colon);
				setState(301);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(Default);
				setState(304);
				match(Colon);
				setState(305);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
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
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Dot() { return getToken(CMieuxParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(CMieuxParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CMieuxParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CMieuxParser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPostfixExpression(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(309);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(310);
				match(LeftParen);
				setState(311);
				typeName();
				setState(312);
				match(RightParen);
				setState(313);
				match(LeftBrace);
				setState(314);
				initializerList(0);
				setState(315);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(317);
				match(LeftParen);
				setState(318);
				typeName();
				setState(319);
				match(RightParen);
				setState(320);
				match(LeftBrace);
				setState(321);
				initializerList(0);
				setState(322);
				match(Comma);
				setState(323);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(325);
				match(T__4);
				setState(326);
				match(LeftParen);
				setState(327);
				typeName();
				setState(328);
				match(RightParen);
				setState(329);
				match(LeftBrace);
				setState(330);
				initializerList(0);
				setState(331);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(333);
				match(T__4);
				setState(334);
				match(LeftParen);
				setState(335);
				typeName();
				setState(336);
				match(RightParen);
				setState(337);
				match(LeftBrace);
				setState(338);
				initializerList(0);
				setState(339);
				match(Comma);
				setState(340);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(344);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(345);
						match(LeftBracket);
						setState(346);
						expression(0);
						setState(347);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(349);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(350);
						match(LeftParen);
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
							{
							setState(351);
							argumentExpressionList(0);
							}
						}

						setState(354);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(355);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(356);
						match(Dot);
						setState(357);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(358);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(359);
						match(Arrow);
						setState(360);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(361);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(362);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(363);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(364);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					match(Comma);
					setState(375);
					assignmentExpression();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CMieuxParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CMieuxParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CMieuxParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Alignof() { return getToken(CMieuxParser.Alignof, 0); }
		public TerminalNode AndAnd() { return getToken(CMieuxParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpression);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(PlusPlus);
				setState(383);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(MinusMinus);
				setState(385);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				unaryOperator();
				setState(387);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				match(Sizeof);
				setState(390);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(Sizeof);
				setState(392);
				match(LeftParen);
				setState(393);
				typeName();
				setState(394);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				match(Alignof);
				setState(397);
				match(LeftParen);
				setState(398);
				typeName();
				setState(399);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				match(AndAnd);
				setState(402);
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
		enterRule(_localctx, 28, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (Minus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)))) != 0)) ) {
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
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CMieuxParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_castExpression);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(LeftParen);
				setState(408);
				typeName();
				setState(409);
				match(RightParen);
				setState(410);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(T__4);
				setState(413);
				match(LeftParen);
				setState(414);
				typeName();
				setState(415);
				match(RightParen);
				setState(416);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(DigitSequence);
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
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TerminalNode Div() { return getToken(CMieuxParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CMieuxParser.Mod, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(423);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(425);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(426);
						match(Star);
						setState(427);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(428);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(429);
						match(Div);
						setState(430);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(431);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(432);
						match(Mod);
						setState(433);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CMieuxParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CMieuxParser.Minus, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitAdditiveExpression(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(443);
						match(Plus);
						setState(444);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(445);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(446);
						match(Minus);
						setState(447);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CMieuxParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CMieuxParser.RightShift, 0); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitShiftExpression(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(454);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(457);
						match(LeftShift);
						setState(458);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(459);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(460);
						match(RightShift);
						setState(461);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CMieuxParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CMieuxParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CMieuxParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CMieuxParser.GreaterEqual, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitRelationalExpression(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(470);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(471);
						match(Less);
						setState(472);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(473);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(474);
						match(Greater);
						setState(475);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(476);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(477);
						match(LessEqual);
						setState(478);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(479);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(480);
						match(GreaterEqual);
						setState(481);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CMieuxParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CMieuxParser.NotEqual, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEqualityExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(488);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(496);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						match(Equal);
						setState(492);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(493);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(494);
						match(NotEqual);
						setState(495);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CMieuxParser.And, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
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

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(502);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(504);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(505);
					match(And);
					setState(506);
					equalityExpression(0);
					}
					} 
				}
				setState(511);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CMieuxParser.Caret, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(513);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(515);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(516);
					match(Caret);
					setState(517);
					andExpression(0);
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CMieuxParser.Or, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(524);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(526);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(527);
					match(Or);
					setState(528);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(533);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(CMieuxParser.AndAnd, 0); }
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(535);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(537);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(538);
					match(AndAnd);
					setState(539);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(544);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CMieuxParser.OrOr, 0); }
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(546);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(548);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(549);
					match(OrOr);
					setState(550);
					logicalAndExpression(0);
					}
					} 
				}
				setState(555);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
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
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			logicalOrExpression(0);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(557);
				match(Question);
				setState(558);
				expression(0);
				setState(559);
				match(Colon);
				setState(560);
				conditionalExpression();
				}
				break;
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
		public TerminalNode DigitSequence() { return getToken(CMieuxParser.DigitSequence, 0); }
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
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				autoStructAllocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				unaryExpression();
				setState(567);
				assignmentOperator();
				setState(568);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(DigitSequence);
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
		enterRule(_localctx, 56, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Assign - 93)) | (1L << (StarAssign - 93)) | (1L << (DivAssign - 93)) | (1L << (ModAssign - 93)) | (1L << (PlusAssign - 93)) | (1L << (MinusAssign - 93)) | (1L << (LeftShiftAssign - 93)) | (1L << (RightShiftAssign - 93)) | (1L << (AndAssign - 93)) | (1L << (XorAssign - 93)) | (1L << (OrAssign - 93)))) != 0)) ) {
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(576);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(578);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(579);
					match(Comma);
					setState(580);
					assignmentExpression();
					}
					} 
				}
				setState(585);
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
		enterRule(_localctx, 60, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 62, RULE_declaration);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				declarationSpecifiers();
				setState(589);
				initDeclaratorList(0);
				setState(590);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				declarationSpecifiers();
				setState(593);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
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
		enterRule(_localctx, 64, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(598);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 66, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(603);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 68, RULE_declarationSpecifier);
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
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
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(616);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(618);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(619);
					match(Comma);
					setState(620);
					initDeclarator();
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 72, RULE_initDeclarator);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				declarator();
				setState(628);
				match(Assign);
				setState(629);
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
		enterRule(_localctx, 74, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTypeSpecifier(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
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
				setState(636);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__4:
				{
				setState(637);
				match(T__4);
				setState(638);
				match(LeftParen);
				setState(639);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(640);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				setState(641);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				setState(642);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(643);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(644);
				typedefName();
				}
				break;
			case T__10:
				{
				setState(645);
				match(T__10);
				setState(646);
				match(LeftParen);
				setState(647);
				constantExpression();
				setState(648);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(652);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(653);
					pointer();
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				structOrUnion();
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(660);
					match(Identifier);
					}
				}

				setState(663);
				match(LeftBrace);
				setState(664);
				structDeclarationList(0);
				setState(665);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				structOrUnion();
				setState(668);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CMieuxParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CMieuxParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitStructOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
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
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(675);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(677);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(678);
					structDeclaration();
					}
					} 
				}
				setState(683);
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
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Colon - 63)) | (1L << (Identifier - 63)))) != 0)) {
					{
					setState(685);
					structDeclaratorList(0);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
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
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				typeSpecifier(0);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(694);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				typeQualifier();
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(698);
					specifierQualifierList();
					}
					break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(704);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(706);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(707);
					match(Comma);
					setState(708);
					structDeclarator();
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Identifier - 63)))) != 0)) {
					{
					setState(715);
					declarator();
					}
				}

				setState(718);
				match(Colon);
				setState(719);
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
		public TerminalNode Enum() { return getToken(CMieuxParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumSpecifier);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(Enum);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(723);
					match(Identifier);
					}
				}

				setState(726);
				match(LeftBrace);
				setState(727);
				enumeratorList(0);
				setState(728);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(Enum);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(731);
					match(Identifier);
					}
				}

				setState(734);
				match(LeftBrace);
				setState(735);
				enumeratorList(0);
				setState(736);
				match(Comma);
				setState(737);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				match(Enum);
				setState(740);
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
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(744);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(746);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(747);
					match(Comma);
					setState(748);
					enumerator();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				enumerationConstant();
				setState(756);
				match(Assign);
				setState(757);
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
			setState(761);
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
			setState(763);
			match(Atomic);
			setState(764);
			match(LeftParen);
			setState(765);
			typeName();
			setState(766);
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
			setState(768);
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
		public TerminalNode Inline() { return getToken(CMieuxParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CMieuxParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionSpecifier);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				gccAttributeSpecifier();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(T__13);
				setState(773);
				match(LeftParen);
				setState(774);
				match(Identifier);
				setState(775);
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
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(Alignas);
				setState(779);
				match(LeftParen);
				setState(780);
				typeName();
				setState(781);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(Alignas);
				setState(784);
				match(LeftParen);
				setState(785);
				constantExpression();
				setState(786);
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
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(790);
				pointer();
				}
			}

			setState(793);
			directDeclarator(0);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(799);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(CMieuxParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDirectDeclarator(this);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(801);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(802);
				match(LeftParen);
				setState(803);
				declarator();
				setState(804);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(806);
				match(Identifier);
				setState(807);
				match(Colon);
				setState(808);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(809);
				match(LeftParen);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(810);
					typeSpecifier(0);
					}
				}

				setState(813);
				pointer();
				setState(814);
				directDeclarator(0);
				setState(815);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(819);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(820);
						match(LeftBracket);
						setState(822);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(821);
							typeQualifierList(0);
							}
						}

						setState(825);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
							{
							setState(824);
							assignmentExpression();
							}
						}

						setState(827);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(828);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(829);
						match(LeftBracket);
						setState(830);
						match(Static);
						setState(832);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(831);
							typeQualifierList(0);
							}
						}

						setState(834);
						assignmentExpression();
						setState(835);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(837);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(838);
						match(LeftBracket);
						setState(839);
						typeQualifierList(0);
						setState(840);
						match(Static);
						setState(841);
						assignmentExpression();
						setState(842);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(844);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(845);
						match(LeftBracket);
						setState(847);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(846);
							typeQualifierList(0);
							}
						}

						setState(849);
						match(Star);
						setState(850);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(851);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(852);
						match(LeftParen);
						setState(853);
						parameterTypeList();
						setState(854);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(856);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(857);
						match(LeftParen);
						setState(859);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(858);
							identifierList(0);
							}
						}

						setState(861);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		public TerminalNode LeftParen() { return getToken(CMieuxParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CMieuxParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CMieuxParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CMieuxParser.StringLiteral, i);
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
		int _la;
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				match(T__14);
				setState(868);
				match(LeftParen);
				setState(870); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(869);
					match(StringLiteral);
					}
					}
					setState(872); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(874);
				match(RightParen);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
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
		enterRule(_localctx, 114, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T__15);
			setState(879);
			match(LeftParen);
			setState(880);
			match(LeftParen);
			setState(881);
			gccAttributeList();
			setState(882);
			match(RightParen);
			setState(883);
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
		enterRule(_localctx, 116, RULE_gccAttributeList);
		int _la;
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				gccAttribute();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(886);
					match(Comma);
					setState(887);
					gccAttribute();
					}
					}
					setState(892);
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
		enterRule(_localctx, 118, RULE_gccAttribute);
		int _la;
		try {
			setState(905);
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
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case IncludeDirective:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (RightParen - 63)) | (1L << (Comma - 63)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(897);
					match(LeftParen);
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
						{
						setState(898);
						argumentExpressionList(0);
						}
					}

					setState(901);
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CMieuxParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CMieuxParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CMieuxParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CMieuxParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitNestedParenthesesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Comma - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (ComplexDefine - 65)) | (1L << (IncludeDirective - 65)) | (1L << (AsmBlock - 65)) | (1L << (LineAfterPreprocessing - 65)) | (1L << (LineDirective - 65)) | (1L << (PragmaDirective - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
				{
				setState(912);
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
				case Comma:
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
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(907);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(908);
					match(LeftParen);
					setState(909);
					nestedParenthesesBlock();
					setState(910);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(916);
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

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CMieuxParser.Caret, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pointer);
		int _la;
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(Star);
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(918);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(Star);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(922);
					typeQualifierList(0);
					}
				}

				setState(925);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(Caret);
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(927);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				match(Caret);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(931);
					typeQualifierList(0);
					}
				}

				setState(934);
				pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
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
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(938);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(940);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(941);
					typeQualifier();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CMieuxParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParameterTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameterTypeList);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				parameterList(0);
				setState(949);
				match(Comma);
				setState(950);
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
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(955);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(957);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(958);
					match(Comma);
					setState(959);
					parameterDeclaration();
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterDeclaration);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				declarationSpecifiers();
				setState(966);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				declarationSpecifiers2();
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(969);
					abstractDeclarator();
					}
					break;
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
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(975);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(977);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(978);
					match(Comma);
					setState(979);
					match(Identifier);
					}
					} 
				}
				setState(984);
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
			unrollRecursionContexts(_parentctx);
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
			setState(985);
			specifierQualifierList();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (LeftBracket - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)))) != 0)) {
				{
				setState(986);
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
			int _alt;
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(990);
					pointer();
					}
				}

				setState(993);
				directAbstractDeclarator(0);
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(994);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(999);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CMieuxParser.Static, 0); }
		public TerminalNode Star() { return getToken(CMieuxParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
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
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1003);
				match(LeftParen);
				setState(1004);
				abstractDeclarator();
				setState(1005);
				match(RightParen);
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1006);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1011);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1012);
				match(LeftBracket);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1013);
					typeQualifierList(0);
					}
				}

				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1016);
					assignmentExpression();
					}
				}

				setState(1019);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(1020);
				match(LeftBracket);
				setState(1021);
				match(Static);
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1022);
					typeQualifierList(0);
					}
				}

				setState(1025);
				assignmentExpression();
				setState(1026);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(1028);
				match(LeftBracket);
				setState(1029);
				typeQualifierList(0);
				setState(1030);
				match(Static);
				setState(1031);
				assignmentExpression();
				setState(1032);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(1034);
				match(LeftBracket);
				setState(1035);
				match(Star);
				setState(1036);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(1037);
				match(LeftParen);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(1038);
					parameterTypeList();
					}
				}

				setState(1041);
				match(RightParen);
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1042);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1047);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1091);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1050);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1051);
						match(LeftBracket);
						setState(1053);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1052);
							typeQualifierList(0);
							}
						}

						setState(1056);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
							{
							setState(1055);
							assignmentExpression();
							}
						}

						setState(1058);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1059);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1060);
						match(LeftBracket);
						setState(1061);
						match(Static);
						setState(1063);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1062);
							typeQualifierList(0);
							}
						}

						setState(1065);
						assignmentExpression();
						setState(1066);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1068);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1069);
						match(LeftBracket);
						setState(1070);
						typeQualifierList(0);
						setState(1071);
						match(Static);
						setState(1072);
						assignmentExpression();
						setState(1073);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1075);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1076);
						match(LeftBracket);
						setState(1077);
						match(Star);
						setState(1078);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1079);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1080);
						match(LeftParen);
						setState(1082);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(1081);
							parameterTypeList();
							}
						}

						setState(1084);
						match(RightParen);
						setState(1088);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1085);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1090);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
			setState(1096);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CMieuxParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CMieuxParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(LeftBrace);
				setState(1100);
				initializerList(0);
				setState(1101);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(LeftBrace);
				setState(1104);
				initializerList(0);
				setState(1105);
				match(Comma);
				setState(1106);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1111);
				designation();
				}
			}

			setState(1114);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1117);
					match(Comma);
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1118);
						designation();
						}
					}

					setState(1121);
					initializer();
					}
					} 
				}
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CMieuxParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			designatorList(0);
			setState(1128);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDesignatorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1134);
					designator();
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CMieuxParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CMieuxParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CMieuxParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_designator);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(LeftBracket);
				setState(1141);
				constantExpression();
				setState(1142);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				match(Dot);
				setState(1145);
				match(Identifier);
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
		enterRule(_localctx, 152, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(StaticAssert);
			setState(1149);
			match(LeftParen);
			setState(1150);
			constantExpression();
			setState(1151);
			match(Comma);
			setState(1153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1152);
				match(StringLiteral);
				}
				}
				setState(1155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1157);
			match(RightParen);
			setState(1158);
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
		enterRule(_localctx, 154, RULE_statement);
		int _la;
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				deferStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				freeStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				labeledStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1163);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1165);
				selectionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1166);
				iterationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1167);
				jumpStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1168);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1169);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1170);
				match(LeftParen);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1171);
					logicalOrExpression(0);
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1172);
						match(Comma);
						setState(1173);
						logicalOrExpression(0);
						}
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1181);
					match(Colon);
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
						{
						setState(1182);
						logicalOrExpression(0);
						setState(1187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1183);
							match(Comma);
							setState(1184);
							logicalOrExpression(0);
							}
							}
							setState(1189);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1197);
				match(RightParen);
				setState(1198);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CMieuxParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CMieuxParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CMieuxParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_labeledStatement);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				match(Identifier);
				setState(1202);
				match(Colon);
				setState(1203);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				match(Case);
				setState(1205);
				constantExpression();
				setState(1206);
				match(Colon);
				setState(1207);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				match(Default);
				setState(1210);
				match(Colon);
				setState(1211);
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
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
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
		enterRule(_localctx, 158, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LeftBrace);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(1215);
				blockItemList(0);
				}
			}

			setState(1218);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1221);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1224);
					blockItem();
					}
					} 
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 162, RULE_blockItem);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
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
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 164, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
				{
				setState(1234);
				expression(0);
				}
			}

			setState(1237);
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
		enterRule(_localctx, 166, RULE_selectionStatement);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				match(If);
				setState(1240);
				match(LeftParen);
				setState(1241);
				expression(0);
				setState(1242);
				match(RightParen);
				setState(1243);
				statement();
				setState(1246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1244);
					match(Else);
					setState(1245);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(Switch);
				setState(1249);
				match(LeftParen);
				setState(1250);
				expression(0);
				setState(1251);
				match(RightParen);
				setState(1252);
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
		enterRule(_localctx, 168, RULE_iterationStatement);
		try {
			setState(1276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				match(While);
				setState(1257);
				match(LeftParen);
				setState(1258);
				expression(0);
				setState(1259);
				match(RightParen);
				setState(1260);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(Do);
				setState(1263);
				statement();
				setState(1264);
				match(While);
				setState(1265);
				match(LeftParen);
				setState(1266);
				expression(0);
				setState(1267);
				match(RightParen);
				setState(1268);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1270);
				match(For);
				setState(1271);
				match(LeftParen);
				setState(1272);
				forCondition();
				setState(1273);
				match(RightParen);
				setState(1274);
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
		enterRule(_localctx, 170, RULE_forCondition);
		int _la;
		try {
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				forDeclaration();
				setState(1279);
				match(Semi);
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1280);
					forExpression(0);
					}
				}

				setState(1283);
				match(Semi);
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1284);
					forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1287);
					expression(0);
					}
				}

				setState(1290);
				match(Semi);
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1291);
					forExpression(0);
					}
				}

				setState(1294);
				match(Semi);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1295);
					forExpression(0);
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
		enterRule(_localctx, 172, RULE_forDeclaration);
		try {
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				declarationSpecifiers();
				setState(1301);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				declarationSpecifiers();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CMieuxParser.Comma, 0); }
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
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1307);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1309);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1310);
					match(Comma);
					setState(1311);
					assignmentExpression();
					}
					} 
				}
				setState(1316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(CMieuxParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CMieuxParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(CMieuxParser.Continue, 0); }
		public TerminalNode Break() { return getToken(CMieuxParser.Break, 0); }
		public TerminalNode Return() { return getToken(CMieuxParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_jumpStatement);
		int _la;
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				match(Goto);
				setState(1318);
				match(Identifier);
				setState(1319);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(Continue);
				setState(1321);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				match(Break);
				setState(1323);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				match(Return);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)))) != 0)) {
					{
					setState(1325);
					expression(0);
					}
				}

				setState(1328);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1329);
				match(Goto);
				setState(1330);
				unaryExpression();
				setState(1331);
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
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
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
		enterRule(_localctx, 178, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Caret - 79)) | (1L << (Semi - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1335);
				translationUnit(0);
				}
			}

			setState(1338);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMieuxListener ) ((CMieuxListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMieuxVisitor ) return ((CMieuxVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1341);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1344);
					externalDeclaration();
					}
					} 
				}
				setState(1349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		public TerminalNode Semi() { return getToken(CMieuxParser.Semi, 0); }
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
		enterRule(_localctx, 182, RULE_externalDeclaration);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				autoStructDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352);
				methodDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353);
				methodDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1354);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1355);
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
		enterRule(_localctx, 184, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1358);
				declarationSpecifiers();
				}
				break;
			}
			setState(1361);
			declarator();
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1362);
				declarationList(0);
				}
			}

			setState(1365);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
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
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1368);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1370);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1371);
					declaration();
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 11:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 12:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 16:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 17:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 18:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 19:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 20:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 21:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 22:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 23:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 24:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 25:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 35:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 38:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 41:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 44:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 47:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 55:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 62:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 64:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 66:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 69:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 72:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 74:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 80:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 87:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 90:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 93:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 8);
		case 33:
			return precpred(_ctx, 7);
		case 34:
			return precpred(_ctx, 6);
		case 35:
			return precpred(_ctx, 5);
		case 36:
			return precpred(_ctx, 4);
		case 37:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 4);
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u0564\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\u00c4\n\2\3\2\5\2\u00c7\n\2\3\3\3\3\5\3\u00cb\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00d3\n\4\3\4\5\4\u00d6\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\5\7\u00e0\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e7\n\7\3"+
		"\7\3\7\3\7\3\b\5\b\u00ed\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f4\n\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\6\t\u00fc\n\t\r\t\16\t\u00fd\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0106\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u011a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0129\n\13\f\13\16\13\u012c\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0135\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0159\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0163\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0170"+
		"\n\r\f\r\16\r\u0173\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u017b\n\16"+
		"\f\16\16\16\u017e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0196"+
		"\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u01a7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01b5\n\22\f\22\16\22\u01b8\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01c3\n\23\f\23\16\23\u01c6\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01d1\n\24\f\24\16"+
		"\24\u01d4\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u01e5\n\25\f\25\16\25\u01e8\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01f3\n\26\f\26\16\26\u01f6\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01fe\n\27\f\27\16\27\u0201\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0209\n\30\f\30\16\30\u020c\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0214\n\31\f\31\16\31\u0217\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u021f\n\32\f\32\16\32\u0222\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u022a\n\33\f\33\16\33\u022d\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0235\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u023e\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0248\n\37\f\37\16\37\u024b\13\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\5!\u0257\n!\3\"\6\"\u025a\n\"\r\"\16\"\u025b\3#\6#\u025f\n#\r#\16#\u0260"+
		"\3$\3$\3$\3$\3$\5$\u0268\n$\3%\3%\3%\3%\3%\3%\7%\u0270\n%\f%\16%\u0273"+
		"\13%\3&\3&\3&\3&\3&\5&\u027a\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\5(\u028d\n(\3(\3(\7(\u0291\n(\f(\16(\u0294\13(\3)\3)\5"+
		")\u0298\n)\3)\3)\3)\3)\3)\3)\3)\5)\u02a1\n)\3*\3*\3+\3+\3+\3+\3+\7+\u02aa"+
		"\n+\f+\16+\u02ad\13+\3,\3,\5,\u02b1\n,\3,\3,\3,\5,\u02b6\n,\3-\3-\5-\u02ba"+
		"\n-\3-\3-\5-\u02be\n-\5-\u02c0\n-\3.\3.\3.\3.\3.\3.\7.\u02c8\n.\f.\16"+
		".\u02cb\13.\3/\3/\5/\u02cf\n/\3/\3/\5/\u02d3\n/\3\60\3\60\5\60\u02d7\n"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02df\n\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u02e8\n\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02f0"+
		"\n\61\f\61\16\61\u02f3\13\61\3\62\3\62\3\62\3\62\3\62\5\62\u02fa\n\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u030b\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0317\n\67\38\58\u031a\n8\38\38\78\u031e\n8\f8\168\u0321\138\39"+
		"\39\39\39\39\39\39\39\39\39\39\59\u032e\n9\39\39\39\39\59\u0334\n9\39"+
		"\39\39\59\u0339\n9\39\59\u033c\n9\39\39\39\39\39\59\u0343\n9\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\59\u0352\n9\39\39\39\39\39\39\39\39\39"+
		"\39\59\u035e\n9\39\79\u0361\n9\f9\169\u0364\139\3:\3:\3:\6:\u0369\n:\r"+
		":\16:\u036a\3:\3:\5:\u036f\n:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\7<\u037b\n"+
		"<\f<\16<\u037e\13<\3<\5<\u0381\n<\3=\3=\3=\5=\u0386\n=\3=\5=\u0389\n="+
		"\3=\5=\u038c\n=\3>\3>\3>\3>\3>\7>\u0393\n>\f>\16>\u0396\13>\3?\3?\5?\u039a"+
		"\n?\3?\3?\5?\u039e\n?\3?\3?\3?\5?\u03a3\n?\3?\3?\5?\u03a7\n?\3?\5?\u03aa"+
		"\n?\3@\3@\3@\3@\3@\7@\u03b1\n@\f@\16@\u03b4\13@\3A\3A\3A\3A\3A\5A\u03bb"+
		"\nA\3B\3B\3B\3B\3B\3B\7B\u03c3\nB\fB\16B\u03c6\13B\3C\3C\3C\3C\3C\5C\u03cd"+
		"\nC\5C\u03cf\nC\3D\3D\3D\3D\3D\3D\7D\u03d7\nD\fD\16D\u03da\13D\3E\3E\5"+
		"E\u03de\nE\3F\3F\5F\u03e2\nF\3F\3F\7F\u03e6\nF\fF\16F\u03e9\13F\5F\u03eb"+
		"\nF\3G\3G\3G\3G\3G\7G\u03f2\nG\fG\16G\u03f5\13G\3G\3G\5G\u03f9\nG\3G\5"+
		"G\u03fc\nG\3G\3G\3G\3G\5G\u0402\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\5G\u0412\nG\3G\3G\7G\u0416\nG\fG\16G\u0419\13G\5G\u041b\nG\3G"+
		"\3G\3G\5G\u0420\nG\3G\5G\u0423\nG\3G\3G\3G\3G\3G\5G\u042a\nG\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u043d\nG\3G\3G\7G\u0441"+
		"\nG\fG\16G\u0444\13G\7G\u0446\nG\fG\16G\u0449\13G\3H\3H\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\5I\u0457\nI\3J\3J\5J\u045b\nJ\3J\3J\3J\3J\3J\5J\u0462"+
		"\nJ\3J\7J\u0465\nJ\fJ\16J\u0468\13J\3K\3K\3K\3L\3L\3L\3L\3L\7L\u0472\n"+
		"L\fL\16L\u0475\13L\3M\3M\3M\3M\3M\3M\5M\u047d\nM\3N\3N\3N\3N\3N\6N\u0484"+
		"\nN\rN\16N\u0485\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7"+
		"O\u0499\nO\fO\16O\u049c\13O\5O\u049e\nO\3O\3O\3O\3O\7O\u04a4\nO\fO\16"+
		"O\u04a7\13O\5O\u04a9\nO\7O\u04ab\nO\fO\16O\u04ae\13O\3O\3O\5O\u04b2\n"+
		"O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04bf\nP\3Q\3Q\5Q\u04c3\nQ\3Q\3"+
		"Q\3R\3R\3R\3R\3R\7R\u04cc\nR\fR\16R\u04cf\13R\3S\3S\5S\u04d3\nS\3T\5T"+
		"\u04d6\nT\3T\3T\3U\3U\3U\3U\3U\3U\3U\5U\u04e1\nU\3U\3U\3U\3U\3U\3U\5U"+
		"\u04e9\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\5V\u04ff\nV\3W\3W\3W\5W\u0504\nW\3W\3W\5W\u0508\nW\3W\5W\u050b\nW\3W"+
		"\3W\5W\u050f\nW\3W\3W\5W\u0513\nW\5W\u0515\nW\3X\3X\3X\3X\5X\u051b\nX"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0523\nY\fY\16Y\u0526\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u0531\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u0538\nZ\3[\5[\u053b\n[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\7\\\u0544\n\\\f\\\16\\\u0547\13\\\3]\3]\3]\3]\3]\3]\5]"+
		"\u054f\n]\3^\5^\u0552\n^\3^\3^\5^\u0556\n^\3^\3^\3_\3_\3_\3_\3_\7_\u055f"+
		"\n_\f_\16_\u0562\13_\3_\2 \24\30\32\"$&(*,.\60\62\64<HNTZ`p~\u0082\u0086"+
		"\u008c\u0092\u0096\u00a2\u00b0\u00b6\u00bc`\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\16\7\2MMOOQQTTYZ\3\2_i\b"+
		"\2\25\25  ((..\61\61@@\n\2\n\f\30\30\35\35!!&\'+,\63\64:;\3\2\n\f\4\2"+
		"//\62\62\6\2\31\31))\65\6599\5\2\16\17%%>>\4\2AB^^\3\2AB\4\2\21\21\23"+
		"\23\4\2\24\24\65\65\2\u05e1\2\u00be\3\2\2\2\4\u00c8\3\2\2\2\6\u00ce\3"+
		"\2\2\2\b\u00d7\3\2\2\2\n\u00da\3\2\2\2\f\u00df\3\2\2\2\16\u00ec\3\2\2"+
		"\2\20\u0119\3\2\2\2\22\u011b\3\2\2\2\24\u0122\3\2\2\2\26\u0134\3\2\2\2"+
		"\30\u0158\3\2\2\2\32\u0174\3\2\2\2\34\u0195\3\2\2\2\36\u0197\3\2\2\2 "+
		"\u01a6\3\2\2\2\"\u01a8\3\2\2\2$\u01b9\3\2\2\2&\u01c7\3\2\2\2(\u01d5\3"+
		"\2\2\2*\u01e9\3\2\2\2,\u01f7\3\2\2\2.\u0202\3\2\2\2\60\u020d\3\2\2\2\62"+
		"\u0218\3\2\2\2\64\u0223\3\2\2\2\66\u022e\3\2\2\28\u023d\3\2\2\2:\u023f"+
		"\3\2\2\2<\u0241\3\2\2\2>\u024c\3\2\2\2@\u0256\3\2\2\2B\u0259\3\2\2\2D"+
		"\u025e\3\2\2\2F\u0267\3\2\2\2H\u0269\3\2\2\2J\u0279\3\2\2\2L\u027b\3\2"+
		"\2\2N\u028c\3\2\2\2P\u02a0\3\2\2\2R\u02a2\3\2\2\2T\u02a4\3\2\2\2V\u02b5"+
		"\3\2\2\2X\u02bf\3\2\2\2Z\u02c1\3\2\2\2\\\u02d2\3\2\2\2^\u02e7\3\2\2\2"+
		"`\u02e9\3\2\2\2b\u02f9\3\2\2\2d\u02fb\3\2\2\2f\u02fd\3\2\2\2h\u0302\3"+
		"\2\2\2j\u030a\3\2\2\2l\u0316\3\2\2\2n\u0319\3\2\2\2p\u0333\3\2\2\2r\u036e"+
		"\3\2\2\2t\u0370\3\2\2\2v\u0380\3\2\2\2x\u038b\3\2\2\2z\u0394\3\2\2\2|"+
		"\u03a9\3\2\2\2~\u03ab\3\2\2\2\u0080\u03ba\3\2\2\2\u0082\u03bc\3\2\2\2"+
		"\u0084\u03ce\3\2\2\2\u0086\u03d0\3\2\2\2\u0088\u03db\3\2\2\2\u008a\u03ea"+
		"\3\2\2\2\u008c\u041a\3\2\2\2\u008e\u044a\3\2\2\2\u0090\u0456\3\2\2\2\u0092"+
		"\u0458\3\2\2\2\u0094\u0469\3\2\2\2\u0096\u046c\3\2\2\2\u0098\u047c\3\2"+
		"\2\2\u009a\u047e\3\2\2\2\u009c\u04b1\3\2\2\2\u009e\u04be\3\2\2\2\u00a0"+
		"\u04c0\3\2\2\2\u00a2\u04c6\3\2\2\2\u00a4\u04d2\3\2\2\2\u00a6\u04d5\3\2"+
		"\2\2\u00a8\u04e8\3\2\2\2\u00aa\u04fe\3\2\2\2\u00ac\u0514\3\2\2\2\u00ae"+
		"\u051a\3\2\2\2\u00b0\u051c\3\2\2\2\u00b2\u0537\3\2\2\2\u00b4\u053a\3\2"+
		"\2\2\u00b6\u053e\3\2\2\2\u00b8\u054e\3\2\2\2\u00ba\u0551\3\2\2\2\u00bc"+
		"\u0559\3\2\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7/\2\2\u00c0\u00c6\7o"+
		"\2\2\u00c1\u00c3\5\4\3\2\u00c2\u00c4\7]\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\7]\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7\3\3\2\2\2\u00c8\u00ca\7E\2\2\u00c9\u00cb"+
		"\5T+\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7F\2\2\u00cd\5\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d5\7o\2\2\u00d0"+
		"\u00d2\7A\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7B\2\2\u00d5\u00d0\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\7\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5\u009c"+
		"O\2\u00d9\t\3\2\2\2\u00da\u00db\7\5\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd"+
		"\7]\2\2\u00dd\13\3\2\2\2\u00de\u00e0\5B\"\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7\6"+
		"\2\2\u00e3\u00e4\5N(\2\u00e4\u00e6\7A\2\2\u00e5\u00e7\5\u0080A\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7B"+
		"\2\2\u00e9\u00ea\7]\2\2\u00ea\r\3\2\2\2\u00eb\u00ed\5B\"\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7o\2\2\u00ef"+
		"\u00f0\7\6\2\2\u00f0\u00f1\5N(\2\u00f1\u00f3\7A\2\2\u00f2\u00f4\5\u0080"+
		"A\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\7B\2\2\u00f6\u00f7\5\u00a0Q\2\u00f7\17\3\2\2\2\u00f8\u011a\7o\2"+
		"\2\u00f9\u011a\7p\2\2\u00fa\u00fc\7r\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u011a\3\2\2\2\u00ff"+
		"\u0100\7A\2\2\u0100\u0101\5<\37\2\u0101\u0102\7B\2\2\u0102\u011a\3\2\2"+
		"\2\u0103\u011a\5\22\n\2\u0104\u0106\7\7\2\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7A\2\2\u0108\u0109\5\u00a0"+
		"Q\2\u0109\u010a\7B\2\2\u010a\u011a\3\2\2\2\u010b\u010c\7\b\2\2\u010c\u010d"+
		"\7A\2\2\u010d\u010e\5\34\17\2\u010e\u010f\7^\2\2\u010f\u0110\5\u0088E"+
		"\2\u0110\u0111\7B\2\2\u0111\u011a\3\2\2\2\u0112\u0113\7\t\2\2\u0113\u0114"+
		"\7A\2\2\u0114\u0115\5\u0088E\2\u0115\u0116\7^\2\2\u0116\u0117\5\34\17"+
		"\2\u0117\u0118\7B\2\2\u0118\u011a\3\2\2\2\u0119\u00f8\3\2\2\2\u0119\u00f9"+
		"\3\2\2\2\u0119\u00fb\3\2\2\2\u0119\u00ff\3\2\2\2\u0119\u0103\3\2\2\2\u0119"+
		"\u0105\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u0112\3\2\2\2\u011a\21\3\2\2"+
		"\2\u011b\u011c\7<\2\2\u011c\u011d\7A\2\2\u011d\u011e\58\35\2\u011e\u011f"+
		"\7^\2\2\u011f\u0120\5\24\13\2\u0120\u0121\7B\2\2\u0121\23\3\2\2\2\u0122"+
		"\u0123\b\13\1\2\u0123\u0124\5\26\f\2\u0124\u012a\3\2\2\2\u0125\u0126\f"+
		"\3\2\2\u0126\u0127\7^\2\2\u0127\u0129\5\26\f\2\u0128\u0125\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\25\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012d\u012e\5\u0088E\2\u012e\u012f\7\\\2\2\u012f"+
		"\u0130\58\35\2\u0130\u0135\3\2\2\2\u0131\u0132\7\33\2\2\u0132\u0133\7"+
		"\\\2\2\u0133\u0135\58\35\2\u0134\u012d\3\2\2\2\u0134\u0131\3\2\2\2\u0135"+
		"\27\3\2\2\2\u0136\u0137\b\r\1\2\u0137\u0159\5\20\t\2\u0138\u0139\7A\2"+
		"\2\u0139\u013a\5\u0088E\2\u013a\u013b\7B\2\2\u013b\u013c\7E\2\2\u013c"+
		"\u013d\5\u0092J\2\u013d\u013e\7F\2\2\u013e\u0159\3\2\2\2\u013f\u0140\7"+
		"A\2\2\u0140\u0141\5\u0088E\2\u0141\u0142\7B\2\2\u0142\u0143\7E\2\2\u0143"+
		"\u0144\5\u0092J\2\u0144\u0145\7^\2\2\u0145\u0146\7F\2\2\u0146\u0159\3"+
		"\2\2\2\u0147\u0148\7\7\2\2\u0148\u0149\7A\2\2\u0149\u014a\5\u0088E\2\u014a"+
		"\u014b\7B\2\2\u014b\u014c\7E\2\2\u014c\u014d\5\u0092J\2\u014d\u014e\7"+
		"F\2\2\u014e\u0159\3\2\2\2\u014f\u0150\7\7\2\2\u0150\u0151\7A\2\2\u0151"+
		"\u0152\5\u0088E\2\u0152\u0153\7B\2\2\u0153\u0154\7E\2\2\u0154\u0155\5"+
		"\u0092J\2\u0155\u0156\7^\2\2\u0156\u0157\7F\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0136\3\2\2\2\u0158\u0138\3\2\2\2\u0158\u013f\3\2\2\2\u0158\u0147\3\2"+
		"\2\2\u0158\u014f\3\2\2\2\u0159\u0171\3\2\2\2\u015a\u015b\f\f\2\2\u015b"+
		"\u015c\7C\2\2\u015c\u015d\5<\37\2\u015d\u015e\7D\2\2\u015e\u0170\3\2\2"+
		"\2\u015f\u0160\f\13\2\2\u0160\u0162\7A\2\2\u0161\u0163\5\32\16\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0170\7B"+
		"\2\2\u0165\u0166\f\n\2\2\u0166\u0167\7m\2\2\u0167\u0170\7o\2\2\u0168\u0169"+
		"\f\t\2\2\u0169\u016a\7l\2\2\u016a\u0170\7o\2\2\u016b\u016c\f\b\2\2\u016c"+
		"\u0170\7N\2\2\u016d\u016e\f\7\2\2\u016e\u0170\7P\2\2\u016f\u015a\3\2\2"+
		"\2\u016f\u015f\3\2\2\2\u016f\u0165\3\2\2\2\u016f\u0168\3\2\2\2\u016f\u016b"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\31\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\b\16\1"+
		"\2\u0175\u0176\58\35\2\u0176\u017c\3\2\2\2\u0177\u0178\f\3\2\2\u0178\u0179"+
		"\7^\2\2\u0179\u017b\58\35\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\33\3\2\2\2\u017e\u017c\3\2\2"+
		"\2\u017f\u0196\5\30\r\2\u0180\u0181\7N\2\2\u0181\u0196\5\34\17\2\u0182"+
		"\u0183\7P\2\2\u0183\u0196\5\34\17\2\u0184\u0185\5\36\20\2\u0185\u0186"+
		"\5 \21\2\u0186\u0196\3\2\2\2\u0187\u0188\7-\2\2\u0188\u0196\5\34\17\2"+
		"\u0189\u018a\7-\2\2\u018a\u018b\7A\2\2\u018b\u018c\5\u0088E\2\u018c\u018d"+
		"\7B\2\2\u018d\u0196\3\2\2\2\u018e\u018f\78\2\2\u018f\u0190\7A\2\2\u0190"+
		"\u0191\5\u0088E\2\u0191\u0192\7B\2\2\u0192\u0196\3\2\2\2\u0193\u0194\7"+
		"V\2\2\u0194\u0196\7o\2\2\u0195\u017f\3\2\2\2\u0195\u0180\3\2\2\2\u0195"+
		"\u0182\3\2\2\2\u0195\u0184\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u0189\3\2"+
		"\2\2\u0195\u018e\3\2\2\2\u0195\u0193\3\2\2\2\u0196\35\3\2\2\2\u0197\u0198"+
		"\t\2\2\2\u0198\37\3\2\2\2\u0199\u019a\7A\2\2\u019a\u019b\5\u0088E\2\u019b"+
		"\u019c\7B\2\2\u019c\u019d\5 \21\2\u019d\u01a7\3\2\2\2\u019e\u019f\7\7"+
		"\2\2\u019f\u01a0\7A\2\2\u01a0\u01a1\5\u0088E\2\u01a1\u01a2\7B\2\2\u01a2"+
		"\u01a3\5 \21\2\u01a3\u01a7\3\2\2\2\u01a4\u01a7\5\34\17\2\u01a5\u01a7\7"+
		"q\2\2\u01a6\u0199\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7!\3\2\2\2\u01a8\u01a9\b\22\1\2\u01a9\u01aa\5 \21\2"+
		"\u01aa\u01b6\3\2\2\2\u01ab\u01ac\f\5\2\2\u01ac\u01ad\7Q\2\2\u01ad\u01b5"+
		"\5 \21\2\u01ae\u01af\f\4\2\2\u01af\u01b0\7R\2\2\u01b0\u01b5\5 \21\2\u01b1"+
		"\u01b2\f\3\2\2\u01b2\u01b3\7S\2\2\u01b3\u01b5\5 \21\2\u01b4\u01ab\3\2"+
		"\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7#\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b9\u01ba\b\23\1\2\u01ba\u01bb\5\"\22\2\u01bb\u01c4\3\2\2\2\u01bc\u01bd"+
		"\f\4\2\2\u01bd\u01be\7M\2\2\u01be\u01c3\5\"\22\2\u01bf\u01c0\f\3\2\2\u01c0"+
		"\u01c1\7O\2\2\u01c1\u01c3\5\"\22\2\u01c2\u01bc\3\2\2\2\u01c2\u01bf\3\2"+
		"\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"%\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b\24\1\2\u01c8\u01c9\5$\23\2"+
		"\u01c9\u01d2\3\2\2\2\u01ca\u01cb\f\4\2\2\u01cb\u01cc\7K\2\2\u01cc\u01d1"+
		"\5$\23\2\u01cd\u01ce\f\3\2\2\u01ce\u01cf\7L\2\2\u01cf\u01d1\5$\23\2\u01d0"+
		"\u01ca\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\'\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6"+
		"\b\25\1\2\u01d6\u01d7\5&\24\2\u01d7\u01e6\3\2\2\2\u01d8\u01d9\f\6\2\2"+
		"\u01d9\u01da\7G\2\2\u01da\u01e5\5&\24\2\u01db\u01dc\f\5\2\2\u01dc\u01dd"+
		"\7I\2\2\u01dd\u01e5\5&\24\2\u01de\u01df\f\4\2\2\u01df\u01e0\7H\2\2\u01e0"+
		"\u01e5\5&\24\2\u01e1\u01e2\f\3\2\2\u01e2\u01e3\7J\2\2\u01e3\u01e5\5&\24"+
		"\2\u01e4\u01d8\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e1"+
		"\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		")\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\b\26\1\2\u01ea\u01eb\5(\25\2"+
		"\u01eb\u01f4\3\2\2\2\u01ec\u01ed\f\4\2\2\u01ed\u01ee\7j\2\2\u01ee\u01f3"+
		"\5(\25\2\u01ef\u01f0\f\3\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f3\5(\25\2\u01f2"+
		"\u01ec\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5+\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8"+
		"\b\27\1\2\u01f8\u01f9\5*\26\2\u01f9\u01ff\3\2\2\2\u01fa\u01fb\f\3\2\2"+
		"\u01fb\u01fc\7T\2\2\u01fc\u01fe\5*\26\2\u01fd\u01fa\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200-\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0203\b\30\1\2\u0203\u0204\5,\27\2\u0204\u020a\3"+
		"\2\2\2\u0205\u0206\f\3\2\2\u0206\u0207\7X\2\2\u0207\u0209\5,\27\2\u0208"+
		"\u0205\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b/\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\b\31\1\2\u020e\u020f"+
		"\5.\30\2\u020f\u0215\3\2\2\2\u0210\u0211\f\3\2\2\u0211\u0212\7U\2\2\u0212"+
		"\u0214\5.\30\2\u0213\u0210\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\61\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219"+
		"\b\32\1\2\u0219\u021a\5\60\31\2\u021a\u0220\3\2\2\2\u021b\u021c\f\3\2"+
		"\2\u021c\u021d\7V\2\2\u021d\u021f\5\60\31\2\u021e\u021b\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\63\3\2\2"+
		"\2\u0222\u0220\3\2\2\2\u0223\u0224\b\33\1\2\u0224\u0225\5\62\32\2\u0225"+
		"\u022b\3\2\2\2\u0226\u0227\f\3\2\2\u0227\u0228\7W\2\2\u0228\u022a\5\62"+
		"\32\2\u0229\u0226\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\65\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0234\5\64\33"+
		"\2\u022f\u0230\7[\2\2\u0230\u0231\5<\37\2\u0231\u0232\7\\\2\2\u0232\u0233"+
		"\5\66\34\2\u0233\u0235\3\2\2\2\u0234\u022f\3\2\2\2\u0234\u0235\3\2\2\2"+
		"\u0235\67\3\2\2\2\u0236\u023e\5\6\4\2\u0237\u023e\5\66\34\2\u0238\u0239"+
		"\5\34\17\2\u0239\u023a\5:\36\2\u023a\u023b\58\35\2\u023b\u023e\3\2\2\2"+
		"\u023c\u023e\7q\2\2\u023d\u0236\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u0238"+
		"\3\2\2\2\u023d\u023c\3\2\2\2\u023e9\3\2\2\2\u023f\u0240\t\3\2\2\u0240"+
		";\3\2\2\2\u0241\u0242\b\37\1\2\u0242\u0243\58\35\2\u0243\u0249\3\2\2\2"+
		"\u0244\u0245\f\3\2\2\u0245\u0246\7^\2\2\u0246\u0248\58\35\2\u0247\u0244"+
		"\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"=\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\5\66\34\2\u024d?\3\2\2\2\u024e"+
		"\u024f\5B\"\2\u024f\u0250\5H%\2\u0250\u0251\7]\2\2\u0251\u0257\3\2\2\2"+
		"\u0252\u0253\5B\"\2\u0253\u0254\7]\2\2\u0254\u0257\3\2\2\2\u0255\u0257"+
		"\5\u009aN\2\u0256\u024e\3\2\2\2\u0256\u0252\3\2\2\2\u0256\u0255\3\2\2"+
		"\2\u0257A\3\2\2\2\u0258\u025a\5F$\2\u0259\u0258\3\2\2\2\u025a\u025b\3"+
		"\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025cC\3\2\2\2\u025d\u025f"+
		"\5F$\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261E\3\2\2\2\u0262\u0268\5L\'\2\u0263\u0268\5N(\2\u0264"+
		"\u0268\5h\65\2\u0265\u0268\5j\66\2\u0266\u0268\5l\67\2\u0267\u0262\3\2"+
		"\2\2\u0267\u0263\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0266\3\2\2\2\u0268G\3\2\2\2\u0269\u026a\b%\1\2\u026a\u026b\5J&\2\u026b"+
		"\u0271\3\2\2\2\u026c\u026d\f\3\2\2\u026d\u026e\7^\2\2\u026e\u0270\5J&"+
		"\2\u026f\u026c\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272I\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u027a\5n8\2\u0275\u0276"+
		"\5n8\2\u0276\u0277\7_\2\2\u0277\u0278\5\u0090I\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0274\3\2\2\2\u0279\u0275\3\2\2\2\u027aK\3\2\2\2\u027b\u027c\t\4\2\2"+
		"\u027cM\3\2\2\2\u027d\u027e\b(\1\2\u027e\u028d\t\5\2\2\u027f\u0280\7\7"+
		"\2\2\u0280\u0281\7A\2\2\u0281\u0282\t\6\2\2\u0282\u028d\7B\2\2\u0283\u028d"+
		"\5f\64\2\u0284\u028d\5P)\2\u0285\u028d\5^\60\2\u0286\u028d\5\u008eH\2"+
		"\u0287\u0288\7\r\2\2\u0288\u0289\7A\2\2\u0289\u028a\5> \2\u028a\u028b"+
		"\7B\2\2\u028b\u028d\3\2\2\2\u028c\u027d\3\2\2\2\u028c\u027f\3\2\2\2\u028c"+
		"\u0283\3\2\2\2\u028c\u0284\3\2\2\2\u028c\u0285\3\2\2\2\u028c\u0286\3\2"+
		"\2\2\u028c\u0287\3\2\2\2\u028d\u0292\3\2\2\2\u028e\u028f\f\3\2\2\u028f"+
		"\u0291\5|?\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293O\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0297"+
		"\5R*\2\u0296\u0298\7o\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\7E\2\2\u029a\u029b\5T+\2\u029b\u029c\7F\2\2"+
		"\u029c\u02a1\3\2\2\2\u029d\u029e\5R*\2\u029e\u029f\7o\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0\u029d\3\2\2\2\u02a1Q\3\2\2\2\u02a2"+
		"\u02a3\t\7\2\2\u02a3S\3\2\2\2\u02a4\u02a5\b+\1\2\u02a5\u02a6\5V,\2\u02a6"+
		"\u02ab\3\2\2\2\u02a7\u02a8\f\3\2\2\u02a8\u02aa\5V,\2\u02a9\u02a7\3\2\2"+
		"\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acU"+
		"\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\5X-\2\u02af\u02b1\5Z.\2\u02b0"+
		"\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7]"+
		"\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b6\5\u009aN\2\u02b5\u02ae\3\2\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b6W\3\2\2\2\u02b7\u02b9\5N(\2\u02b8\u02ba\5X-\2\u02b9"+
		"\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c0\3\2\2\2\u02bb\u02bd\5h"+
		"\65\2\u02bc\u02be\5X-\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02b7\3\2\2\2\u02bf\u02bb\3\2\2\2\u02c0Y\3\2\2\2"+
		"\u02c1\u02c2\b.\1\2\u02c2\u02c3\5\\/\2\u02c3\u02c9\3\2\2\2\u02c4\u02c5"+
		"\f\3\2\2\u02c5\u02c6\7^\2\2\u02c6\u02c8\5\\/\2\u02c7\u02c4\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca[\3\2\2\2"+
		"\u02cb\u02c9\3\2\2\2\u02cc\u02d3\5n8\2\u02cd\u02cf\5n8\2\u02ce\u02cd\3"+
		"\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7\\\2\2\u02d1"+
		"\u02d3\5> \2\u02d2\u02cc\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d3]\3\2\2\2\u02d4"+
		"\u02d6\7\37\2\2\u02d5\u02d7\7o\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7E\2\2\u02d9\u02da\5`\61\2\u02da"+
		"\u02db\7F\2\2\u02db\u02e8\3\2\2\2\u02dc\u02de\7\37\2\2\u02dd\u02df\7o"+
		"\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\7E\2\2\u02e1\u02e2\5`\61\2\u02e2\u02e3\7^\2\2\u02e3\u02e4\7F\2"+
		"\2\u02e4\u02e8\3\2\2\2\u02e5\u02e6\7\37\2\2\u02e6\u02e8\7o\2\2\u02e7\u02d4"+
		"\3\2\2\2\u02e7\u02dc\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8_\3\2\2\2\u02e9"+
		"\u02ea\b\61\1\2\u02ea\u02eb\5b\62\2\u02eb\u02f1\3\2\2\2\u02ec\u02ed\f"+
		"\3\2\2\u02ed\u02ee\7^\2\2\u02ee\u02f0\5b\62\2\u02ef\u02ec\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2a\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f4\u02fa\5d\63\2\u02f5\u02f6\5d\63\2\u02f6\u02f7"+
		"\7_\2\2\u02f7\u02f8\5> \2\u02f8\u02fa\3\2\2\2\u02f9\u02f4\3\2\2\2\u02f9"+
		"\u02f5\3\2\2\2\u02fac\3\2\2\2\u02fb\u02fc\7o\2\2\u02fce\3\2\2\2\u02fd"+
		"\u02fe\79\2\2\u02fe\u02ff\7A\2\2\u02ff\u0300\5\u0088E\2\u0300\u0301\7"+
		"B\2\2\u0301g\3\2\2\2\u0302\u0303\t\b\2\2\u0303i\3\2\2\2\u0304\u030b\t"+
		"\t\2\2\u0305\u030b\5t;\2\u0306\u0307\7\20\2\2\u0307\u0308\7A\2\2\u0308"+
		"\u0309\7o\2\2\u0309\u030b\7B\2\2\u030a\u0304\3\2\2\2\u030a\u0305\3\2\2"+
		"\2\u030a\u0306\3\2\2\2\u030bk\3\2\2\2\u030c\u030d\7\67\2\2\u030d\u030e"+
		"\7A\2\2\u030e\u030f\5\u0088E\2\u030f\u0310\7B\2\2\u0310\u0317\3\2\2\2"+
		"\u0311\u0312\7\67\2\2\u0312\u0313\7A\2\2\u0313\u0314\5> \2\u0314\u0315"+
		"\7B\2\2\u0315\u0317\3\2\2\2\u0316\u030c\3\2\2\2\u0316\u0311\3\2\2\2\u0317"+
		"m\3\2\2\2\u0318\u031a\5|?\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031f\5p9\2\u031c\u031e\5r:\2\u031d\u031c\3\2\2\2"+
		"\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320o\3"+
		"\2\2\2\u0321\u031f\3\2\2\2\u0322\u0323\b9\1\2\u0323\u0334\7o\2\2\u0324"+
		"\u0325\7A\2\2\u0325\u0326\5n8\2\u0326\u0327\7B\2\2\u0327\u0334\3\2\2\2"+
		"\u0328\u0329\7o\2\2\u0329\u032a\7\\\2\2\u032a\u0334\7q\2\2\u032b\u032d"+
		"\7A\2\2\u032c\u032e\5N(\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0330\5|?\2\u0330\u0331\5p9\2\u0331\u0332\7B\2\2"+
		"\u0332\u0334\3\2\2\2\u0333\u0322\3\2\2\2\u0333\u0324\3\2\2\2\u0333\u0328"+
		"\3\2\2\2\u0333\u032b\3\2\2\2\u0334\u0362\3\2\2\2\u0335\u0336\f\n\2\2\u0336"+
		"\u0338\7C\2\2\u0337\u0339\5~@\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2"+
		"\2\u0339\u033b\3\2\2\2\u033a\u033c\58\35\2\u033b\u033a\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0361\7D\2\2\u033e\u033f\f\t\2\2\u033f"+
		"\u0340\7C\2\2\u0340\u0342\7.\2\2\u0341\u0343\5~@\2\u0342\u0341\3\2\2\2"+
		"\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\58\35\2\u0345\u0346"+
		"\7D\2\2\u0346\u0361\3\2\2\2\u0347\u0348\f\b\2\2\u0348\u0349\7C\2\2\u0349"+
		"\u034a\5~@\2\u034a\u034b\7.\2\2\u034b\u034c\58\35\2\u034c\u034d\7D\2\2"+
		"\u034d\u0361\3\2\2\2\u034e\u034f\f\7\2\2\u034f\u0351\7C\2\2\u0350\u0352"+
		"\5~@\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\7Q\2\2\u0354\u0361\7D\2\2\u0355\u0356\f\6\2\2\u0356\u0357\7A\2"+
		"\2\u0357\u0358\5\u0080A\2\u0358\u0359\7B\2\2\u0359\u0361\3\2\2\2\u035a"+
		"\u035b\f\5\2\2\u035b\u035d\7A\2\2\u035c\u035e\5\u0086D\2\u035d\u035c\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\7B\2\2\u0360"+
		"\u0335\3\2\2\2\u0360\u033e\3\2\2\2\u0360\u0347\3\2\2\2\u0360\u034e\3\2"+
		"\2\2\u0360\u0355\3\2\2\2\u0360\u035a\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363q\3\2\2\2\u0364\u0362\3\2\2\2"+
		"\u0365\u0366\7\21\2\2\u0366\u0368\7A\2\2\u0367\u0369\7r\2\2\u0368\u0367"+
		"\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u036f\7B\2\2\u036d\u036f\5t;\2\u036e\u0365\3\2\2"+
		"\2\u036e\u036d\3\2\2\2\u036fs\3\2\2\2\u0370\u0371\7\22\2\2\u0371\u0372"+
		"\7A\2\2\u0372\u0373\7A\2\2\u0373\u0374\5v<\2\u0374\u0375\7B\2\2\u0375"+
		"\u0376\7B\2\2\u0376u\3\2\2\2\u0377\u037c\5x=\2\u0378\u0379\7^\2\2\u0379"+
		"\u037b\5x=\2\u037a\u0378\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2"+
		"\2\u037c\u037d\3\2\2\2\u037d\u0381\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381"+
		"\3\2\2\2\u0380\u0377\3\2\2\2\u0380\u037f\3\2\2\2\u0381w\3\2\2\2\u0382"+
		"\u0388\n\n\2\2\u0383\u0385\7A\2\2\u0384\u0386\5\32\16\2\u0385\u0384\3"+
		"\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\7B\2\2\u0388"+
		"\u0383\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u038c\3\2"+
		"\2\2\u038b\u0382\3\2\2\2\u038b\u038a\3\2\2\2\u038cy\3\2\2\2\u038d\u0393"+
		"\n\13\2\2\u038e\u038f\7A\2\2\u038f\u0390\5z>\2\u0390\u0391\7B\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u038d\3\2\2\2\u0392\u038e\3\2\2\2\u0393\u0396\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395{\3\2\2\2\u0396\u0394"+
		"\3\2\2\2\u0397\u0399\7Q\2\2\u0398\u039a\5~@\2\u0399\u0398\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u03aa\3\2\2\2\u039b\u039d\7Q\2\2\u039c\u039e\5~@"+
		"\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03aa"+
		"\5|?\2\u03a0\u03a2\7X\2\2\u03a1\u03a3\5~@\2\u03a2\u03a1\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03aa\3\2\2\2\u03a4\u03a6\7X\2\2\u03a5\u03a7\5~@"+
		"\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa"+
		"\5|?\2\u03a9\u0397\3\2\2\2\u03a9\u039b\3\2\2\2\u03a9\u03a0\3\2\2\2\u03a9"+
		"\u03a4\3\2\2\2\u03aa}\3\2\2\2\u03ab\u03ac\b@\1\2\u03ac\u03ad\5h\65\2\u03ad"+
		"\u03b2\3\2\2\2\u03ae\u03af\f\3\2\2\u03af\u03b1\5h\65\2\u03b0\u03ae\3\2"+
		"\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\177\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03bb\5\u0082B\2\u03b6\u03b7\5"+
		"\u0082B\2\u03b7\u03b8\7^\2\2\u03b8\u03b9\7n\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
		"\u03b5\3\2\2\2\u03ba\u03b6\3\2\2\2\u03bb\u0081\3\2\2\2\u03bc\u03bd\bB"+
		"\1\2\u03bd\u03be\5\u0084C\2\u03be\u03c4\3\2\2\2\u03bf\u03c0\f\3\2\2\u03c0"+
		"\u03c1\7^\2\2\u03c1\u03c3\5\u0084C\2\u03c2\u03bf\3\2\2\2\u03c3\u03c6\3"+
		"\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u0083\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c7\u03c8\5B\"\2\u03c8\u03c9\5n8\2\u03c9\u03cf\3\2\2"+
		"\2\u03ca\u03cc\5D#\2\u03cb\u03cd\5\u008aF\2\u03cc\u03cb\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03c7\3\2\2\2\u03ce\u03ca\3\2"+
		"\2\2\u03cf\u0085\3\2\2\2\u03d0\u03d1\bD\1\2\u03d1\u03d2\7o\2\2\u03d2\u03d8"+
		"\3\2\2\2\u03d3\u03d4\f\3\2\2\u03d4\u03d5\7^\2\2\u03d5\u03d7\7o\2\2\u03d6"+
		"\u03d3\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2"+
		"\2\2\u03d9\u0087\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dd\5X-\2\u03dc\u03de"+
		"\5\u008aF\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u0089\3\2\2"+
		"\2\u03df\u03eb\5|?\2\u03e0\u03e2\5|?\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\5\u008cG\2\u03e4\u03e6\5r:\2"+
		"\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03df\3\2\2\2\u03ea"+
		"\u03e1\3\2\2\2\u03eb\u008b\3\2\2\2\u03ec\u03ed\bG\1\2\u03ed\u03ee\7A\2"+
		"\2\u03ee\u03ef\5\u008aF\2\u03ef\u03f3\7B\2\2\u03f0\u03f2\5r:\2\u03f1\u03f0"+
		"\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u041b\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f8\7C\2\2\u03f7\u03f9\5~@"+
		"\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03fc"+
		"\58\35\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u041b\7D\2\2\u03fe\u03ff\7C\2\2\u03ff\u0401\7.\2\2\u0400\u0402\5~@\2"+
		"\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404"+
		"\58\35\2\u0404\u0405\7D\2\2\u0405\u041b\3\2\2\2\u0406\u0407\7C\2\2\u0407"+
		"\u0408\5~@\2\u0408\u0409\7.\2\2\u0409\u040a\58\35\2\u040a\u040b\7D\2\2"+
		"\u040b\u041b\3\2\2\2\u040c\u040d\7C\2\2\u040d\u040e\7Q\2\2\u040e\u041b"+
		"\7D\2\2\u040f\u0411\7A\2\2\u0410\u0412\5\u0080A\2\u0411\u0410\3\2\2\2"+
		"\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0417\7B\2\2\u0414\u0416"+
		"\5r:\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u03ec\3\2"+
		"\2\2\u041a\u03f6\3\2\2\2\u041a\u03fe\3\2\2\2\u041a\u0406\3\2\2\2\u041a"+
		"\u040c\3\2\2\2\u041a\u040f\3\2\2\2\u041b\u0447\3\2\2\2\u041c\u041d\f\7"+
		"\2\2\u041d\u041f\7C\2\2\u041e\u0420\5~@\2\u041f\u041e\3\2\2\2\u041f\u0420"+
		"\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u0423\58\35\2\u0422\u0421\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0446\7D\2\2\u0425\u0426\f\6"+
		"\2\2\u0426\u0427\7C\2\2\u0427\u0429\7.\2\2\u0428\u042a\5~@\2\u0429\u0428"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\58\35\2\u042c"+
		"\u042d\7D\2\2\u042d\u0446\3\2\2\2\u042e\u042f\f\5\2\2\u042f\u0430\7C\2"+
		"\2\u0430\u0431\5~@\2\u0431\u0432\7.\2\2\u0432\u0433\58\35\2\u0433\u0434"+
		"\7D\2\2\u0434\u0446\3\2\2\2\u0435\u0436\f\4\2\2\u0436\u0437\7C\2\2\u0437"+
		"\u0438\7Q\2\2\u0438\u0446\7D\2\2\u0439\u043a\f\3\2\2\u043a\u043c\7A\2"+
		"\2\u043b\u043d\5\u0080A\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u0442\7B\2\2\u043f\u0441\5r:\2\u0440\u043f\3\2\2"+
		"\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0446"+
		"\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u041c\3\2\2\2\u0445\u0425\3\2\2\2\u0445"+
		"\u042e\3\2\2\2\u0445\u0435\3\2\2\2\u0445\u0439\3\2\2\2\u0446\u0449\3\2"+
		"\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u008d\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u044a\u044b\7o\2\2\u044b\u008f\3\2\2\2\u044c\u0457\58\35"+
		"\2\u044d\u044e\7E\2\2\u044e\u044f\5\u0092J\2\u044f\u0450\7F\2\2\u0450"+
		"\u0457\3\2\2\2\u0451\u0452\7E\2\2\u0452\u0453\5\u0092J\2\u0453\u0454\7"+
		"^\2\2\u0454\u0455\7F\2\2\u0455\u0457\3\2\2\2\u0456\u044c\3\2\2\2\u0456"+
		"\u044d\3\2\2\2\u0456\u0451\3\2\2\2\u0457\u0091\3\2\2\2\u0458\u045a\bJ"+
		"\1\2\u0459\u045b\5\u0094K\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\5\u0090I\2\u045d\u0466\3\2\2\2\u045e\u045f"+
		"\f\3\2\2\u045f\u0461\7^\2\2\u0460\u0462\5\u0094K\2\u0461\u0460\3\2\2\2"+
		"\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\5\u0090I\2\u0464"+
		"\u045e\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2"+
		"\2\2\u0467\u0093\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a\5\u0096L\2\u046a"+
		"\u046b\7_\2\2\u046b\u0095\3\2\2\2\u046c\u046d\bL\1\2\u046d\u046e\5\u0098"+
		"M\2\u046e\u0473\3\2\2\2\u046f\u0470\f\3\2\2\u0470\u0472\5\u0098M\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u0097\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\7C\2\2\u0477"+
		"\u0478\5> \2\u0478\u0479\7D\2\2\u0479\u047d\3\2\2\2\u047a\u047b\7m\2\2"+
		"\u047b\u047d\7o\2\2\u047c\u0476\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u0099"+
		"\3\2\2\2\u047e\u047f\7?\2\2\u047f\u0480\7A\2\2\u0480\u0481\5> \2\u0481"+
		"\u0483\7^\2\2\u0482\u0484\7r\2\2\u0483\u0482\3\2\2\2\u0484\u0485\3\2\2"+
		"\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488"+
		"\7B\2\2\u0488\u0489\7]\2\2\u0489\u009b\3\2\2\2\u048a\u04b2\5\b\5\2\u048b"+
		"\u04b2\5\n\6\2\u048c\u04b2\5\u009eP\2\u048d\u04b2\5\u00a0Q\2\u048e\u04b2"+
		"\5\u00a6T\2\u048f\u04b2\5\u00a8U\2\u0490\u04b2\5\u00aaV\2\u0491\u04b2"+
		"\5\u00b2Z\2\u0492\u0493\t\f\2\2\u0493\u0494\t\r\2\2\u0494\u049d\7A\2\2"+
		"\u0495\u049a\5\64\33\2\u0496\u0497\7^\2\2\u0497\u0499\5\64\33\2\u0498"+
		"\u0496\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2"+
		"\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u0495\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u04ac\3\2\2\2\u049f\u04a8\7\\\2\2\u04a0\u04a5\5\64"+
		"\33\2\u04a1\u04a2\7^\2\2\u04a2\u04a4\5\64\33\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a9\3\2"+
		"\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a0\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04ab\3\2\2\2\u04aa\u049f\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2"+
		"\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af"+
		"\u04b0\7B\2\2\u04b0\u04b2\7]\2\2\u04b1\u048a\3\2\2\2\u04b1\u048b\3\2\2"+
		"\2\u04b1\u048c\3\2\2\2\u04b1\u048d\3\2\2\2\u04b1\u048e\3\2\2\2\u04b1\u048f"+
		"\3\2\2\2\u04b1\u0490\3\2\2\2\u04b1\u0491\3\2\2\2\u04b1\u0492\3\2\2\2\u04b2"+
		"\u009d\3\2\2\2\u04b3\u04b4\7o\2\2\u04b4\u04b5\7\\\2\2\u04b5\u04bf\5\u009c"+
		"O\2\u04b6\u04b7\7\27\2\2\u04b7\u04b8\5> \2\u04b8\u04b9\7\\\2\2\u04b9\u04ba"+
		"\5\u009cO\2\u04ba\u04bf\3\2\2\2\u04bb\u04bc\7\33\2\2\u04bc\u04bd\7\\\2"+
		"\2\u04bd\u04bf\5\u009cO\2\u04be\u04b3\3\2\2\2\u04be\u04b6\3\2\2\2\u04be"+
		"\u04bb\3\2\2\2\u04bf\u009f\3\2\2\2\u04c0\u04c2\7E\2\2\u04c1\u04c3\5\u00a2"+
		"R\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7F\2\2\u04c5\u00a1\3\2\2\2\u04c6\u04c7\bR\1\2\u04c7\u04c8\5\u00a4"+
		"S\2\u04c8\u04cd\3\2\2\2\u04c9\u04ca\f\3\2\2\u04ca\u04cc\5\u00a4S\2\u04cb"+
		"\u04c9\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2"+
		"\2\2\u04ce\u00a3\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\5\u009cO\2\u04d1"+
		"\u04d3\5@!\2\u04d2\u04d0\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u00a5\3\2\2"+
		"\2\u04d4\u04d6\5<\37\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u04d8\7]\2\2\u04d8\u00a7\3\2\2\2\u04d9\u04da\7$\2\2\u04da"+
		"\u04db\7A\2\2\u04db\u04dc\5<\37\2\u04dc\u04dd\7B\2\2\u04dd\u04e0\5\u009c"+
		"O\2\u04de\u04df\7\36\2\2\u04df\u04e1\5\u009cO\2\u04e0\u04de\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u04e9\3\2\2\2\u04e2\u04e3\7\60\2\2\u04e3\u04e4\7"+
		"A\2\2\u04e4\u04e5\5<\37\2\u04e5\u04e6\7B\2\2\u04e6\u04e7\5\u009cO\2\u04e7"+
		"\u04e9\3\2\2\2\u04e8\u04d9\3\2\2\2\u04e8\u04e2\3\2\2\2\u04e9\u00a9\3\2"+
		"\2\2\u04ea\u04eb\7\66\2\2\u04eb\u04ec\7A\2\2\u04ec\u04ed\5<\37\2\u04ed"+
		"\u04ee\7B\2\2\u04ee\u04ef\5\u009cO\2\u04ef\u04ff\3\2\2\2\u04f0\u04f1\7"+
		"\34\2\2\u04f1\u04f2\5\u009cO\2\u04f2\u04f3\7\66\2\2\u04f3\u04f4\7A\2\2"+
		"\u04f4\u04f5\5<\37\2\u04f5\u04f6\7B\2\2\u04f6\u04f7\7]\2\2\u04f7\u04ff"+
		"\3\2\2\2\u04f8\u04f9\7\"\2\2\u04f9\u04fa\7A\2\2\u04fa\u04fb\5\u00acW\2"+
		"\u04fb\u04fc\7B\2\2\u04fc\u04fd\5\u009cO\2\u04fd\u04ff\3\2\2\2\u04fe\u04ea"+
		"\3\2\2\2\u04fe\u04f0\3\2\2\2\u04fe\u04f8\3\2\2\2\u04ff\u00ab\3\2\2\2\u0500"+
		"\u0501\5\u00aeX\2\u0501\u0503\7]\2\2\u0502\u0504\5\u00b0Y\2\u0503\u0502"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\7]\2\2\u0506"+
		"\u0508\5\u00b0Y\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0515"+
		"\3\2\2\2\u0509\u050b\5<\37\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u050e\7]\2\2\u050d\u050f\5\u00b0Y\2\u050e\u050d\3"+
		"\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\7]\2\2\u0511"+
		"\u0513\5\u00b0Y\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515"+
		"\3\2\2\2\u0514\u0500\3\2\2\2\u0514\u050a\3\2\2\2\u0515\u00ad\3\2\2\2\u0516"+
		"\u0517\5B\"\2\u0517\u0518\5H%\2\u0518\u051b\3\2\2\2\u0519\u051b\5B\"\2"+
		"\u051a\u0516\3\2\2\2\u051a\u0519\3\2\2\2\u051b\u00af\3\2\2\2\u051c\u051d"+
		"\bY\1\2\u051d\u051e\58\35\2\u051e\u0524\3\2\2\2\u051f\u0520\f\3\2\2\u0520"+
		"\u0521\7^\2\2\u0521\u0523\58\35\2\u0522\u051f\3\2\2\2\u0523\u0526\3\2"+
		"\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u00b1\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0527\u0528\7#\2\2\u0528\u0529\7o\2\2\u0529\u0538\7]\2"+
		"\2\u052a\u052b\7\32\2\2\u052b\u0538\7]\2\2\u052c\u052d\7\26\2\2\u052d"+
		"\u0538\7]\2\2\u052e\u0530\7*\2\2\u052f\u0531\5<\37\2\u0530\u052f\3\2\2"+
		"\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0538\7]\2\2\u0533\u0534"+
		"\7#\2\2\u0534\u0535\5\34\17\2\u0535\u0536\7]\2\2\u0536\u0538\3\2\2\2\u0537"+
		"\u0527\3\2\2\2\u0537\u052a\3\2\2\2\u0537\u052c\3\2\2\2\u0537\u052e\3\2"+
		"\2\2\u0537\u0533\3\2\2\2\u0538\u00b3\3\2\2\2\u0539\u053b\5\u00b6\\\2\u053a"+
		"\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7\2"+
		"\2\3\u053d\u00b5\3\2\2\2\u053e\u053f\b\\\1\2\u053f\u0540\5\u00b8]\2\u0540"+
		"\u0545\3\2\2\2\u0541\u0542\f\3\2\2\u0542\u0544\5\u00b8]\2\u0543\u0541"+
		"\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"\u00b7\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u054f\5\2\2\2\u0549\u054f\5\u00ba"+
		"^\2\u054a\u054f\5\16\b\2\u054b\u054f\5\f\7\2\u054c\u054f\5@!\2\u054d\u054f"+
		"\7]\2\2\u054e\u0548\3\2\2\2\u054e\u0549\3\2\2\2\u054e\u054a\3\2\2\2\u054e"+
		"\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054d\3\2\2\2\u054f\u00b9\3\2"+
		"\2\2\u0550\u0552\5B\"\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u0555\5n8\2\u0554\u0556\5\u00bc_\2\u0555\u0554\3"+
		"\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5\u00a0Q\2"+
		"\u0558\u00bb\3\2\2\2\u0559\u055a\b_\1\2\u055a\u055b\5@!\2\u055b\u0560"+
		"\3\2\2\2\u055c\u055d\f\3\2\2\u055d\u055f\5@!\2\u055e\u055c\3\2\2\2\u055f"+
		"\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u00bd\3\2"+
		"\2\2\u0562\u0560\3\2\2\2\u0099\u00c3\u00c6\u00ca\u00d2\u00d5\u00df\u00e6"+
		"\u00ec\u00f3\u00fd\u0105\u0119\u012a\u0134\u0158\u0162\u016f\u0171\u017c"+
		"\u0195\u01a6\u01b4\u01b6\u01c2\u01c4\u01d0\u01d2\u01e4\u01e6\u01f2\u01f4"+
		"\u01ff\u020a\u0215\u0220\u022b\u0234\u023d\u0249\u0256\u025b\u0260\u0267"+
		"\u0271\u0279\u028c\u0292\u0297\u02a0\u02ab\u02b0\u02b5\u02b9\u02bd\u02bf"+
		"\u02c9\u02ce\u02d2\u02d6\u02de\u02e7\u02f1\u02f9\u030a\u0316\u0319\u031f"+
		"\u032d\u0333\u0338\u033b\u0342\u0351\u035d\u0360\u0362\u036a\u036e\u037c"+
		"\u0380\u0385\u0388\u038b\u0392\u0394\u0399\u039d\u03a2\u03a6\u03a9\u03b2"+
		"\u03ba\u03c4\u03cc\u03ce\u03d8\u03dd\u03e1\u03e7\u03ea\u03f3\u03f8\u03fb"+
		"\u0401\u0411\u0417\u041a\u041f\u0422\u0429\u043c\u0442\u0445\u0447\u0456"+
		"\u045a\u0461\u0466\u0473\u047c\u0485\u049a\u049d\u04a5\u04a8\u04ac\u04b1"+
		"\u04be\u04c2\u04cd\u04d2\u04d5\u04e0\u04e8\u04fe\u0503\u0507\u050a\u050e"+
		"\u0512\u0514\u051a\u0524\u0530\u0537\u053a\u0545\u054e\u0551\u0555\u0560";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}