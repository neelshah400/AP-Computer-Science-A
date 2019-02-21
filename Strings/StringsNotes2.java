public class StringsNotes2{

	public static void main(String[]args){

		String word1 = "abc";
		String word2 = "def";

		// compareTo()
		System.out.println(word1.compareTo(word2));
		System.out.println(word2.compareTo(word1));

		// char
		for(char letter = 'a'; letter <= 'z'; letter++)
			System.out.print(letter + " ");
		System.out.println();
		char letter = 'c';
		int charValue = (int)letter;
		System.out.println(charValue);

	}

}