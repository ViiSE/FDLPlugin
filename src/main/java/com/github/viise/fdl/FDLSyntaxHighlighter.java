package com.github.viise.fdl;

import com.github.viise.fdl.psi.FDLTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class FDLSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey VAR = TextAttributesKey.createTextAttributesKey(
            "FDL_VAR",
            DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey USES = TextAttributesKey.createTextAttributesKey(
            "FDL_USES",
            DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
            "FDL_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
            "FDL_COMMENT",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey FLOAT = TextAttributesKey.createTextAttributesKey(
            "FDL_FLOAT",
            DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey INTEGER = TextAttributesKey.createTextAttributesKey(
            "FDL_INTEGER",
            DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey HEX = TextAttributesKey.createTextAttributesKey(
            "FDL_HEX",
            DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey TRUE = TextAttributesKey.createTextAttributesKey(
            "FDL_TRUE",
            DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey FALSE = TextAttributesKey.createTextAttributesKey(
            "FDL_FALSE",
            DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
            "FDL_STRING",
            DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey SEMI = TextAttributesKey.createTextAttributesKey(
            "FDL_SEMI",
            DefaultLanguageHighlighterColors.SEMICOLON);

    public static final TextAttributesKey BAD_CHAR = TextAttributesKey.createTextAttributesKey(
            "FDL_BAD_CHAR",
            HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] FDL_KWORD_KEYS    = new TextAttributesKey[]{VAR, USES, TRUE, FALSE};
    private static final TextAttributesKey[] FDL_COMMENT_KEYS  = new TextAttributesKey[]{LINE_COMMENT, BLOCK_COMMENT};
    private static final TextAttributesKey[] FDL_NUMBER_KEYS   = new TextAttributesKey[]{INTEGER, FLOAT, HEX};
    private static final TextAttributesKey[] FDL_STRING_KEYS   = new TextAttributesKey[]{STRING};
//    private static final TextAttributesKey[] FDL_BOOLEAN_KEYS  = new TextAttributesKey[]{TRUE, FALSE};
    private static final TextAttributesKey[] FDL_SEMI_KEYS     = new TextAttributesKey[]{SEMI};
    private static final TextAttributesKey[] FDL_BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHAR};
    private static final TextAttributesKey[] EMPTY_KEYS        = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new FDLLexerAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(FDLTypes.VAR))
            return FDL_KWORD_KEYS;
        else if(tokenType.equals(FDLTypes.USES))
            return FDL_KWORD_KEYS;
        else if(tokenType.equals(FDLTypes.COMMENT))
            return FDL_COMMENT_KEYS;
        else if(tokenType.equals(FDLTypes.INTEGER))
            return FDL_NUMBER_KEYS;
        else if(tokenType.equals(FDLTypes.FLOAT))
            return FDL_NUMBER_KEYS;
        else if(tokenType.equals(FDLTypes.HEX))
            return FDL_NUMBER_KEYS;
        else if(tokenType.equals(FDLTypes.TRUE))
            return FDL_KWORD_KEYS;
        else if(tokenType.equals(FDLTypes.FALSE))
            return FDL_KWORD_KEYS;
        else if(tokenType.equals(FDLTypes.STRING))
            return FDL_STRING_KEYS;
        else if(tokenType.equals(FDLTypes.SEMI))
            return FDL_SEMI_KEYS;
        else if(tokenType.equals(TokenType.BAD_CHARACTER))
            return FDL_BAD_CHAR_KEYS;
        else
            return EMPTY_KEYS;
    }
}
