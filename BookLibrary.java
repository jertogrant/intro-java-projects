public class BookLibrary 
{
	String title;
	String author;
	int numOfPages;
	boolean available;

		void displayInfo()
	{
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Number of Pages: " + numOfPages);
		System.out.println("Is this book available? " + available);
	}	

	public static void main(String[] args)
	{
	BookLibrary book1 = new BookLibrary();
	BookLibrary book2 = new BookLibrary();
	BookLibrary book3 = new BookLibrary();

	book1.title = "Harry Potter";
	book1.author = "JK Rowling";
	book1.numOfPages = 300;
	book1.available = true;

	book2.title = "Emma";
	book2.author = "Jane Austen";
	book2.numOfPages = 250;
	book2.available = false;

	book3.title = "Random Name";
	book3.author = "Nabokov";
	book3.numOfPages = 600;
	book3.available = false;

	book1.displayInfo();
	book2.displayInfo();
	book3.displayInfo();
	}
}