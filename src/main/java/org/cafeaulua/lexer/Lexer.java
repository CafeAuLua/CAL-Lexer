package org.cafeaulua.lexer;

import org.cafeaulua.common.Token;

import java.io.InputStream;
import java.nio.file.Path;

public interface Lexer {
    Token[] tokenizeFile(Path filePath);
    Token[] tokenizeString(String source);
    Token[] tokenizeStream(InputStream source);
}
