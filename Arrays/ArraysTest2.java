public class ArraysTest2{
	public static void main(String[]args){

		int [][] a = new int[4][4];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = (i + 1) * (j + 1);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 1; i < a.length; i+= 2){
			for(int j = 0; j < a[i].length / 2; j++){
				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
		System.out.println();

	}
}