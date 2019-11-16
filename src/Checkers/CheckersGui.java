package Checkers;
import GameUtil.AbstractGameGui;

import javax.swing.*;
import java.awt.*;

public class CheckersGui extends AbstractGameGui {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    public CheckersGui(JFrame parent) {
        super(parent);
        parent.add(this,BorderLayout.CENTER);
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
    public void setUp()
    {

        setLayout(new GridLayout(8,8));
        CheckerTile tile = new CheckerTile();
        boolean red = false;
        for (int x = 1; x<=8; x++)
        {
            for(int y = 1; y<=8; y++)
            {
                tile = new CheckerTile();
                if(red)
                {
                    tile.setTileColor(Color.BLACK);
                    red = false;
                }
                else
                {
                    tile.setTileColor(Color.RED);
                    red=true;
                }
                add(tile);
            }
            red = (!red);

        }


        repaint();
    }
}

