public class StringsPractice{

	public static void main(String[]args){

		String exampleString = "ThIs is A tEst";

		//1
		for(int i = 0; i < exampleString.length(); i++)
			System.out.print(exampleString.charAt(i));
		System.out.println();

		//2
		System.out.println(exampleString.substring(0, 4));

		//3
		for(int i = 0; i < 4; i++)
			System.out.print(exampleString.charAt(i));
		System.out.println();

		//4
		String reverseString = "";
		for(int i = exampleString.length() - 1; i >= 0; i--)
			reverseString += exampleString.charAt(i);
		System.out.println(reverseString);

		//5
		char [] arr = new char[exampleString.length()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = exampleString.charAt(i);
		for(int i = 0; i < arr.length / 2; i++){
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		exampleString = "";
		for(int i = 0; i < arr.length; i++)
			exampleString += arr[i];
		System.out.println(exampleString);

	}

}