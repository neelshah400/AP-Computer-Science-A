public class Quiz11{
	public static void main(String[]args){

		int random1 = (int)(Math.random() * 10) + 1;
		int random2 = (int)(Math.random() * 10) + 1;
		int sum = random1 + random2;
		int product = random1 * random2;
		int difference = random1 - random2;
		double quotient = (double)random1 / random2;
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Difference: " + difference);
		System.out.println("Quotient: " + quotient);

	}
}