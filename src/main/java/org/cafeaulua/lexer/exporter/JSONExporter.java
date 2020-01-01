package org.cafeaulua.lexer.exporter;

import org.cafeaulua.lexer.Exporter;
import org.cafeaulua.lexer.impl.vm53.Token;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.nio.file.Path;

public class JSONExporter implements Exporter {
    @Override
    public void export(Token[] tokens, Path exportPath) {
        // TODO: implement
        throw new NotImplementedException();
    }
}
