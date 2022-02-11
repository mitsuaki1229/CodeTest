package com.code.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Typhoon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int roadsNum = sc.nextInt();
        int dangerousPrecipitation = sc.nextInt();

        List<Route> routes = new ArrayList<>();
        for (int i = 0; i < roadsNum; i++) {
            List<Integer> precipitations = new ArrayList<>();
            routes.add(new Route(i, precipitations));
        }

        for (int i = 0; i < roadsNum; i++) {
            for (int j = 0; j < roadsNum; j++) {
                List<Integer> precipitations = routes.get(j).getPrecipitations();
                precipitations.add(sc.nextInt());
                routes.set(j, new Route(j, precipitations));
            }
        }

        String result = "";
        for (Route route : routes) {
            boolean passed = true;
            for (Integer precipitation : route.getPrecipitations()) {
                if (precipitation >= dangerousPrecipitation) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                if (result == "") {
                    result = String.valueOf(route.getId() + 1);
                } else {
                    result = result + " " + (route.getId() + 1);
                }
            }
        }
        if (result == "") {
            System.out.println("wait");
        } else {
            System.out.println(result);
        }
    }
}

class Route {

    private final int id;
    private final List<Integer> precipitations;

    public Route(int id, List<Integer> precipitations) {
        this.id = id;
        this.precipitations = precipitations;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getPrecipitations() {
        return precipitations;
    }
}
