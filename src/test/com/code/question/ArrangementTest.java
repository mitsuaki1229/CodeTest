package test.com.code.question;

import com.code.question.Arrangement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrangementTest {

    @Test
    void rotateLeft() {

        int[][] square = new int[2][2];

        // 12
        // 34

        square[0][0] = 1;
        square[0][1] = 2;
        square[1][0] = 3;
        square[1][1] = 4;

        Arrangement arrangement = new Arrangement();
        int[][] converted = arrangement.rotateLeft(square);

        // 24
        // 13

        assertEquals(square[0][0], converted[1][0]);
        assertEquals(square[0][1], converted[0][0]);
        assertEquals(square[1][0], converted[1][1]);
        assertEquals(square[1][1], converted[0][1]);
    }
}
