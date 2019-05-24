import java.util.ArrayList;

public class AlphabetizeByLastName{

	public static void main(String[]args){

		ArrayList<String> list = new ArrayList<>();
		list.add("Neel Shah");
		list.add("Nikhil Kapse");
		list.add("Suchit Peddireddy");
		System.out.println("Unsorted:\t" + list);

		ArrayList<String> first = new ArrayList<>();
		ArrayList<String> last = new ArrayList<>();
		for(String s : list){
			first.add(s.substring(0, s.indexOf(" ")));
			last.add(s.substring(s.indexOf(" ") + 1));
		}

		for(int i = 1; i < list.size(); i++){
			int j = i;
			while(j > 0 && last.get(j).compareTo(last.get(j - 1)) < 1){
				String fTemp = first.get(j);
				String lTemp = last.get(j);
				first.set(j, first.get(j - 1));
				last.set(j, last.get(j - 1));
				first.set(j - 1, fTemp);
				last.set(j - 1, lTemp);
				j--;
			}
		}
		for(int i = 0; i < list.size(); i++)
			list.set(i, first.get(i) + " " + last.get(i));
		System.out.println("Sorted:\t\t" + list);

	}

}