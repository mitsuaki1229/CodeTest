package com.code.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BandLivesSchedule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bandALiveCount = sc.nextInt();
        List<Integer> bandALives = new ArrayList<Integer>();
        for (int i = 0; i < bandALiveCount; i++) {
            bandALives.add(sc.nextInt());
        }

        int bandBLiveCount = sc.nextInt();
        List<Integer> bandBLives = new ArrayList<Integer>();
        for (int i = 0; i < bandBLiveCount; i++) {
            bandBLives.add(sc.nextInt());
        }

        String lastLive = "";
        for (int d = 1; d <= 31; d++) {
            if (!isLiveDay(bandALives, d) && !isLiveDay(bandBLives, d)) {
                System.out.println("x");
            } else if (isLiveDay(bandALives, d) && isLiveDay(bandBLives, d)) {
                if (lastLive.equals("A")) {
                    lastLive = "B";
                } else {
                    lastLive = "A";
                }
                System.out.println(lastLive);
            } else if (isLiveDay(bandALives, d)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    private static boolean isLiveDay(List<Integer> lives, int day) {
        for (Integer live : lives) {
            if (live == day) {
                return true;
            }
        }
        return false;
    }
}
