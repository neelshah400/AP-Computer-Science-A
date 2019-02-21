public class Review2{
	public static void main(String[]args){

		//1
		System.out.println("PROGRAM 1:\n");
		int a = 5;
		a++; // a = 6
		int b = 6;
		b += 4; // b = 10
		int c = 7;
		c -= 2; // c = 5
		int d = 8;
		d--; // d = 7
		int e = 9;
		e *= 3; // e = 27
		int f = 10;
		f /= 5; // f = 2

		//2
		System.out.println("PROGRAM 2:\n");
		System.out.print("ab");
		System.out.println("cd");
		System.out.print("ef");
		System.out.println("g");
		System.out.println("h");
		System.out.println("ij");
		System.out.print("kl");
		System.out.print("mn");
		System.out.println("o");

		//3
		System.out.println("\nPROGRAM 3:\n");
		int dividend = 5;
		int divisor = 2;
		int quotient = dividend / divisor;
		System.out.println(dividend + " divided by " + divisor + " is " + quotient + " with a remainder of " + (dividend % divisor) + ".");

		//4
		System.out.println("\nPROGRAM 4:\n");
		for(int i = 1; i <= 6; i++){
			for(int j = 1; j <= i; j++){
				if(i % 3 == 0)
					System.out.print(j);
				else
					System.out.print(j + "" + j);
			}
			System.out.println();
		}

		//5
		System.out.println("\nPROGRAM 5:\n");
		int x = 0;
		do{
			x++;
			int y = 1;
			while(y <= x){
				if(x % 3 == 0)
					System.out.print(y);
				else
					System.out.print(y + "" + y);
				y++;
			}
			System.out.println();
		}while(x <= 5);
		System.out.println();

	}
}