import java.util.ArrayList;

public class Runner{

	public static void main(String[]args){

		//PART 1

		System.out.println("INITIAL BOOKCARD:\n");

		BookCard book = new BookCard("Willa Cather","My Antonia",1918);

		System.out.println("Author:\t" + book.getAuthor());
		System.out.println("Title:\t" + book.getTitle());
		System.out.println("Year:\t" + book.getYear());
		System.out.println();

		System.out.println("FINAL BOOKCARD:\n");

		book.setAuthor("Stephen Crane");
		book.setTitle("The Red Badge of Courage");
		book.setYear(1895);

		System.out.println("Author:\t" + book.getAuthor());
		System.out.println("Title:\t" + book.getTitle());
		System.out.println("Year:\t" + book.getYear());
		System.out.println();

		System.out.println("LIST OF FAVORITE BOOKS:\n");

		ArrayList<BookCard> list = new ArrayList<>();

		BookCard book1 = new BookCard("Brandon Sanderson","Mistborn",2006);
		BookCard book2 = new BookCard("Andy Weir","The Martian",2011);
		BookCard book3 = new BookCard("Willa Cather","My Antonia",1918);
		BookCard book4 = new BookCard("Willa Cather","My Antonia",1918);
		BookCard book5 = new BookCard("Willa Cather","My Antonia",1918);

		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);

		for(int i = 0; i < list.size(); i++){
			System.out.println((i + 1) + ". \"" + list.get(i).getTitle() + "\" by " + list.get(i).getAuthor() + " (" + list.get(i).getYear() + ")");
		}

		System.out.println();

		//PART 2

		System.out.println("REPRINTED LIST OF FAVORITE BOOKS:\n");

		for(int i = 0; i < list.size(); i++){
			System.out.println((i + 1) + ". " + list.get(i));
		}

		System.out.println();

		System.out.println("RANDOM LIST OF BOOKS:\n");

		ArrayList<String> authors = new ArrayList<>();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<Integer> years = new ArrayList<>();

		authors.add("Author 1");
		authors.add("Author 2");
		authors.add("Author 3");
		authors.add("Author 4");
		authors.add("Author 5");

		titles.add("Book 1");
		titles.add("Book 2");
		titles.add("Book 3");
		titles.add("Book 4");
		titles.add("Book 5");

		years.add(2001);
		years.add(2002);
		years.add(2003);
		years.add(2004);
		years.add(2005);

		ArrayList<BookCard> combined = new ArrayList<>();

		for(int i = 0; i < 5; i++){
			int randAuthor = (int)(Math.random() * 5);
			int randTitle = (int)(Math.random() * 5);
			int randYear = (int)(Math.random() * 5);
			BookCard newBook = new BookCard(authors.get(randAuthor),titles.get(randTitle),years.get(randYear));
			combined.add(newBook);
		}

		for(int i = 0; i < combined.size(); i++){
			System.out.println((i + 1) + ". " + combined.get(i));
		}

		System.out.println();

		//PART 3

		System.out.println("NEWEST BOOK IN LIST OF FAVORITE BOOKS:\n");
		System.out.println(newestBook(list));

		System.out.println();

		System.out.println("NEWEST BOOK IN RANDOM LIST OF BOOKS:\n");
		System.out.println(newestBook(combined));

		System.out.println();

		System.out.println("BOOKS CONTAINING \"Weir\" IN LIST OF FAVORITE BOOKS:\n");
		match(list,"Weir");

		System.out.println();

		System.out.println("BOOKS CONTAINING \"Book\" IN RANDOM LIST OF BOOKS:\n");
		match(combined,"Book");

		System.out.println();

	}

	public static BookCard newestBook(ArrayList<BookCard> a){

		int index = 0;
		int newest = 0;
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getYear() > newest){
				index = i;
				newest = a.get(i).getYear();
			}
		}
		return a.get(index);

	}

	public static void match(ArrayList<BookCard> a,String b){

		for(int i = 0; i < a.size(); i++){
			if(a.get(i).getAuthor().contains(b) || a.get(i).getTitle().contains(b) || (a.get(i).getYear() + "").contains(b))
				System.out.println("- " + a.get(i));
		}

	}

}