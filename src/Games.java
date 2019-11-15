import GameUtil.AbstractGameGui;
import Menu.GameMenuGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Games extends JFrame implements ActionListener {
    public AbstractGameGui currentPanel;
    public Games(){
        super("Games");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BorderLayout border = new BorderLayout();
        setResizable(true);
        JMenuBar menuBar = new JMenuBar();
        JButton toMenu = new JButton("Game Menu");
        toMenu.addActionListener(this);
        menuBar.add(toMenu);
        setJMenuBar(menuBar);
        currentPanel = new GameMenuGui(this);
        setVisible(true);
    }

    public static void main(String args[]){
        new Games();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentPanel.BackToMenu();
    }
}
