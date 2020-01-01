package lexer.vm53;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    @DisplayName("Lexer#String Keywords Single Test")
    @ParameterizedTest
    @MethodSource("singleKeywordProvider")
    public void singleKeywordTest(String input) {
        // TODO
        throw new NotImplementedException();
    }
}
