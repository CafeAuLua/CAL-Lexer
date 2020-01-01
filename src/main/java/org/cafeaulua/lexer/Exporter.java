package org.cafeaulua.lexer;

import java.nio.file.Path;

public interface Exporter {
    void export(Path exportPath);
}
