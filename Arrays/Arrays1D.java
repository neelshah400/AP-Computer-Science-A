public class Arrays1D{
	public static void main(String[]args){

		//1
		int [] a = new int[40];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 30) + 10;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//2
		a[a.length - 2] = 99;
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		//3
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0)
				a[i] -= 2;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//4
		for(int i = 0; i < a.length; i++){
			if(i % 2 == 1)
				a[i] *= 2;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//5
		for(int i = 0; i < a.length; i++){
			if(a[i] % 4 == 1)
				a[i] = 0;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//6
		for(int i = 0; i < a.length; i++){
			if((i + 1) % 5 == 0)
				a[i] = 5;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//7
		boolean replace = true;
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 1){
				if(replace == true){
					a[i] = 1;
					replace = false;
				}
				else
					replace = true;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

	}
}