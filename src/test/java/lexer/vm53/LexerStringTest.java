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

public class LexerStringTest {
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

    @DisplayName("Single Keyword Parse")
    @ParameterizedTest
    @MethodSource("singleKeywordProvider")
    public void singleKeywordParseTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        // TODO: minify to one assertion
        Assertions.assertEquals(1, tokens.length);
        Assertions.assertEquals(TokenType.KEYWORD, tokens[0].type);
        Assertions.assertEquals(input, tokens[0].value);
    }
}
