public class Person{

	private String name;
	private String alliance;

	public Person(String name, String alliance){

		this.name = name;
		this.alliance = alliance;

	}

	public Person(){

		name = "no name";
		alliance = "no alliance";

	}

	public String getName(){

		return name;

	}

	public String toString(){

		return "The person's name is " + name;

	}

}