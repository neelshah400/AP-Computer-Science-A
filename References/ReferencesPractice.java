import java.util.ArrayList;

public class ReferencesPractice{

	public static void main(String[]args){

		System.out.println("BEFORE:\n");

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();

		for(int i = 1; i <= 5; i++){
			list1.add(10 + i);
			list2.add(20 + i);
			list3.add(30 + i);
			list4.add(40 + i);
		}

		System.out.println("\tlist1:\t" + list1);
		System.out.println("\tlist2:\t" + list2);
		System.out.println("\tlist3:\t" + list3);
		System.out.println("\tlist4:\t" + list4);

		System.out.println("\nAFTER:\n");

		list2 = list1;
		list3 = list1;
		list4 = list1;

		System.out.println("\tlist1:\t" + list1);
		System.out.println("\tlist2:\t" + list2);
		System.out.println("\tlist3:\t" + list3);
		System.out.println("\tlist4:\t" + list4);

		System.out.println();

		// Before:
			// list1 referenced a location in memory corresponding to [11, 12, 13, 14, 15].
			// list2 referenced a location in memory corresponding to [21, 22, 23, 24, 25].
			// list3 referenced a location in memory corresponding to [31, 32, 33, 34, 35].
			// list4 referenced a location in memory corresponding to [41, 42, 43, 44, 45].
		// Afterwards:
			// list2, list3, and list4 were set to reference the location in memory corresponsing to list1.
			// Thus, each ArrayList referenced the location in memory corresponding to [11, 12, 13, 14, 15].
			// Through garbage collection, the old ArrayList values were deleted from memory.

	}

}