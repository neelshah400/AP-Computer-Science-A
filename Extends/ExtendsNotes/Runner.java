public class Runner{

	public static void main(String[]args){

		Person person1 = new Person("Bob", "Rebels");
		System.out.println(person1);

		JediKnight jedi1 = new JediKnight("Luke", "Rebels", "Force Push");
		System.out.println(jedi1);
		System.out.println(jedi1.getName());

		System.out.println(person1 instanceof Person);
		System.out.println(person1 instanceof JediKnight);

		System.out.println(jedi1 instanceof Person);
		System.out.println(jedi1 instanceof JediKnight);

	}

}