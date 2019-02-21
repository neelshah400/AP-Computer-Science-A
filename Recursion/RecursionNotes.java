public class RecursionNotes{

	public static int factorial(int i){

		//base case
		if(i == 0)
			return 1;

		//recursive step
		return i * factorial(i - 1);

	}

	public static int findSum(int i){

		//sums all of the numbers between 1 and i inclusive
		if(i == 0)
			return 0;
		return i + findSum(i - 1);

	}

	public static int printFactorial(int i){

		if(i == 0){
			System.out.println(1);
			return 1;
		}
		int result = i * printFactorial(i - 1);
		System.out.println(result);
		return result;

	}

	public static void main(String[]args){

		System.out.println(factorial(5) + "\n");
		System.out.println(findSum(5) + "\n");
		System.out.println(printFactorial(5) + "\n");

	}

}