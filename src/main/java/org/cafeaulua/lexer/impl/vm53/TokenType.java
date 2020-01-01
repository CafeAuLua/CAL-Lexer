package org.cafeaulua.lexer.impl.vm53;

public enum TokenType {
    // TODO: list all token names. They don't have to be inline with any spec.
    INVALID ("invalid", 0);

    public final String name;
    public final int id;
    TokenType(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
