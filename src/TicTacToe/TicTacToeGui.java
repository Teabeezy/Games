package TicTacToe;

import GameUtil.AbstractGameGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeGui extends AbstractGameGui {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private JLabel currPlayerLabel;

    public TicTacToeGui(JFrame parent) {
        super(parent,new TicTacToe());
        addPlayers();
        currPlayerLabel = new JLabel(getGame().getCurrPlayer().getName()+"'s turn");
        parent.getJMenuBar().add(currPlayerLabel);
        revalidate();
        repaint();

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
        TicTacToeTile tile;
        for(int i = 1; i<=9; i++){
            tile = new TicTacToeTile(i);
            add(tile);
            tile.addMouseListener(new PanelMouseAdapter());
        }

    }

    private class PanelMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            TicTacToeTile tile = (TicTacToeTile)e.getSource();
            TicTacToe temp = (TicTacToe) getGame();
            tile.setText(temp.getCurrPlayerText());
            currPlayerLabel.setText(temp.getCurrPlayer().getName()+"'s Turn");

        }
    }


}
