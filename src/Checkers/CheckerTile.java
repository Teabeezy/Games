package Checkers;

import javax.swing.*;
import java.awt.*;

public class CheckerTile extends JPanel
{
    public CheckerTile()
    {
        super();
        add(new JLabel(" "));
        setVisible(true);

    }

    public void setTileColor(Color color)
    {
        setBackground(color);
    }



}