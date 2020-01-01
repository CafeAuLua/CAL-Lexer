package org.cafeaulua.lexer;

import org.cafeaulua.lexer.impl.vm53.Token;

import java.nio.file.Path;

public interface Exporter {
    void export(Token[] tokens, Path exportPath);
}
