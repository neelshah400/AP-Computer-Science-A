import java.util.ArrayList;

public class StringsPractice2{

	public static void main(String[]args){

		//1
		String exampleString = "ThIs is A tEst";
		ArrayList<Character> lowercaseAlphabet = new ArrayList<>();
		for(char letter = 'a'; letter <= 'z'; letter++)
			lowercaseAlphabet.add(letter);
		int lowercaseLetters = 0;
		for(int i = 0; i < exampleString.length(); i++){
			char current = exampleString.charAt(i);
			if(lowercaseAlphabet.contains(current))
				lowercaseLetters++;
		}
		System.out.println(lowercaseLetters);
		System.out.println();

		String test = "The quick brown fox jumped over the lazy dog";

		//2
		int previous = 0;
		for(int i = 0; i < test.length(); i++){
			if(test.charAt(i) == ' '){
				System.out.println(test.substring(previous, i));
				previous = i + 1;
			}
		}
		System.out.println(test.substring(previous));
		System.out.println();

		//3
		previous = 0;
		ArrayList<String> words = new ArrayList<>();
		for(int i = 0; i < test.length(); i++){
			if(test.charAt(i) == ' '){
				words.add(test.substring(previous, i));
				previous = i + 1;
			}
		}
		words.add(test.substring(previous));
		System.out.println(words);
		System.out.println();

		//4
		int minIndex = 0;
		for(int i = 0; i < words.size(); i++){
			String current = words.get(i);
			String past = words.get(minIndex);
			if(current.compareTo(past) < 0)
				minIndex = i;
		}
		System.out.println(words.get(minIndex));
		System.out.println();

	}

}