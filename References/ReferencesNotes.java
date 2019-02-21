import java.util.ArrayList;

public class ReferencesNotes{

	public static void main(String[]args){

		ArrayList<String> listA = new ArrayList<>();
		ArrayList<String> listB = new ArrayList<>();

		listA.add("a");
		listA.add("b");
		listA.add("c");

		listB.add("d");
		listB.add("e");
		listB.add("f");

		System.out.println("listA: " + listA);
		System.out.println("listB: " + listB);

		listA = listB;

		listA.add("123");

		System.out.println("listA: " + listA);
		System.out.println("listB: " + listB);

	}

}