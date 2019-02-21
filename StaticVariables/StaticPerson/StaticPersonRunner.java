public class StaticPersonRunner{

	public static void main(String[]args){

		StaticPerson p1 = new StaticPerson();

		System.out.println("p1:\n\n" + p1);

		p1.add();
		p1.add();
		p1.add();

		System.out.println("\np1:\n\n" + p1);

		StaticPerson p2 = new StaticPerson();

		p2.add();
		p2.add();

		System.out.println("\np1:\n\n" + p1);
		System.out.println("\np2:\n\n" + p2);

		System.out.println("\nstaticNumber: " + StaticPerson.staticNumber);

	}

}