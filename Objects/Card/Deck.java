// Partner B: Neel Shah

import java.util.ArrayList;

public class Deck{

	private ArrayList<Card> deck = new ArrayList<>();;

	public Deck(){

		for(int i = 1; i <= 4; i++){

			String suit = "";
			if(i == 1)
				suit = "Hearts";
			if(i == 2)
				suit = "Spades";
			if(i == 3)
				suit = "Diamonds";
			if(i == 4)
				suit = "Clubs";

			for(int j = 2; j <= 14; j++)
				deck.add(new Card(j, suit));

		}

	}

	public ArrayList<Card> getHand(){

		ArrayList<Card> hand = new ArrayList<>();

		for(int i = 0; i <= 4; i++){
			hand.add(deck.get(i));
			deck.remove(i);
		}

		return hand;

	}

	public ArrayList<Card> getDeck(){

		return deck;

	}

	// Ordinary Shuffle
	public void shuffle(){

		for(int i = 1; i <= 50; i++){
			int rand1 = (int)(Math.random() * 52);
			int rand2 = (int)(Math.random() * 52);
			Card temp = deck.get(rand1);
			deck.set(rand1, deck.get(rand2));
			deck.set(rand2, temp);
		}

	}

	public String toString(){

		String statement = "";
		for(int i = 0; i < deck.size(); i++)
			statement += (i + 1) + " - " + deck.get(i) + "\n";

		return statement;

	}

}