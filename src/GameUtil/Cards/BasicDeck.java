package GameUtil.Cards;

public class BasicDeck extends Cards<BasicCard>
{
    public BasicDeck()
    {
        super();
        buildDeck();
    }
    private void buildDeck()
    {
        addSuit(Suit.SPADES);
        addSuit(Suit.HEARTS);
        addSuit(Suit.DIAMONDS);
        addSuit(Suit.CLUBS);
    }
    private void addSuit(Suit suit)
    {
        //add Ace
        add(new BasicCard(suit,11, "Ace"));
        //add 2-10
        for(int i = 2; i<=10; i++)
        {
            add(new BasicCard(suit,i));
        }
        //add king
        add(new BasicCard(suit,13, "King"));
        //add queen
        add(new BasicCard(suit,12, "Queen"));
        //add jack
        add(new BasicCard(suit,11, "Jack"));
    }

}
