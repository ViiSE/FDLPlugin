package com.github.viise.fdl;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class FDLFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(FDLFileType.INSTANCE);
    }
}
