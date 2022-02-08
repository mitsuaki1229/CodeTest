package com.code.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageAnswers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answerersNum = sc.nextInt();
        int questionsNum = sc.nextInt();

        List<Answerer> answerers = new ArrayList<>();
        for (int a = 0; a < answerersNum; a++) {
            List<Answer> answers = new ArrayList<>();
            for (int q = 0; q < questionsNum; q++) {
                answers.add(new Answer(q, sc.next()));
            }
            answerers.add(new Answerer(a, answers));
        }

        List<Answerer> normalizedAnswerers = new ArrayList<>();
        for (Answerer answerer : answerers) {
            List<Answer> normalizedAnswers = new ArrayList<>();
            for (Answer answer : answerer.getAnswers()) {
                Integer normalizedAnswer;
                try {
                    normalizedAnswer = Integer.parseInt(answer.getAnswerContent());
                } catch (Exception e) {
                    continue;
                }
                if (normalizedAnswer > 100 || normalizedAnswer < 0) {
                    continue;
                }
                normalizedAnswers.add(new Answer(answer.getId(), answer.getAnswerContent()));
            }
            normalizedAnswerers.add(new Answerer(answerer.getId(), normalizedAnswers));
        }

        for (int q = 0; q < questionsNum; q++) {
            List<Answer> answers = new ArrayList<>();
            for (Answerer answerer : normalizedAnswerers) {
                int finalQ = q;
                List<Answer> tempAnswers = answerer.getAnswers().stream().filter(s -> s.getId() == finalQ).collect(Collectors.toList());
                if (tempAnswers.isEmpty()) {
                    continue;
                }
                answers.addAll(tempAnswers);
            }
            int sum = answers.stream().mapToInt(s -> Integer.parseInt(s.getAnswerContent())).sum();
            if (sum == 0) {
                System.out.println(0);
                continue;
            }
            System.out.println(sum / answers.size());
        }
    }
}

class Answerer {

    private int id;
    private List<Answer> answers;

    public Answerer(int id, List<Answer> answers) {
        this.id = id;
        this.answers = answers;
    }

    public int getId() {
        return this.id;
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }
}

class Answer {

    private int id;
    private String answerContent;

    public Answer(int id, String answerContent) {
        this.id = id;
        this.answerContent = answerContent;
    }

    public int getId() {
        return this.id;
    }

    public String getAnswerContent() {
        return this.answerContent;
    }
}
