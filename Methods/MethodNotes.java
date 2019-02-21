public class MethodNotes{

	public static void printName(){

		System.out.println("Neel");

	}

	public static void showSum(int j, int k){

		int sum = j + k;
		System.out.println(sum);

	}

	public static int addNumbers(int j, int k){

		/*int sum = j + k;
		return sum;*/
		return j + k;

	}

	public static int [] fillArray(int j, int k, int l){

		int [] arr = {j,k,l};
		return arr;

	}

	public static boolean isEven(int i){

		/*if(i % 2 == 0)
			return true;
		//else
			return false;*/

		return (i % 2 == 0);

	}

	public static boolean isEven(int i, int j){ // Same name allowed, as long as variables are different

		if(i % 2 == 0 && j % 2 == 0)
			return true;
		return false;

	}

	public static void main(String[]args){

		printName();

		showSum(5,7);

		int sum = addNumbers(5,5);
		System.out.println(sum);
		//System.out.println(addNumbers(5,5));

		int [] arr = fillArray(1,2,3);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println();

		System.out.println(isEven(10));

		System.out.println(isEven(10,11));

	}
}