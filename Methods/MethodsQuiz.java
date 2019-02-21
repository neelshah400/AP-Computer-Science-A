public class MethodsQuiz{

	public static void main(String[]args){

		// Test
		int [] test = makeArray();
		outputArray(test);
		System.out.println("Are all of the values even? " + isArrayEven(test));
		System.out.println("Are more than half of the items even? " + isMoreThanHalfEven(test));

		// Test 2
		int [] test2 = {2,2,2};
		outputArray(test2);
		System.out.println("Are all of the values even? " + isArrayEven(test2));
		System.out.println("Are more than half of the items even? " + isMoreThanHalfEven(test2));

		// Test 3
		int [] test3 = {1,2,3,4,5,6};
		outputArray(test3);
		System.out.println("Are all of the values even? " + isArrayEven(test3));
		System.out.println("Are more than half of the items even? " + isMoreThanHalfEven(test3));

		// Test 4
		int [] test4 = {1,2,2,4,5,6};
		outputArray(test4);
		System.out.println("Are all of the values even? " + isArrayEven(test4));
		System.out.println("Are more than half of the items even? " + isMoreThanHalfEven(test4));

	}

	public static int rand(){

		return (int)(Math.random() * 10) + 1;

	}

	public static boolean isEven(int num){

		return (num % 2 == 0);

	}

	public static boolean isArrayEven(int num[]){

		for(int i = 0; i < num.length; i++){
			if(isEven(num[i]) == false)
				return false;
		}
		return true;

	}

	public static boolean isMoreThanHalfEven(int num[]){

		int cnt = 0;
		for(int i = 0; i < num.length; i++){
			if(isEven(num[i]) == true)
				cnt++;
		}
		return (cnt > (num.length / 2));

	}

	public static int[] makeArray(){

		int rand = (int)(Math.random() * 2) + 1;
		rand *= 3;
		int [] arr = new int[rand];
		for(int i = 0; i < arr.length; i++)
			arr[i] = rand();
		return arr;

	}

	public static void outputArray(int arr[]){

		for(int i = 0; i < arr.length; i++)
			System.out.println("Num " + (i + 1) + ": " + arr[i]);

	}

}