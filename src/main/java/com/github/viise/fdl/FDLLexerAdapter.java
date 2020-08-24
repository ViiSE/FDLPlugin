package com.github.viise.fdl;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class FDLLexerAdapter extends FlexAdapter {

    public FDLLexerAdapter() {
        this(new FDLLexer(null));
    }

    public FDLLexerAdapter(@NotNull FlexLexer flex) {
        super(flex);
    }
}
