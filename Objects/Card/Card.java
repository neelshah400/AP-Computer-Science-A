// Partner A: Aniketh Madhugiri

public class Card{

	private int value;
	private String suit;

	public Card(){

		value = 0;
		suit = "Joker";

	}

	public Card(int value, String suit){

		this.value = value;
		this.suit = suit;

	}

	public int getValue(){

		return value;

	}

	public String getSuit(){

		return suit;

	}

	public String getFaceValue(){

		if(value == 0)
			return "Joker";
		if((value > 1) && (value < 11))
			return String.valueOf(value);
		if(value == 11)
			return "Jack";
		if(value == 12)
			return "Queen";
		if(value == 13)
			return "King";
		if(value == 14)
			return "Ace";
		else
			return "Invalid";

	}

	public String toString(){

		if((value == 0) || (value == 1))
			return getFaceValue();
		else
			return getFaceValue() + " of " + getSuit();

	}

}