package Checkers;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CheckerTile extends JPanel
{
    public CheckerTile()
    {
        super();
        add(new JLabel(" "));
        setBorder(new BevelBorder(1));
        setVisible(true);

    }

    public void setTileColor(Color color)
    {
        setBackground(color);
    }



}