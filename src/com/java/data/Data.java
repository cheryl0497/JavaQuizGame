package com.java.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String QUESTIONS_FILE_PATH = "question_bank.txt";
    private static final String GAME_RULES_FILE_PATH = "game_rules.txt";

    private String gameRules;
    private String questionsFilePath;
    private List<List<Double>> easyRoundCashPrizes;
    private List<List<Double>> hardRoundCashPrizes;

    public Data() {
        this.questionsFilePath = QUESTIONS_FILE_PATH;
    }

    public String getQuestionsFilePath() {
        return questionsFilePath;
    }

    public void setQuestionsFilePath(String questionsFilePath) {
        this.questionsFilePath = questionsFilePath;
    }

    public List<List<Double>> getEasyRoundCashPrizes() {
        return easyRoundCashPrizes;
    }

    public void setEasyRoundCashPrizes(List<List<Double>> easyRoundCashPrizes) {
        this.easyRoundCashPrizes = easyRoundCashPrizes;
    }

    public List<List<Double>> getHardRoundCashPrizes() {
        return hardRoundCashPrizes;
    }

    public void setHardRoundCashPrizes(List<List<Double>> hardRoundCashPrizes) {
        this.hardRoundCashPrizes = hardRoundCashPrizes;
    }

    public String getGameRules() {
        return gameRules;
    }

    public void setGameRules(String gameRules) {
        this.gameRules = gameRules;
    }

    public void init() throws IOException {
        setEasyGameCashPrizes();
        setHardGameCashPrizes();
        this.gameRules = readGameRules();
    }

    public void setEasyGameCashPrizes() {
        // Round 1 cash prizes
        List<Double> round1 = new ArrayList<>();
        round1.add(100.0);
        round1.add(500.0);
        round1.add(1000.0);

        // Round 2 cash prizes
        List<Double> round2 = new ArrayList<>();
        round2.add(8000.0);
        round2.add(16000.0);
        round2.add(32000.0);

        // Round 3 cash prizes
        List<Double> round3 = new ArrayList<>();
        round3.add(125000.0);
        round3.add(500000.0);
        round3.add(1000000.0);

        // Set whole easy game
        this.easyRoundCashPrizes = new ArrayList<>();
        this.easyRoundCashPrizes.add(round1);
        this.easyRoundCashPrizes.add(round2);
        this.easyRoundCashPrizes.add(round3);
    }

    public void setHardGameCashPrizes() {
        // Round 1 cash prizes
        List<Double> round1 = new ArrayList<>();
        round1.add(100.0);
        round1.add(200.0);
        round1.add(300.0);
        round1.add(500.0);
        round1.add(1000.0);

        // Round 2 cash prizes
        List<Double> round2 = new ArrayList<>();
        round2.add(2000.0);
        round2.add(4000.0);
        round2.add(8000.0);
        round2.add(16000.0);
        round2.add(32000.0);

        // Round 3 cash prizes
        List<Double> round3 = new ArrayList<>();
        round3.add(64000.0);
        round3.add(125000.0);
        round3.add(250000.0);
        round3.add(500000.0);
        round3.add(1000000.0);

        // Set whole hard game
        this.hardRoundCashPrizes = new ArrayList<>();
        this.hardRoundCashPrizes.add(round1);
        this.hardRoundCashPrizes.add(round2);
        this.hardRoundCashPrizes.add(round3);
    }

    public String readGameRules() throws IOException {
        StringBuilder gameRulesBuilder = new StringBuilder();

        try (BufferedReader input = new BufferedReader(new FileReader(GAME_RULES_FILE_PATH))) {
            String line;
            while ((line = input.readLine()) != null) {
                gameRulesBuilder.append(line).append(System.lineSeparator());
            }
        }

        return gameRulesBuilder.toString();
    }

    @Override
    public String toString() {
        return "Data{" +
                "questionsFilePath='" + questionsFilePath + '\'' +
                ", easyRoundCashPrizes=" + easyRoundCashPrizes +
                ", hardRoundCashPrizes=" + hardRoundCashPrizes +
                '}';
    }
}
