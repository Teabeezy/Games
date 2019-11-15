package GameUtil.Cards;

import java.awt.Color;

public enum Suit {
    SPADES(Color.BLACK) ,
    HEARTS(Color.RED) ,
    DIAMONDS(Color.RED),
    CLUBS(Color.BLACK) ;

    public int index;
    public Color color;
    private Suit(Color color){
        this.color = color;
    }
}
