package GameUtil.Cards;

public class BasicCard
{
    private Suit suit;
    private Face face;
    private int value;
    private boolean faceCard;
    private String face;

    public BasicCard(Suit suit, int value, String face)
    {
        this.suit = suit;
        this.value = value;
        this.faceCard = true;
        this.face = face;
    }

    public BasicCard(Suit suit, int value)
    {
        this.suit = suit;
        this.value = value;
        this.faceCard = false;
        this.face = null;
    }

    public void setValue(int newVal)
    {
        value = newVal;
    }

    public String getSuit()
    {
        return suit.PrintSuitText();
    }

    public int getFace()
    {
        return face.PrintFaceValue();
    }
}
