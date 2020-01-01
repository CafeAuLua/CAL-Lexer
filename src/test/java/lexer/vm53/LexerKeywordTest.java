package lexer.vm53;

import org.cafeaulua.common.Token;
import org.cafeaulua.common.vm53.TokenType;
import org.cafeaulua.lexer.Lexer;
import org.cafeaulua.lexer.impl.vm53.StandardLexer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LexerKeywordTest {
    // TODO: test factory??

    private static Stream<String> singleKeywordProvider() {
        return Stream.of(
                "and",
                "break",
                "do",
                "else",
                "elseif",
                "end",
                "false",
                "for",
                "function",
                "if",
                "in",
                "local",
                "nil",
                "not",
                "or",
                "repeat",
                "return",
                "then",
                "true",
                "until",
                "while"
        );
    }

    @DisplayName("Single Keyword Parse Type")
    @ParameterizedTest
    @MethodSource("singleKeywordProvider")
    public void singleKeywordParseTypeTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(TokenType.KEYWORD, tokens[0].type);
    }

    @DisplayName("Single Keyword Parse Value")
    @ParameterizedTest
    @MethodSource("singleKeywordProvider")
    public void singleKeywordParseValueTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(input, tokens[0].value);
    }

    @DisplayName("Single Keyword Array Length")
    @ParameterizedTest
    @MethodSource("singleKeywordProvider")
    public void singleKeywordArrayLengthTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(1, tokens.length);
    }

    // TODO: keywords in file parsing
}
