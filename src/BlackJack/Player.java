/*
 *  ---------------------------------------------------------------------------
 *  File name: Player.java
 *  Project name: Games
 *  ---------------------------------------------------------------------------
 *  Creator's name and email: Thomas Roberts, robertstj@etsu.edu
 *  Course:  CSCI 1260
 *  Creation Date: 20-Nov-19
 *  ---------------------------------------------------------------------------
 */

package BlackJack;

import GameUtil.Cards.BasicDeck;
import GameUtil.Cards.Cards;

import java.util.ArrayList;

public class Player extends BasicDeck
{
	String playerName;
	private int playerNumberOfCards;
	boolean winCondition;
	ArrayList<Cards> playerHand;

	public Player()
	{

	}

	public Player(String name)
	{
		this.playerName = name;
		playerHand = new ArrayList<Cards>( );
	}

	public int computeHand()
	{
		int valueOfHand = 0;
		for(Cards countSum: playerHand)
		{
			valueOfHand = valueOfHand + countSum.getFace();
		}
		return valueOfHand;
	}

	public boolean isWinCondition()
	{
		return false;
	}

	public void drawACard()
	{
		dealFromTop(1);
		this.playerNumberOfCards++;
	}

	public String toString()
	{
		return "Player: " + playerName;
	}
}
