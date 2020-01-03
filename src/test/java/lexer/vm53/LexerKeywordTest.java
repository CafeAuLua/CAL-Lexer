package lexer.vm53;

import org.cafeaulua.common.Token;
import org.cafeaulua.common.vm53.TokenType;
import org.cafeaulua.lexer.Lexer;
import org.cafeaulua.lexer.impl.vm53.StandardLexer;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LexerKeywordTest {
    // TODO: test factory??
    private static String readFileAsString = null;
    private Logger _logger;

    private static String keywordsReader() throws IOException, URISyntaxException {
        if (readFileAsString == null) {
            readFileAsString = new String(Files.readAllBytes(Paths.get(LexerKeywordTest.class.getResource("/keywords-valid.txt").toURI())));
        }

        return readFileAsString;
    }

    private static String[] singleKeywordProvider() throws IOException, URISyntaxException {
        return keywordsReader().split("(\\W|\\n)+");
    }

    @BeforeEach
    void beforeEach() {
        _logger = LoggerFactory.getLogger(this.getClass());
    }

    @ParameterizedTest
    @DisplayName("Single Keyword Parse Type")
    @MethodSource("singleKeywordProvider")
    void singleKeywordParseTypeTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(TokenType.KEYWORD, tokens[0].type);
    }

    @ParameterizedTest
    @DisplayName("Single Keyword Parse Value")
    @MethodSource("singleKeywordProvider")
    void singleKeywordParseValueTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(input, tokens[0].value);
    }

    @ParameterizedTest
    @DisplayName("Single Keyword Array Length")
    @MethodSource("singleKeywordProvider")
    void singleKeywordArrayLengthTest(String input) {
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(input);

        Assertions.assertEquals(1, tokens.length);
    }

    @Test
    @DisplayName("Multiple Keyword Parse Types")
    void multiKeywordsParseTypeTest() throws IOException, URISyntaxException {
        // I don't think this is the correct use of a parameterized test but I'm lazy
        Lexer lexer = new StandardLexer();
        Token[] tokens = lexer.tokenizeString(keywordsReader());

        long expectedAmount = singleKeywordProvider().length;
        // Streams are beautiful things
        long finalCount = Stream.of(tokens)
                .filter((token) -> token.type == TokenType.KEYWORD).count();

        Assertions.assertEquals(expectedAmount, finalCount,
                String.format(
                    "Provided values did not match expected value!\nProvided tokens: %s\nExpected value: %s",
                    formatTokensForAssertMessage(tokens),
                    TokenType.KEYWORD.name
                )
        );
    }

    private static String formatTokensForAssertMessage(Token[] tokens) {
        return Stream.of(tokens).map(t -> String.format("{\"%s\", \"%s\"}", t.type.name, t.value))
                .collect(Collectors.joining(", ", "[ ", " ]"));
    }
}
