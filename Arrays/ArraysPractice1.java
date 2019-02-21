public class ArraysPractice1{
	public static void main(String[]args){

		//A
		System.out.println("PART A:\n");
		int [] a = new int [10];
		int sum = 0;
		double avg = 0.0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 20) + 5;
			System.out.print(a[i] + "\t");
			sum += a[i];
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("\n");
		avg = (double)sum / a.length;
		System.out.println("Sum:\t\t" + sum);
		System.out.println("Average:\t" + avg);
		System.out.println("Maximum:\t" + max);
		System.out.println("Minimum:\t" + min);
		System.out.println();

		//B
		System.out.println("PART B:\n");
		for(int i = 0; i < (a.length / 2); i++){
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("\n");

	}
}