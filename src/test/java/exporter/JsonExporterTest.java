package exporter;

import org.cafeaulua.lexer.impl.vm53.Token;
import org.cafeaulua.lexer.impl.vm53.TokenType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class JsonExporterTest {
    private static Stream<Token> tokenProvider() {
        return Stream.of(
                new Token(TokenType.INVALID, "INVALID")
        );
    }

    @ParameterizedTest
    @MethodSource("tokenProvider")
    public void testTokenExport(Token token) {
        // TODO
    }
}
