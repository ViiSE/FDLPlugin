package com.github.viise.fdl.psi;

import com.github.viise.fdl.FDLLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FDLElementType extends IElementType {

    public FDLElementType(@NotNull String debugName) {
        super(debugName, FDLLanguage.INSTANCE);
    }

    public FDLElementType(@NotNull String debugName, @Nullable Language language) {
        super(debugName, language);
    }
}
