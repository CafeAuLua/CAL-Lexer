package org.cafeaulua.lexer;

import java.io.InputStream;
import java.nio.file.Path;

public interface Lexer {
    void parseFromFile(Path filePath);
    void parseFromString(String source);
    void parseFromStream(InputStream source);
}
