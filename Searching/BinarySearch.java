public class BinarySearch{

	public static void main(String[]args){

		int [] arr = {1, 3, 5, 7, 9};
		for(int i : arr)
			System.out.print(i + "\t");
		System.out.println();

		int low = 0;
		int high = arr.length - 1;
		int target = 6;
		boolean found = false;

		while(high >= low){
			int mid = (low + high) / 2;
			System.out.println("low = " + low + ", high = " + high + ", mid = " + mid);
			if(arr[mid] == target){
				System.out.println(target + " found at index " + mid);
				found = true;
				break;
			}
			else if(arr[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}

		if(!found)
			System.out.println(target + " not found");

	}

}