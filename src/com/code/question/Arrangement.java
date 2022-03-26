package com.code.question;

public class Arrangement {

    public int[][] rotateLeft(int[][] square) {

        int[][] converted = new int[2][2];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                converted[square.length - 1 - j][i] = square[i][j];
            }
        }
        return converted;
    }
}
