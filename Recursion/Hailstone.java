public class Hailstone{

	public static void main(String[]args){

		for(int i = 1; i <= 20; i++)
			hailstone(i);

	}

	static void hailstone(int num){

		if((num == 0) || (num == 1))
			System.out.println(num);
		else if(num % 2 == 0){
			System.out.print(num + " ");
			hailstone(num / 2);
		}
		else{
			System.out.print(num + " ");
			hailstone((num * 3) + 1);
		}

	}

}