package edu.teamrocket.brunosbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointsDeductedTest {

    @Test
    public void replaceTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals(round.roundScore(), "10-8,1");
        round = new PointsDeducted("1, 8 - 10");
        assertEquals(round.roundScore(), "1,8-10");
    }

    @Test
    public void roundScoreToIntBlueTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals(round.roundScore(), "10-8,1");
        assertEquals(10, round.redBoxerScore());
        assertEquals(8, round.blueBoxerScore());
    }

    @Test
    public void roundScoreToIntRedTest() {
        PointsDeducted round = new PointsDeducted("1, 8 - 10");
        assertEquals(round.roundScore(), "1,8-10");
        assertEquals(8, round.redBoxerScore());
        assertEquals(10, round.blueBoxerScore());
    }

}
