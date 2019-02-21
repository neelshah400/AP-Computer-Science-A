public class StringRecursionPractice{

	public static void main(String[]args){

		String test = "abc123cde";
		System.out.println(loop(test));
		System.out.println(recursion(test));

	}

	public static int loop(String str){

		int cnt = 0;
		while(str.length() > 0){
			char c = str.charAt(0);
			if(c >= 48 && c <= 57)
				cnt += Integer.parseInt(Character.toString(c));
			str = str.substring(1);
		}
		return cnt;

	}

	public static int recursion(String str){

		if(str.length() == 0)
			return 0;
		char c = str.charAt(0);
		if(c >= 48 && c <= 57)
			return Integer.parseInt(Character.toString(c)) + recursion(str.substring(1));
		return recursion(str.substring(1));

	}

}