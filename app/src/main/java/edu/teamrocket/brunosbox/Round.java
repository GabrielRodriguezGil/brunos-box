package edu.teamrocket.brunosbox;

public class Round {
    byte  getRedBoxerScore = 0;
    byte  getBlueBoxerScore = 0;

    byte[] boxerRoundScore(){
        return new byte[]{this.getBlueBoxerScore, this.getRedBoxerScore};
    } 
}