public class StringsNotes{

	public static void main(String[]args){

		String word = "Hello";
		String word2 = new String("Hello");
		String word3 = "Hello";
		String word4 = "abc";

		// == compares locations of Strings in memory
		System.out.println(word == "Hello");
		System.out.println(word == word2);
		System.out.println(word == word4);

		// .equals() compares values of Strings
		System.out.println(word.equals("Hello"));
		System.out.println(word.equals(word2));

		// indexOf()
		System.out.println(word.indexOf("el"));
		System.out.println(word.indexOf("aa"));

		// charAt()
		System.out.println(word.charAt(3));

		// substring()
		System.out.println(word.substring(1,4));
		System.out.println(word.substring(1,word.length()));
		System.out.println(word.substring(2));

	}

}