import java.util.ArrayList;

// "runner class" / "client class"
public class ObjectNotes{

	public static void main(String[]args){

		// "instantiating" dog
		Dog dog = new Dog();

		//System.out.println(dog.breed);
		System.out.println(dog.getBreed());
		//System.out.println(dog.age);
		System.out.println(dog.getAge());

		//dog.age = 7;
		dog.setBreed("Puppy");
		//System.out.println(dog.age);
		System.out.println(dog.getBreed());

		System.out.println();

		// "instantiating" dog2
		Dog dog2 = new Dog("Poodle",2);

		//System.out.println(dog2.breed);
		System.out.println(dog2.getBreed());
		//System.out.println(dog2.age);
		System.out.println(dog2.getAge());

		System.out.println();

		// ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		System.out.println(list.size());
		//System.out.println(list.size);

		System.out.println();

		Dog dog1 = new Dog();
		System.out.println(dog1);

		System.out.println();

	}

}