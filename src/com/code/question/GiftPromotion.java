package com.code.question;

import java.util.Scanner;

public class GiftPromotion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lotteryNum = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= lotteryNum; i++) {
            String result = "";
            if (i % a == 0) {
                result = "A";
            }
            if (i % b == 0) {
                result = result + "B";
            }
            if (result == "") {
                result = "N";
            }
            System.out.println(result);
        }
    }
}
