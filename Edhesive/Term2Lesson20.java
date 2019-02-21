public class Term2Lesson20{
	public static void main(String[]args){

		//1
		System.out.println("PROGRAM 1:\n");
		int [][] a = new int[4][4];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = i + 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//2
		System.out.println("PROGRAM 2:\n");
		int [][] b = new int[3][4];
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				if((i == 0 && j >= 3) || (i == 1 && j >= 2) || (i == 2 && j >= 1))
					b[i][j] = 2;
				else
					b[i][j] = 1;
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//3
		System.out.println("PROGRAM 3:\n");
		int [][] c = new int[4][5];
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				c[i][j] = j + 1;
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}