public class ArraysTest{

	public static void main(String[]args){

		//1
		int [][] arr2D = fill2D();
		for(int [] row : arr2D){
			for(int elem : row)
				System.out.print(elem + "\t");
			System.out.println();
		}
		System.out.println();

		//2
		int [] arr1 = {1, 2, 3, 4};
		System.out.println(sum1D(arr1));
		int [] arr2 = {5, 6, 7, 8};
		System.out.println(sum1D(arr2));
		System.out.println();

		//3
		System.out.println(sum2D(arr2D));
		System.out.println();

	}

	//1
	public static int [][] fill2D(){

		//original test
		int [][] arr2D = new int[3][5];
		//additional test
		//int [][] arr2D = new int[4][5];

		int cnt = 10;
		for(int i = 0; i < arr2D.length; i++){
			for(int j = 0; j < arr2D[i].length; j++){
				arr2D[i][j] = cnt;
				cnt += 10;
			}
		}
		return arr2D;

	}

	//2
	public static int sum1D(int [] arr){

		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;

	}

	//3
	public static int sum2D(int [][] arr2D){

		int sum = 0;
		for(int [] row : arr2D)
			sum += sum1D(row);
		return sum;

	}

}