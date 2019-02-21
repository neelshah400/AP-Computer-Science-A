public class Quiz9{
	public static void main(String[]args){

		for(int i = 0; i <= 4; i++){
			for(int j = i; j <= 4; j++){
				System.out.print(j);
				if(j % 2 == 0)
					System.out.print(j);
			}
			System.out.println();
		}

	}
}