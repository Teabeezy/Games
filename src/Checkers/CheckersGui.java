package Checkers;
import AbstractClasses.AbstractGameGui;

import javax.swing.*;

public class CheckersGui extends AbstractGameGui {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    public CheckersGui(JFrame parent) {
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
