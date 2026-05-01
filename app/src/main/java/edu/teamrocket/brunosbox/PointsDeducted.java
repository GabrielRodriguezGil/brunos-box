package edu.teamrocket.brunosbox;

record PointsDeducted(String roundScore, byte redBoxerScore, byte blueBoxerScore) implements Round {
    PointsDeducted {
        if (roundScore == null || roundScore.isBlank())
            throw new IllegalArgumentException("roundScore no puede ser null o vacío");
    }

    PointsDeducted(String input) {
        this(
            input.replaceAll("\\s", ""),
            parseBoxerRoundScore(input, Boxer.RED),
            parseBoxerRoundScore(input, Boxer.BLUE)
        );
    }

    private static byte parseBoxerRoundScore(String input, Boxer boxer) {
        String[] scores = input.replaceAll("\\s", "").split("-", 2);
        String redBoxerRoundScore  = scores[Boxer.RED.corner()]; 
        String blueBoxerRoundScore = scores[Boxer.BLUE.corner()]; 

        return switch (boxer) {
            case RED  -> redBoxerRoundScore.contains(",")
                    ? parseComaRed(redBoxerRoundScore) 
                    : Byte.parseByte(redBoxerRoundScore); 
            case BLUE -> blueBoxerRoundScore.contains(",")
                    ? parseComaBlue(blueBoxerRoundScore) 
                    : Byte.parseByte(blueBoxerRoundScore); 
            };
    }

    private static byte parseComaRed(String score) {
        return Byte.parseByte(score.substring(score.indexOf(',') + 1));
    }

    private static byte parseComaBlue(String score) {
        return Byte.parseByte(score.substring(0, score.indexOf(',')));
    }
    
    @Override
    public String toString() {
        return redBoxerScore() + " - " + blueBoxerScore();
    }
}