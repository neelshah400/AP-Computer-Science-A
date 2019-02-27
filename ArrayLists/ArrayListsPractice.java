import java.util.ArrayList;

public class ArrayListsPractice{

	public static void main(String[]args){

		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < 15; i++)
			a.add((int)(Math.random() * 10) + 1);
		System.out.println("ArrayList:\t\t" + a);

		System.out.println("Find 5 With Loop:\t" + findNumWithLoop(a, 5));

		System.out.println("Find 5 Recursively:\t" + findNumRecursively(a, a.size(), 5));

		for(int i = 0; i < 10; i++)
			a.add((int)(Math.random() * 10) + 11);
		System.out.println("Larger ArrayList:\t" + a);

		for(int i = 0; i < 5; i++)
			a.set((int)(Math.random() * a.size()), (int)(Math.random() * 10) + 21);
		System.out.println("Modified ArrayList:\t" + a);

	}

	public static int findNumWithLoop(ArrayList<Integer> a, int num){

		for(int i = 0; i < a.size(); i++){
			if(a.get(i) == num)
				return i;
		}
		return -1;

	}

	public static int findNumRecursively(ArrayList<Integer> a, int size, int num){

		if(a.size() == 0)
			return (-1 * size) -1;
		if(a.get(0) == num)
			return 0;
		a.remove(0);
		return 1 + findNumRecursively(a, size, num);

	}

}