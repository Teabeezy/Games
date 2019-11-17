package TicTacToe;

import GameUtil.*;

import java.util.ArrayList;

public class TicTacToe implements GameInterface {
    Player x;
    Player o;
    Player curr;
    ArrayList<String[]> winConditions = new ArrayList<>();
    public TicTacToe() {
        x = null;
        o = null;
        curr = x;
    }


    @Override
    public Player getCurrPlayer() {
        return curr;
    }

    @Override
    public void addPlayer(Player newPlayer) {
        if(x == null)
            x= newPlayer;
        else
            o=newPlayer;
        curr=o;

    }
    String getCurrPlayerText(){
        String currText = " ";
        if(curr == x) {
            currText= "X";
        }
        else{
            currText=  "O";
        }
        nextPlayerTurn();
        return currText;
    }

    @Override
    public void nextPlayerTurn() {
        gameWon();
        if(curr==x)
            curr = o;
        else
            curr = x;
    }

    @Override
    public Boolean gameWon() {

        String[] winCondition;

        return true;
    }

    @Override
    public int getNumPlayers() {
        return 2;
    }

    @Override
    public void gameOver() {

    }
}
