import java.util.Scanner;

public class Review1{
	public static void main(String[]args){

		Scanner reader = new Scanner(System.in);

		//1a
		System.out.print("PROGRAM 1:\n\nMethod 1:\n\n");
		int sum = 0;
		int counter = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum += i;
				counter++;
			}
		}
		double avg = (double)sum / counter;
		System.out.println(avg);

		//1b
		System.out.print("\nMethod 2:\n\n");
		sum = 0;
		counter = 0;
		for(int i = 2; i <= 100; i += 2){
			sum += i;
			counter++;
		}
		avg = (double)sum / counter;
		System.out.println(avg);

		//2
		System.out.print("\nPROGRAM 2:\n\n");
		for(int a = 5; a >= 1; a--){
			for(int b = a; b >= 1; b--)
				System.out.print("*");
			System.out.print("\n");
		}

		//3
		System.out.print("\nPROGRAM 3:\n\n");
		for(int a = 1; a <= 4; a++){
			int b = 5;
			for(b = 5; b > a; b--)
				System.out.print(b);
			if(b % 2 == 1)
				System.out.print("*");
			System.out.print("\n");
		}

		//4a
		System.out.print("\nPROGRAM 4:\n\nPart A:\n\n");
		System.out.print("How many bagels do you have?\t");
		int total = reader.nextInt();
		System.out.println();
		int gross = 0;
		int dozen = 0;
		int bagels = total;
		if(total >= 144){
			gross = bagels / 144;
			bagels = bagels % 144;
		}
		if(total >= 12){
			dozen = bagels / 12;
			bagels = bagels % 12;
		}
		System.out.print("" + total);
		System.out.print(bagels == 1 ? " bagel is " : " bagels are ");
		System.out.print(gross + " gross, " + dozen + " dozen, and " + bagels);
		System.out.println(bagels == 1 ? " bagel." : " bagels.");

		//4b
		System.out.print("\nPart B:\n\n");
		total = (int)(Math.random() * 300) + 1;
		gross = 0;
		dozen = 0;
		bagels = total;
		if(total >= 144){
			gross = bagels / 144;
			bagels = bagels % 144;
		}
		if(total >= 12){
			dozen = bagels / 12;
			bagels = bagels % 12;
		}
		System.out.print(total);
		System.out.print(bagels == 1 ? " bagel is " : " bagels are ");
		System.out.print(gross + " gross, " + dozen + " dozen, and " + bagels);
		System.out.println(bagels == 1 ? " bagel." : " bagels.");

		//5
		System.out.print("\nPROGRAM 5:\n\n");
		System.out.print("How many dice would you like to roll?\t");
		int dice = reader.nextInt();
		System.out.println();
		int sixes = 0;
		for(int i = 1; i <= dice; i++){
			int roll = (int)(Math.random() * 6) + 1;
			System.out.print("Roll " + i + ":");
			System.out.print(i <= 9 ? "" : "");
			System.out.println(roll);
			if(roll == 6)
				sixes++;
		}
		System.out.print("\nA 6 was rolled " + sixes);
		System.out.println(sixes == 1 ? " time." : " times.");
		System.out.println();

	}
}