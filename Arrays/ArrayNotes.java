public class ArrayNotes{
	public static void main(String[]args){

		int [] arrayOne = new int[10];

		for(int i = 0; i < 10; i++)
			System.out.print(arrayOne[i] + "\t");
		System.out.println();

		int [] arrayTwo = {1,2,3,4};
		for(int i = 0; i < arrayTwo.length; i++)
			System.out.print(arrayTwo[i] + "\t");
		System.out.println();

		int [] arrayThree;
		arrayThree = new int[4];

		int [][] array2D = new int[3][2];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++)
				System.out.print(array2D[i][j] + " ");
			System.out.println();
		}

		//practice
		int [] array1 = new int[5];
		for(int i = 0; i < array1.length; i++){
			do{
				array1[i] = (int)(Math.random() * 9) + 1;
			}while(array1[i] % 2 == 0);
			System.out.print(array1[i / 2] + "\t");
		}
		System.out.println();


	}
}