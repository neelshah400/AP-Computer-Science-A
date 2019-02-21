import java.util.ArrayList;

public class ArrayListNotes{

	public static void main(String[]args){

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());

		for(int i = 1; i <= 10; i++)
			list.add(i); // adds i to end of list

		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " "); // returns element i
		System.out.println();
		System.out.println(list);

		list.add(1,-1); // goes to index 1, inserts -1, and shifts everything else to the right
		System.out.println(list);

		list.set(2,-2); // replaces element 2 with -2
		System.out.println(list);

		list.remove(4); // removes element 4
		System.out.println(list);

		System.out.println(list.remove(4)); // returns element 4 (removed)
		System.out.println(list);

		list.add(4,list.remove(2)); // removes element 2, reorders elements, inserts 2 into index 4, and shifts everything else to the right
		System.out.println(list);

	}

}