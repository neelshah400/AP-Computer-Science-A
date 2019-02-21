// Group: Neel Shah and Aniketh Madhugiri

import java.util.ArrayList;

public class CardRunner{

	public static void main(String[]args){

		// Test 1
		System.out.println("TEST 1:\n");

		System.out.println("Deck:\n");
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);

		System.out.println("Hand 1:\n");
		ArrayList<Card> hand1 = deck.getHand();
		System.out.println(hand1);
		System.out.println();

		System.out.println("Hand 2:\n");
		ArrayList<Card> hand2 = deck.getHand();
		System.out.println(hand2);
		System.out.println();

		// Test 2
		System.out.println("TEST 2:\n");

		System.out.println("Hand 1:\n");
		isPair(hand1);
		System.out.println();

		System.out.println("Hand 2:\n");
		isPair(hand2);
		System.out.println();

		// Test 3
		System.out.println("TEST 3:\n");

		while(deck.getDeck().size() > 0)
			deck.getDeck().remove(0);

		System.out.println(deck.getDeck());
		System.out.println();

	}


	// Test 2
	public static void isPair(ArrayList<Card> hand){

		boolean pair = false;
		int [] tracker = new int[15];

		for(int i = 0; i < hand.size(); i++)
			tracker[hand.get(i).getValue()]++;

		for(int i = 0; i < tracker.length; i++){
			if(tracker[i] >= 2){
				pair = true;
				for(int j = 0; j < hand.size(); j++){
					if(i == hand.get(j).getValue()){
						System.out.println("You have a pair of " + hand.get(j).getFaceValue() + "s.");
						break;
					}
				}
			}
		}
		if(!pair)
			System.out.println("You have no pairs.");

	}

}