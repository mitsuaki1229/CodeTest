package com.code.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Robo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seconds = sc.nextInt();
        int rulesNum = sc.nextInt();

        List<Rule> rules = new ArrayList<Rule>();
        for (int i = 0; i < rulesNum; i++) {
            rules.add(new Rule(sc.nextInt(), sc.next()));
        }

        for (int s = 1; s <= seconds; s++) {
            String operations = "";
            for (Rule rule : rules) {
                if (s % rule.getActionId() == 0) {
                    operations = operations + " " + rule.getOperationName();
                }
            }
            if (operations.isEmpty()) {
                System.out.println(s);
            } else {
                System.out.println(operations.trim());
            }
        }
    }
}

class Rule {

    private int actionId;
    private String operationName;

    public Rule(int actionId, String operationName) {
        this.actionId = actionId;
        this.operationName = operationName;
    }

    public int getActionId() {
        return actionId;
    }

    public String getOperationName() {
        return operationName;
    }
}
