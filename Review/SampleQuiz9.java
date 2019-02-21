public class SampleQuiz9{
	public static void main(String[]args){

		int diceA = (int)(Math.random() * 6) + 1;
		int diceB = (int)(Math.random() * 6) + 1;
		System.out.println("The values of the dice are " + diceA + " and " + diceB + ".");
		int sum = diceA + diceB;
		System.out.println("The sum of the two dice is " + sum + ".");
		int product = diceA * diceB;
		System.out.println("The product of the two dice is " + product + ".");
		int difference;
		if(diceA > diceB)
			difference = diceA - diceB;
		else
			difference = diceB - diceA;
		System.out.println("The difference of the two dice is "	+ difference + ".\n");

	}
}