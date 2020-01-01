package org.cafeaulua.lexer.impl.vm53;

import org.cafeaulua.common.Token;
import org.cafeaulua.lexer.Lexer;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.InputStream;
import java.nio.file.Path;

public class StandardLexer implements Lexer {
    @Override
    public Token[] tokenizeFile(Path filePath) {
        // TODO: implement
        throw new NotImplementedException();
    }

    @Override
    public Token[] tokenizeString(String source) {
        // TODO: implement
        throw new NotImplementedException();
    }

    @Override
    public Token[] tokenizeStream(InputStream source) {
        // TODO: implement
        throw new NotImplementedException();
    }
}
