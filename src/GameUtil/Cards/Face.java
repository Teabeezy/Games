/*
 *  ---------------------------------------------------------------------------
 *  File name: Face.java
 *  Project name: Games
 *  ---------------------------------------------------------------------------
 *  Creator's name and email: Thomas Roberts, robertstj@etsu.edu
 *  Course:  CSCI 1260
 *  Creation Date: 21-Nov-19
 *  ---------------------------------------------------------------------------
 */

package GameUtil.Cards;

public enum Face
{
	ACE(1), DEUCE(2), THREE(3),
	FOUR(4), FIVE(5), SIX(6),
	SEVEN(7), EIGHT(8), NINE(9),
	TEN(10), JACK(10), QUEEN(10),
	KING(10);

	private final int faceValue;

	Face (int faceValue)
	{
		this.faceValue = faceValue;
	}

	public int PrintFaceValue()
	{
		return faceValue;
	}
}
