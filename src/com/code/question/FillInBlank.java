package com.code.question;

import java.util.Scanner;

public class FillInBlank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hundredsPlace = sc.next();
        String onesPlace = sc.next();

        for (int a = 0; a <= 9; a++) {
            for (int i = 0; i <= 9; i++) {
                String leftNum = Integer.valueOf(a).toString() + Integer.valueOf(i).toString();
                String rightNum = Integer.valueOf(i).toString();
                String result = hundredsPlace + Integer.valueOf(a).toString() + onesPlace;
                int calculationResult = Integer.parseInt(leftNum) * Integer.parseInt(rightNum);
                if (calculationResult == Integer.parseInt(result)) {
                    System.out.println(a + " " + i);
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
