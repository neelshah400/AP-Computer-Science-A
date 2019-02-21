import java.util.ArrayList;

public class ArrayList2{

	public static void main(String[]args){

		//1
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			a.add((int)(Math.random() * 10) + 1);
		System.out.println(a + " --> " + removeOnes(a));
		ArrayList<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(1);
		b.add(1);
		b.add(6);
		b.add(7);
		b.add(8);
		System.out.println(b + " --> " + removeOnes(b));
		System.out.println();

		//2
		System.out.println(a + " + " + b + " --> " + combineLists(a,b));
		System.out.println();

		//3
		ArrayList<Integer> c = new ArrayList<>();
		c.add(4);
		c.add(7);
		c.add(4);
		ArrayList<Integer> d = new ArrayList<>();
		d.add(2);
		d.add(8);
		d.add(1);
		System.out.println(c + " + " + d + " --> " + pickBiggest(c,d));
		ArrayList<Integer> e = new ArrayList<>();
		e.add(1);
		e.add(2);
		e.add(3);
		ArrayList<Integer> f = new ArrayList<>();
		f.add(4);
		f.add(0);
		f.add(6);
		f.add(7);
		f.add(8);
		f.add(9);
		System.out.println(e + " + " + f + " --> " + pickBiggest(e,f));
		System.out.println();

		//4
		ArrayList<Integer> g = new ArrayList<>();
		g.add(2);
		g.add(5);
		g.add(8);
		ArrayList<Integer> h = new ArrayList<>();
		h.add(4);
		h.add(10);
		System.out.println(g + " + " + h + " --> " + putInOrder(g,h));
		System.out.println();

	}

	public static ArrayList removeOnes(ArrayList<Integer> list){

		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == 1){
				list.remove(i);
				i--;
			}
		}
		return list;

	}

	public static ArrayList combineLists(ArrayList<Integer> list1,ArrayList<Integer> list2){

		for(int i = 0; i < list2.size(); i++){
			list1.add(list2.get(i));
		}
		return list1;

	}

	public static ArrayList pickBiggest(ArrayList<Integer> list1,ArrayList<Integer> list2){

		ArrayList<Integer> list3 = new ArrayList<>();
		int min = 0;
		int max = 0;
		boolean addFromList1 = false;
		if(list1.size() <= list2.size()){
			min = list1.size();
			max = list2.size();
			addFromList1 = false;
		}
		else{
			min = list2.size();
			max = list1.size();
			addFromList1 = true;
		}
		for(int i = 0; i < min; i++){
			if(list1.get(i) >= list2.get(i))
				list3.add(list1.get(i));
			else
				list3.add(list2.get(i));
		}
		for(int i = min; i < max; i++){
			if(addFromList1 == true)
				list3.add(list1.get(i));
			else
				list3.add(list2.get(i));
		}
		return list3;

	}

	public static ArrayList putInOrder(ArrayList<Integer> list1,ArrayList<Integer> list2){

		ArrayList<Integer> list3 = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++)
			list3.add(list1.get(i));
		for(int i = 0; i < list2.size(); i++)
			list3.add(list2.get(i));
		ArrayList<Integer> list4 = new ArrayList<>();
		while(list3.size() > 0){
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < list3.size(); i++){
				if(list3.get(i) < min)
					min = list3.get(i);
			}
			for(int i = 0; i < list3.size(); i++){
				if(list3.get(i) == min)
					list3.remove(i);
			}
			list4.add(min);
		}
		return list4;

	}

}