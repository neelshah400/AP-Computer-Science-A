import java.util.*;

public class ForEachLoopNotes{

	public static void main(String[]args){

		ArrayList<String> list = new ArrayList<>();
		list.add("Bobby");
		list.add("Jim");

		for(String item : list)
			System.out.println(item + "\t" + item.length());

	}

}