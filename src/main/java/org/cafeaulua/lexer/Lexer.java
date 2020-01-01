package org.cafeaulua.lexer;

import org.cafeaulua.lexer.impl.vm53.Token;

import java.io.InputStream;
import java.nio.file.Path;

public interface Lexer {
    Token[] parseFromFile(Path filePath);
    Token[] parseFromString(String source);
    Token[] parseFromStream(InputStream source);
}
