import java.util.Scanner;

public class D20{
	public static void main(String[]args){

		Scanner reader = new Scanner(System.in);
		String status = "y";
		while(status.equals("y")){
			status = "n";
			int score = 0;
			int roll20 = (int)(Math.random() * 20) + 1;
			score += roll20;
			int roll4 = 0;
			if(roll20 == 20){
				System.out.println("Perfect roll!");
			}
			else{
				if(roll20 >= 15 && roll20 <= 19){
					roll4 = (int)(Math.random() * 4) + 1;
					score += roll4;
					System.out.println("You rolled a " + roll20 + " and a " + roll4 + ", giving you a score of " + score + ".");
				}
				else if(roll20 >= 10 && roll20 <= 14)
					System.out.println("You rolled a " + roll20 + ", giving you a score of " + score + ".");
				else if(roll20 >= 5 && roll20 <= 9){
					if(roll20 % 2 == 0)
						score += 2;
					else
						score -= 1;
					System.out.println("You rolled a " + roll20 + ", giving you a score of " + score + ".");
				}
				else{
					System.out.print("You rolled a " + roll20 + ". Would you like to roll again? [y/n]\t");
					status = reader.nextLine();
				}
			}
		}
		System.out.println();
	}
}