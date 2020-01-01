package org.cafeaulua.lexer.exporter;

import org.cafeaulua.common.Token;
import org.cafeaulua.lexer.Exporter;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.nio.file.Path;

public class JsonExporter implements Exporter {
    @Override
    public void export(Token[] tokens, Path exportPath) {
        // TODO: implement
        throw new NotImplementedException();
    }
}
