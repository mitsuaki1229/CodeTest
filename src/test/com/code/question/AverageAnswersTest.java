package test.com.code.question;

import com.code.question.AverageAnswers;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class AverageAnswersTest {

    @Test
    void average() {

        final byte[] input = "2 3 -70 50 30 test 80 40".getBytes();
        final ByteArrayInputStream inStream = new ByteArrayInputStream(input);
        System.setIn(inStream);
        AverageAnswers.main(null);
    }
}
