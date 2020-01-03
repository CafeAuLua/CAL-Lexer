package org.cafeaulua.lexer.exporter;

import org.cafeaulua.common.Token;
import org.cafeaulua.lexer.Exporter;
import org.cafeaulua.lexer.NotImplementedException;

import java.nio.file.Path;

public class CsvExporter implements Exporter {
    @Override
    public void export(Token[] tokens, Path exportPath) {
        // TODO: implement
        throw new NotImplementedException();
    }
}
