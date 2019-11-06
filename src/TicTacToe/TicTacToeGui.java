package TicTacToe;
import AbstractClasses.AbstractGameGui;
import javax.swing.*;

public class TicTacToeGui extends AbstractGameGui {
    private final int WIDTH = 250;
    private final int HEIGHT = 250;

    public TicTacToeGui(JFrame parent) {
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
