package GameUtil.Cards;

import java.awt.Color;

public enum Suit
{
    SPADES(Color.BLACK, "Hearts") ,
    HEARTS(Color.RED, "Spades") ,
    DIAMONDS(Color.RED, "Diamonds"),
    CLUBS(Color.BLACK, "Clubs") ;

    public int index;
    public Color color;
    private final String suitText;

    Suit (Color color, String suitText)
    {
        this.color = color;
        this.suitText = suitText;
    }

    public String PrintSuitText()
    {
        return suitText;
    }
}
