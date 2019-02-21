import java.util.ArrayList;
import java.util.Collections;

public class Runner{

	public static void main(String[]args){


		ArrayList<Pokemon> list = new ArrayList<>();

		for(int i = 10; i > 0; i--){
			int hp = (int)(Math.random() * 100) + 1;
			String name = "Pokemon " + i;
			Pokemon pokemon = new Pokemon(hp, name);
			list.add(pokemon);
		}

		System.out.println(list);
		System.out.println();
		Collections.sort(list);
		System.out.println(list);

	}

}