import java.util.ArrayList;

public class Convert{

	private int[][] arr;

	public Convert(int[][] arr){

		this.arr = arr;

	}

	public int[] getRow(int r){

		return arr[r];

	}

	public ArrayList<Integer> get1D(){

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				list.add(getRow(i)[j]);
			}
		}
		return list;

	}

}