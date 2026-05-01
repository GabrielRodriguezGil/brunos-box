package edu.teamrocket.brunosbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KnockDownTest {

    @Test
    public void replaceTest() {
        KnockDownRound round = new KnockDownRound("10 - 8");
        assertEquals(round.roundScore(), "10-8");
    }

    @Test
    public void roundScoreToIntTest() {
        KnockDownRound round = new KnockDownRound("10 - 8");
        assertEquals(round.roundScore(), "10-8");
        assertEquals(10, round.redBoxerScore());
        assertEquals(8, round.blueBoxerScore());
    }
}
