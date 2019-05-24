public class CompareStrings{

	public static void main(String[]args){

		String a = "a";
		String b = "b";
		String c = "c";

		System.out.println(a.compareTo(a) + "\t" + a.compareTo(b) + "\t" + a.compareTo(c));
		System.out.println(b.compareTo(a) + "\t" + b.compareTo(b) + "\t" + b.compareTo(c));
		System.out.println(c.compareTo(a) + "\t" + c.compareTo(b) + "\t" + c.compareTo(c));

	}

}