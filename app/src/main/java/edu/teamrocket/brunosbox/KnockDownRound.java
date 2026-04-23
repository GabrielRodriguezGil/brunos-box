package edu.teamrocket.brunosbox;

class KnockDownRound implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    KnockDownRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseRounds();
    }

    private void parseRounds() {
        String[] scores = getRoundScore().split("-", 2);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
        this.redBoxerScore = Byte.parseByte(scores[0]);
    }

    public String getRoundScore() {
        return roundScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}