public class SampleQuiz10{
	public static void main(String[]args){

		int p1 = 0;
		int p2 = 0;
		int round = 0;
		while((p1 < 20) && (p2 < 20)){
			round++;
			System.out.println("ROUND " + round + ":\n");
			int dice1A = (int)(Math.random() * 6) + 1;
			int dice1B = (int)(Math.random() * 6) + 1;
			int dice2A = (int)(Math.random() * 6) + 1;
			int dice2B = (int)(Math.random() * 6) + 1;
			if((dice1A + dice1B) > (dice2A + dice2B))
				p1 += 3;
			if((dice2A + dice2B) > (dice1A + dice1B))
				p2 += 3;
			if(dice1A > (dice2A + dice2B))
				p1 += 6;
			if(dice2A > (dice1A + dice1B))
				p2 += 6;
			if((dice1B > dice2A) && (dice1B > dice2B))
				p1++;
			if((dice2B > dice1A) && (dice2B > dice1B))
				p2++;
			System.out.println("\tPlayer 1 rolled a " + dice1A + " and a " + dice1B + ".");
			System.out.println("\tPlayer 2 rolled a " + dice2A + " and a " + dice2B + ".\n");
			System.out.println("\tPlayer 1 has " + p1 + " points, and Player 2 has " + p2 + " points.\n");
		}
		if(p1 > p2)
			System.out.println("PLAYER 1 WINS!");
		else if(p2 > p1)
			System.out.println("PLAYER 2 WINS!");
		else
			System.out.println("TIE!");
		System.out.println();

	}
}