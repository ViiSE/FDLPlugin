package com.github.viise.fdl.psi;

import com.github.viise.fdl.FDLLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FDLTokenType extends IElementType {

    public FDLTokenType(@NotNull String debugName) {
        this(debugName, FDLLanguage.INSTANCE);
    }

    public FDLTokenType(@NotNull String debugName, @Nullable Language language) {
        super(debugName, language);
    }

//    @Override
//    public String toString() {
//        return "FDLTokenType." + super.toString();
//    }
}
