public class ArraysPractice2{
	public static void main(String[]args){

		int [][] arr = new int[5][7];
		int cnt = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				cnt++;
				arr[i][j] = cnt;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//A
		System.out.println("PART A:\n");
		double a = 0.0;
		for(int i = 0; i < arr.length; i++)
			a += arr[i][2];
		a /= (double)arr.length;
		System.out.println("Average of 3rd Column:\t" + a);
		System.out.println();

		//B
		System.out.println("PART B:\n");
		double b = 0.0;
		for(int i = 0; i < arr[3].length; i++)
			b += arr[3][i];
		b /= (double)arr[3].length;
		System.out.println("Average of 4th Row:\t" + b);
		System.out.println();

		//C
		System.out.println("PART C:\n");
		for(int i = 0; i < arr.length; i++){
			int temp = arr[i][1];
			arr[i][1] = arr[i][5];
			arr[i][5] = temp;
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//D
		System.out.println("PART D:\n");
		int temp = arr[0][6];
		arr[0][6] = arr[4][6];
		arr[4][6] = temp;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}