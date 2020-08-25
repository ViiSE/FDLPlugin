package com.github.viise.fdl;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class FDLColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
            new AttributesDescriptor("String", FDLSyntaxHighlighter.STRING),
            new AttributesDescriptor("Semicolon", FDLSyntaxHighlighter.SEMI),
            new AttributesDescriptor("Comment (Line)", FDLSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Comment (Block)", FDLSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Integer", FDLSyntaxHighlighter.INTEGER),
            new AttributesDescriptor("Float", FDLSyntaxHighlighter.STRING),
            new AttributesDescriptor("Hex", FDLSyntaxHighlighter.HEX),
            new AttributesDescriptor("Keyword (Var)", FDLSyntaxHighlighter.VAR),
            new AttributesDescriptor("Boolean (True)", FDLSyntaxHighlighter.TRUE),
            new AttributesDescriptor("Boolean (False)", FDLSyntaxHighlighter.FALSE),
            new AttributesDescriptor("Bad", FDLSyntaxHighlighter.BAD_CHAR)
    };

    @Override
    public @Nullable Icon getIcon() {
        return FDLIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new FDLSyntaxHighlighter();
    }

    @Override
    public @NotNull String getDemoText() {
        return "// This is a comment.\n" +
                "{\n" +
                "This is a block comment.\n" +
                "Multiline." +
                "\n}\n" +
                "var a = 2;\n" +
                "Var b = 'hello';\n" +
                "VAR c = \"hello\";\n" +
                "var d = 5.5;\n" +
                "var e = a+d;\n" +
                "var boolT = true;\n" +
                "var boolF = false;";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public @NotNull AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public @NotNull ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "FDL";
    }
}
