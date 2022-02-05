package com.code.question;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MoveBeetles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ordersCount = sc.nextInt();

        List<Beetle> beetles = new ArrayList<Beetle>();
        beetles.add(new Beetle(Beetle.Colour.RED, sc.nextInt()));
        beetles.add(new Beetle(Beetle.Colour.GREEN, sc.nextInt()));
        beetles.add(new Beetle(Beetle.Colour.BLUE, sc.nextInt()));

        List<Order> orders = new ArrayList<Order>();
        for (int i = 0; i < ordersCount; i++) {
            orders.add(new Order(sc.next(), sc.next()));
        }

        for (Order order : orders) {
            switch (order.rgb) {
                case R:
                    beetles.get(Beetle.Colour.RED.getInt()).place = beetles.get(Beetle.Colour.RED.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case G:
                    beetles.get(Beetle.Colour.GREEN.getInt()).place = beetles.get(Beetle.Colour.GREEN.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case B:
                    beetles.get(Beetle.Colour.BLUE.getInt()).place = beetles.get(Beetle.Colour.BLUE.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case Y:
                    beetles.get(Beetle.Colour.RED.getInt()).place = beetles.get(Beetle.Colour.RED.getInt()).place + getMove(order.rl);
                    beetles.get(Beetle.Colour.GREEN.getInt()).place = beetles.get(Beetle.Colour.GREEN.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case M:
                    beetles.get(Beetle.Colour.RED.getInt()).place = beetles.get(Beetle.Colour.RED.getInt()).place + getMove(order.rl);
                    beetles.get(Beetle.Colour.BLUE.getInt()).place = beetles.get(Beetle.Colour.BLUE.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case C:
                    beetles.get(Beetle.Colour.GREEN.getInt()).place = beetles.get(Beetle.Colour.GREEN.getInt()).place + getMove(order.rl);
                    beetles.get(Beetle.Colour.BLUE.getInt()).place = beetles.get(Beetle.Colour.BLUE.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                case W:
                    beetles.get(Beetle.Colour.RED.getInt()).place = beetles.get(Beetle.Colour.RED.getInt()).place + getMove(order.rl);
                    beetles.get(Beetle.Colour.GREEN.getInt()).place = beetles.get(Beetle.Colour.GREEN.getInt()).place + getMove(order.rl);
                    beetles.get(Beetle.Colour.BLUE.getInt()).place = beetles.get(Beetle.Colour.BLUE.getInt()).place + getMove(order.rl);
                    if (observation(beetles)) {
                        return;
                    }
                    continue;
                default:
                    throw new RuntimeException("not support rgb.");
            }
        }
        System.out.println("no");
    }

    private static int getMove(Order.RL rl) {
        if (rl == Order.RL.R) {
            return 1;
        }
        return -1;
    }

    private static boolean observation(List<Beetle> beetles) {
        if (beetles.get(Beetle.Colour.RED.getInt()).place == beetles.get(Beetle.Colour.GREEN.getInt()).place &&
                beetles.get(Beetle.Colour.RED.getInt()).place == beetles.get(Beetle.Colour.BLUE.getInt()).place &&
                beetles.get(Beetle.Colour.BLUE.getInt()).place == beetles.get(Beetle.Colour.GREEN.getInt()).place) {
            System.out.println(beetles.get(Beetle.Colour.RED.getInt()).place);
            return true;
        }
        return false;
    }
}

class Beetle {
    enum Colour {
        RED(0),
        GREEN(1),
        BLUE(2);

        private final int colour;

        Colour(int colour) {
            this.colour = colour;
        }

        public int getInt() {
            return this.colour;
        }
    }

    public Colour colour;
    public int place;

    public Beetle(Colour colour, int place) {
        this.colour = colour;
        this.place = place;
    }
}

class Order {
    enum RL {
        R("R"),
        L("L");

        private final String rl;

        RL(String rl) {
            this.rl = rl;
        }
    }

    enum Rgb {
        R("R"),
        G("G"),
        B("B"),
        Y("Y"),
        M("M"),
        C("C"),
        W("W");

        private final String rgb;

        Rgb(String rgb) {
            this.rgb = rgb;
        }
    }

    public RL rl;
    public Rgb rgb;

    public Order(String rl, String rgb) {
        this.rl = RL.valueOf(rl);
        this.rgb = Rgb.valueOf(rgb);
    }
}
