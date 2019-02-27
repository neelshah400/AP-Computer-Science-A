public class Sorting{

	public static void main(String[]args){

		int [] arrNorm = {8, 6, 4, 7, 5};
		int [] arrSelection = {8, 6, 4, 7, 5};
		int [] arrInsertion = {8, 6, 4, 7, 5};

		for(int i = 0; i < arrNorm.length; i++)
			System.out.print(arrNorm[i] + "\t");
		System.out.println();

		arrSelection = selectionSort(arrSelection);
		for(int i = 0; i < arrSelection.length; i++)
			System.out.print(arrSelection[i] + "\t");
		System.out.println();

		arrInsertion = insertionSort(arrInsertion);
		for(int i = 0; i < arrInsertion.length; i++)
			System.out.print(arrInsertion[i] + "\t");
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