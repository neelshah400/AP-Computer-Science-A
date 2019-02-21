public class Quiz10{
	public static void main(String[]args){

		for(int i = 0; i <= 8; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
			if(i % 2 == 0)
				i++;
		}

	}
}