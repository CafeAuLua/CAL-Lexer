package exporter;

import org.cafeaulua.common.Token;
import org.cafeaulua.common.vm53.TokenType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CsvExporterTest {
    private static Stream<Token> tokenProvider() {
        return Stream.of(
                new Token(TokenType.INVALID, "INVALID")
        );
    }

    @DisplayName("CSV Individual Token Export")
    @ParameterizedTest
    @MethodSource("tokenProvider")
    public void tokenExportTest(Token token) {
        // TODO
    }

    @DisplayName("CSV Multiple Token Export")
    @Test
    public void testMultiTokenExport() {
        // TODO
    }
}
