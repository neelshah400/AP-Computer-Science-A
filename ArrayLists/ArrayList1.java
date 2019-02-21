import java.util.ArrayList;

public class ArrayList1{

	public static void main(String[]args){

		//1
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			list.add((int)(Math.random() * 11) + 10);
		System.out.println(list + "\n");

		//2
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) % 2 == 0)
				System.out.print(list.get(i) + " ");
		}
		System.out.println("\n" + list + "\n");

		//3
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) % 2 == 0)
				list.set(i,list.get(i) + 1);
		}
		System.out.println(list + "\n");

		//4
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			list2.add(i);
		System.out.println(list2);
		System.out.println(swapList(list2) + "\n");

		//5
		System.out.println(list2);
		System.out.println(changeOdds(list2) + "\n");

		//6
		System.out.println(list);
		System.out.println(list2);
		System.out.println(concatenation(list,list2) + "\n");


	}

	public static ArrayList swapList(ArrayList<Integer> a){

		int temp = a.get(0);
		a.set(0,a.remove(a.size() - 1));
		a.add(temp);
		return a;

	}

	public static ArrayList changeOdds(ArrayList<Integer> b){

		for(int i = 0; i < b.size(); i++){
			if(b.get(i) % 2 == 1)
				b.set(i,(b.get(i - 1) * 2));
		}
		return b;

	}

	public static ArrayList concatenation(ArrayList<Integer> c,ArrayList<Integer> d){

		ArrayList<Integer> e = new ArrayList<>();
		for(int i = 0; i < c.size(); i++){
			e.add(c.get(i));
		}
		for(int i = 0; i < d.size(); i++){
			e.add(d.get(i));
		}
		return e;

	}

}