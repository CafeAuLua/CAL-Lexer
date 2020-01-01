package org.cafeaulua.lexer.impl.vm53;

public class Token {
    public final String typeName;
    public final String value;

    public Token(String typeName, String value) {
        this.typeName = typeName;
        this.value = value;
    }
}
