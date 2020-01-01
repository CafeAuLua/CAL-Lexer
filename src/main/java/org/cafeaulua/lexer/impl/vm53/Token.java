package org.cafeaulua.lexer.impl.vm53;

public class Token<T> {
    public final String typeName;
    public final T value;

    public Token(String typeName, T value) {
        this.typeName = typeName;
        this.value = value;
    }
}
