package test.com.code.question;

import com.code.question.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PlaygroundTest {

    @Test
    void jShell() {

        Solution solution = new Solution();
        int[][] friends = {{1,1}, {2,2}, {3,3}};
        int[] location = {0,0};
        int k = 2;

        // Note that this code deals with points on a Euclidean plane, and each friend and location are represented by two-dimensional coordinates (x, y).
        int[][] invitedFriends = solution.solution(friends, location, k);

        for (int[] friend : invitedFriends) {
            System.out.println(Arrays.toString(friend));
        }
    }
}
