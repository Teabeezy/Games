package GameUtil.Cards;

import java.awt.*;

public enum Suit {
    SPADES(Color.BLACK),
    HEARTS(Color.RED),
    DIAMONDS(Color.RED),
    CLUBS(Color.BLACK);
    public Color color;
    private Suit(Color color){
        this.color = color;
    }
}
