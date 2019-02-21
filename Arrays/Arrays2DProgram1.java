public class Arrays2DProgram1{
	public static void main(String[]args){

		int [][] cal = new int[12][30];
		String statement = "";
		int counter = 0;
		while(statement.equals("")){
			counter++;
			int month = (int)(Math.random() * 12) + 1;
			int day = (int)(Math.random() * 30) + 1;
			cal[month - 1][day - 1] += 1;
			System.out.println("There is a birthday on " + month + "/" + day + ".");
			for(int i = 0; i < cal.length; i++){
				for(int j = 0; j < cal[i].length; j++){
					if(cal[i][j] >= 3)
						statement = "There are 3 birthdays on " + (i + 1) + "/" + (j + 1) + ".\n" + counter + " birthdays were selected before 3 people with the same birthday were found.";
				}
			}
		}
		System.out.println("\n" + statement + "\n");

	}
}