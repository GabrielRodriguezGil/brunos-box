package edu.teamrocket.brunosbox;

record RegularRound(String roundScore, byte redBoxerScore, byte blueBoxerScore) implements Round {
    // la clase es portador de datos inmutables 
    // tras la construcción: candidata a record

    // Constructor canónico compacto: valida
    RegularRound {
        if (roundScore == null) throw new IllegalArgumentException("roundScore null");
    }

    RegularRound(String roundScore) {
        this ( // invoca al constructor canónico compacto
            roundScore.replaceAll("\\s", ""), // acaba en this.roundScore
            parseBoxerRoundScore(roundScore, Boxer.RED), // acaba en this.redBoxerScore
            parseBoxerRoundScore(roundScore, Boxer.BLUE) // acaba en this.blueBoxerScore
        );
    }

    private static Byte parseBoxerRoundScore(String roundScore, Boxer boxer) {
        String[] scores = roundScore.replaceAll("\\s", "").split("-", 2);
        return Byte.parseByte(scores[boxer.corner()]);
    }

    @Override
    public String toString() {
        return redBoxerScore() + " - " + blueBoxerScore();
    }

}