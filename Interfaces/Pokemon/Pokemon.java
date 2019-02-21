public class Pokemon implements Comparable<Pokemon>{

	private int hp;
	private String name;

	public Pokemon(int hp, String name){

		this.hp = hp;
		this.name = name;

	}

	public int getHp(){

		return hp;

	}

	public int compareTo(Pokemon obj){

		if(hp > obj.getHp())
			return 1;
		else if(hp < obj.getHp())
			return -1;
		else
			return name.compareTo(obj.name);

	}

	public String toString(){

		return name + ", " + hp + "HP\n";

	}

}