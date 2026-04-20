package edu.teamrocket.brunosbox;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Byte redCornerFinalScore;
    private Byte blueCornerFinalScore;

    private List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRedCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBlueCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

}
