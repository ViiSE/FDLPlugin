package com.github.viise.fdl.psi;

import com.github.viise.fdl.FDLFileType;
import com.github.viise.fdl.FDLLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class FDLFile extends PsiFileBase {


    public FDLFile(@NotNull FileViewProvider viewProvider) {
        this(viewProvider, FDLLanguage.INSTANCE);
    }

    public FDLFile(@NotNull FileViewProvider viewProvider, @NotNull Language language) {
        super(viewProvider, language);
    }

    @Override
    public @NotNull FileType getFileType() {
        return FDLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "FDL File";
    }
}
