package edu.teamrocket.brunosbox;

record KnockDownRound( String roundScore, byte redBoxerScore, byte blueBoxerScore) implements Round{


    KnockDownRound{
        if (roundScore == null) throw new IllegalArgumentException("roundScore is null");
    }

    

    KnockDownRound(String roundScore) {
        this (
        roundScore.replaceAll("\\s", ""),
        parseRound(roundScore,Boxer.RED),
        parseRound(roundScore,Boxer.BLUE)
        );
    }

    private static byte parseRound(String roundScore,Boxer boxer) {
        String[] scores = roundScore.replaceAll("\\s", "").split("-", 2);
        return Byte.parseByte(scores[boxer.corner()]);
        
    }

    @Override
    public String toString() {
        return redBoxerScore() + " - " + blueBoxerScore();
    }

}