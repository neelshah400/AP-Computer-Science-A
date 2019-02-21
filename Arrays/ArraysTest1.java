public class ArraysTest1{
	public static void main(String[]args){

		int [] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 10) + 1;
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
		for(int i = 0; i < a.length; i++){
			if((a[i] % 2 == 0) && (i - 1 >= 0)){
				int temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
			}
		}
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("\n");

	}
}