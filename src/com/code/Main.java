package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("test");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String token1 = sc.next();
            String token2 = sc.next();
            System.out.println("hello = " + token1 + " , world = " + token2);
        }
    }
}
