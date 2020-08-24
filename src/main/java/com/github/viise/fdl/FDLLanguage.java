package com.github.viise.fdl;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class FDLLanguage extends Language {

    public static final FDLLanguage INSTANCE = new FDLLanguage();

    public FDLLanguage() {
        this("FDL");
    }

    protected FDLLanguage(@NotNull String ID) {
        super(ID);
    }

}
