package L4HW5_library;

public class Library {

	private Book[] dataBook = new Book[14];{
	
	dataBook[0] = new Book();
	dataBook[0].setAuthorName("Tracy Hickman");
	dataBook[0].setBookName("Embers of Atlantis");
	dataBook[0].setCategory(1); //Fantasy
	
	dataBook[1] = new Book();
	dataBook[1].setAuthorName("Fauche, Leturgie, and Luguy");
	dataBook[1].setBookName("Legends of Percevan, Volume 4: The Seven Seals");
	dataBook[1].setCategory(1); //Fantasy
	
	dataBook[2] = new Book();
	dataBook[2].setAuthorName("Graham McNeill");
	dataBook[2].setBookName("The Dweller in the Deep");
	dataBook[2].setCategory(1); //Fantasy
	
	dataBook[3] = new Book();
	dataBook[3].setAuthorName("Samuel Fromartz");
	dataBook[3].setBookName("In Search of the Perfect Loaf: A Home Baker's Odyssey");
	dataBook[3].setCategory(2); //Food
	
	dataBook[4] = new Book();
	dataBook[4].setAuthorName("Rowan Jacobsen");
	dataBook[4].setBookName("Apples of Uncommon Character: Heirlooms, Modern Classics, and Little-Known Wonders");
	dataBook[4].setCategory(2); //Food
	
	dataBook[5] = new Book();
	dataBook[5].setAuthorName("Anika Denise");
	dataBook[5].setBookName("Baking Day at Grandma's Perfect");
	dataBook[5].setCategory(2); //Food
	
	dataBook[6] = new Book();
	dataBook[6].setAuthorName("James McCaffrey");
	dataBook[6].setBookName("Machine Learning Using C# Succinctly");
	dataBook[6].setCategory(3); //Computers
	
	dataBook[7] = new Book();
	dataBook[7].setAuthorName("Alex Petzold");
	dataBook[7].setBookName("Creating Mobile Apps with Xamarin.Forms");
	dataBook[7].setCategory(3); //Computers
	
	dataBook[8] = new Book();
	dataBook[8].setAuthorName("Scott Fitzgerald");
	dataBook[8].setBookName("The Great Gatsby");
	dataBook[8].setCategory(4); //Fiction
	
	dataBook[9] = new Book();
	dataBook[9].setAuthorName("Alex McCullough");
	dataBook[9].setBookName("John Adams");
	dataBook[9].setCategory(5); //History
	
	dataBook[10] = new Book();
	dataBook[10].setAuthorName("Barbara W. Tuchman, Robert K. Massie");
	dataBook[10].setBookName("The Guns of August");
	dataBook[10].setCategory(5); //History
	
	dataBook[11] = new Book();
	dataBook[11].setAuthorName("Kate Moross");
	dataBook[11].setBookName("Make your own luck by Kate Moross");
	dataBook[11].setCategory(6); //GraphicDesign
	
	dataBook[12] = new Book();
	dataBook[12].setAuthorName("Alex Fowkes");
	dataBook[12].setBookName("Drawing Type");
	dataBook[12].setCategory(6); //GraphicDesign
	
	dataBook[13] = new Book();
	dataBook[13].setAuthorName("Type Directors Club");
	dataBook[13].setBookName("Typography 34");
	dataBook[13].setCategory(6); //GraphicDesign
}
	
//Getters & Setters
	public Book[] getDataBook() {
		return dataBook;
	}
	public void setDataBook(Book[] dataBook) {
		this.dataBook = dataBook;
	}
}
