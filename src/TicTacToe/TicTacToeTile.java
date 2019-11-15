package TicTacToe;

import javax.swing.*;
import java.util.ArrayList;

public class TicTacToeTile extends JPanel {
    private ArrayList<TicTacToeTile> directions;
    private JLabel tileButton;
    private String text;
    private boolean reserved;
    private int position;
    public TicTacToeTile(int position){
        super();


        add(tileButton);
        reserved= false;
        directions = new ArrayList<TicTacToeTile>();
        this.position = position;
    }
    public void setText(String text){
        if(reserved != true){
            this.text = text;
            tileButton.setText(text);
            reserved = true;
        }
    }


}
