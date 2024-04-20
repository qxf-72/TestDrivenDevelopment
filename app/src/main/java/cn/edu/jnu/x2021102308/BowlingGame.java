package cn.edu.jnu.x2021102308;

import java.util.ArrayList;


public class BowlingGame {
    private ArrayList<Integer> pins;

    public BowlingGame() {
        pins = new ArrayList<>();
    }

    public void roll(int pins) {
        this.pins.add(pins);
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < pins.size(); i++) {
            score += pins.get(i);
            if (i + 2 < pins.size() && pins.get(i) + pins.get(i + 1) == 10) {
                score += pins.get(i + 2);
            }
        }
        return score;
    }
}
