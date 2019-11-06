package BlackJack;

import AbstractClasses.AbstractGameGui;

import javax.swing.*;

public class BlackJackGui extends AbstractGameGui {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    public BlackJackGui(JFrame parent) {
        super(parent);
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
        //Build Gui Here
    }
}