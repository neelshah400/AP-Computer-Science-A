public class Recursion1{

	public static void main(String[]args){

		System.out.println(halfSum(10));
		System.out.println(productOfAllDigits(456));
		System.out.println(modifiedProductSum(234));

	}

	public static int halfSum(int i){

		if(i == 1)
			return 1;
		return i + halfSum(i / 2);

	}

	public static int productOfAllDigits(int i){

		if(i < 10)
			return i;
		return productOfAllDigits(i / 10) * productOfAllDigits(i % 10);

	}

	public static int modifiedProductSum(int i){

		if(i / 10 == 0)
			return i;
		if(i % 2 == 0)
			return (i % 10) + modifiedProductSum(i / 10);
		return (i % 10) * modifiedProductSum(i / 10);

	}

}