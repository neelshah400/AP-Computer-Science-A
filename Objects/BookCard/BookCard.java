public class BookCard{

	private String author;
	private String title;
	private int year;

	public BookCard(String author,String title,int year){

		this.author = author;
		this.title = title;
		this.year = year;

	}

	public String getAuthor(){

		return author;

	}

	public void setAuthor(String author){

		this.author = author;

	}

	public String getTitle(){

		return title;

	}

	public void setTitle(String title){

		this.title = title;

	}

	public int getYear(){

		return year;

	}

	public void setYear(int year){

		this.year = year;

	}

	public String toString(){

		return "\"" + title + "\" by " + author + " (" + year + ")";

	}

}