public class Sorting{

	public static void main(String[]args){

		int [] arrNorm = {7, 4, 1, 8, 5, 2, 9, 6, 3, 0};
		int [] arrSelection = {7, 4, 1, 8, 5, 2, 9, 6, 3, 0};
		int [] arrInsertion = {7, 4, 1, 8, 5, 2, 9, 6, 3, 0};

		for(int i : arrNorm)
			System.out.print(i + "\t");
		System.out.println();

		for(int i : selectionSort(arrSelection))
			System.out.print(i + "\t");
		System.out.println();

		for(int i : insertionSort(arrInsertion))
			System.out.print(i + "\t");
		System.out.println();

	}

	public static int [] selectionSort(int [] arr){

		for(int i = 0; i < arr.length - 1; i++){
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;

	}

	public static int [] insertionSort(int [] arr){

		for(int i = 1; i < arr.length; i++){
			int j = i;
			while(j > 0 && arr[j] < arr[j - 1]){
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		return arr;

	}

}