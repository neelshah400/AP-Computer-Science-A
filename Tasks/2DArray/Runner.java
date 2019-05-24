public class Runner{

	public static void main(String[]args){

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] i : arr){
			for(int j : i)
				System.out.print(j);
			System.out.println();
		}
		Convert convert = new Convert(arr);
		System.out.println(convert.get1D());

	}

}