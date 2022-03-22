package test.com.code.question;

import com.code.question.TextChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextCheckerTest {

    @Test
    void isPalindrome() {
        TextChecker checker = new TextChecker();
        assertTrue(checker.isPalindrome("あいういあ"));
    }

    @Test
    void notPalindrome() {
        TextChecker checker = new TextChecker();
        assertFalse(checker.isPalindrome("あいうえお"));
        assertFalse(checker.isPalindrome(""));
        assertFalse(checker.isPalindrome(null));
    }
}
