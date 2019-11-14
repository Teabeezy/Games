package GameUtil;

import Menu.GameMenuGui;
import javax.swing.*;

public abstract class AbstractGameGui extends JPanel {
    private JFrame parent;
    private GameInterface game;
    public AbstractGameGui(JFrame parent) {
        super();
        parent.setSize(getGameWidth(),getGameHeight());
        this.parent = parent;
        setUp();
    }

    protected JFrame GetParent(){
        return parent;
    }
    public void BackToMenu(){
        new GameMenuGui(GetParent());
    }
    protected abstract int getGameWidth();
    protected abstract int getGameHeight();
    protected abstract void setUp();
}
