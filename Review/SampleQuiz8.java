public class SampleQuiz8{
	public static void main(String[]args){

		for(int i = 0; i <= 8; i+= 2){
			for(int j = i; j <= 9; j++){
				System.out.print(j);
			}
			System.out.println(":" + i);
		}

	}
}