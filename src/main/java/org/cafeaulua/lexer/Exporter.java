package org.cafeaulua.lexer;

import org.cafeaulua.common.Token;

import java.nio.file.Path;

public interface Exporter {
    void export(Token[] tokens, Path exportPath);
}
