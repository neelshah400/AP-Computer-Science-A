public class Dog{

	// "instance variables" / "class variables" / "member variables" / "properties"
	private String breed;
	private int age;

	// "default constructor"
	public Dog(){

		breed = "Pug";
		age = 5;

	}

	/*
	// another "constructor"
	public Dog(String dogBreed, int dogAge){

		breed = dogBreed;
		age = dogAge;

	}
	*/

	// another "constructor"
	public Dog(String breed, int age){

		this.breed = breed;
		this.age = age;

	}

	// "getter method" - breed
	public String getBreed(){

		return breed;

	}

	// "setter method" - breed
	public void setBreed(String breed){

		this.breed = breed;

	}

	// "getter method" - age
	public int getAge(){

		return age;

	}

	// "setter method" - age
	public void setAge(int Age){

		this.age = age;

	}

	public String toString(){

		return "This is a " + breed + " and it is " + age + ".";

	}

}