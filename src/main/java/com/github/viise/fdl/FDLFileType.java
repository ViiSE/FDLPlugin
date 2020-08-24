package com.github.viise.fdl;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsContexts.Label;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FDLFileType extends LanguageFileType {

    public static final FDLFileType INSTANCE = new FDLFileType();

    public FDLFileType() {
        this(FDLLanguage.INSTANCE);
    }

    protected FDLFileType(@NotNull Language language) {
        super(language);
    }

    @Override
    public @NotNull String getName() {
        return "FDL File";
    }

    @Override
    public @NotNull String getDescription() {
        return "FDL language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "fdl";
    }

    @Override
    public @Nullable Icon getIcon() {
        return FDLIcons.FILE;
    }
}
