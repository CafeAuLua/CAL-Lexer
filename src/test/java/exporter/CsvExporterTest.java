package exporter;

import org.cafeaulua.lexer.impl.vm53.Token;
import org.cafeaulua.lexer.impl.vm53.TokenType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CsvExporterTest {
    private static Stream<Token> tokenProvider() {
        return Stream.of(
                new Token(TokenType.INVALID, "INVALID")
        );
    }

    @DisplayName("CSV Individual Token Export Test")
    @ParameterizedTest
    @MethodSource("tokenProvider")
    public void testTokenExport(Token token) {
        // TODO
    }
}
