public class Arrays2DProgram2{
	public static void main(String[]args){

		//a
		System.out.println("PROGRAM A:\n");
		int [][] a = new int[2][2];
		int [] counterA = new int[2];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = (int)(Math.random() * 2) + 1;
				if(counterA[a[i][j] - 1] == 2)
					j--;
				else{
					counterA[a[i][j] - 1]++;
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();

		//b
		System.out.println("PROGRAM B:\n");
		int [][] b = new int[4][4];
		int [] counterB = new int[2];
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				b[i][j] = (int)(Math.random() * 2) + 1;
				if(counterB[b[i][j] - 1] == 8)
					j--;
				else{
					counterB[b[i][j] - 1]++;
					System.out.print(b[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();

		//c
		System.out.println("PROGRAM C:\n");
		int [][] c = new int[6][6];
		int [] counterC = new int[18];
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				c[i][j] = (int)(Math.random() * 18) + 1;
				if(counterC[c[i][j] - 1] == 2)
					j--;
				else{
					counterC[c[i][j] - 1]++;
					System.out.print(c[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();

		//d
		System.out.println("PROGRAM D:\n");
		int [][] d = new int[6][6];
		int [] counterD = new int[9];
		for(int i = 0; i < d.length; i++){
			for(int j = 0; j < d[i].length; j++){
				d[i][j] = (int)(Math.random() * 9) + 1;
				if(counterD[d[i][j] - 1] == 4)
					j--;
				else{
					counterD[d[i][j] - 1]++;
					System.out.print(d[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();

	 }
 }
