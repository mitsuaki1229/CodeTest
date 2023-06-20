package com.code.question;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static int[][] solution(int[][] friends, int[] location, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(friend -> getDistance(friend, location)));

        System.out.println(pq);

        for (int[] friend : friends) {
            pq.offer(friend);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] invitedFriends = new int[k][2];
        int index = k - 1;
        while (!pq.isEmpty()) {
            invitedFriends[index] = pq.poll();
            index--;
        }

        return invitedFriends;
    }

    private static double getDistance(int[] friend, int[] location) {
        int xDiff = friend[0] - location[0];
        int yDiff = friend[1] - location[1];
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}