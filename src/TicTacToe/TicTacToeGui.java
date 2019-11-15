package TicTacToe;

import GameUtil.AbstractGameGui;

import javax.swing.*;
import java.awt.*;

public class TicTacToeGui extends AbstractGameGui {
    private final int WIDTH = 250;
    private final int HEIGHT = 250;

    public TicTacToeGui(JFrame parent) {
        super(parent);
        parent.add(this);
    }

    @Override
    protected int getGameWidth() {
        return WIDTH;
    }

    @Override
    protected int getGameHeight() {
        return HEIGHT;
    }

    @Override
    protected void setUp() {
        setLayout(new GridLayout(3,3));
        for(int i = 1; i<=9; i++){
            add(new TicTacToeTile(i));
        }

    }



}
