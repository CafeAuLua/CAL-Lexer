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
}
