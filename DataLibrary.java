package L4HW5_library;

public class DataLibrary {

	Library[] dataBook = new Library[10];{
		
		String all;
		
		dataBook[0] = new Library();
		dataBook[0].authorName = "Tracy Hickman";
		dataBook[0].bookName = "Embers of Atlantis";
		dataBook[0].Genre = 0;
		all = dataBook[0].authorName + dataBook[0].bookName;
		System.out.println(all);
		}

	public Library[] getDataBook() {
		return dataBook;
	}

	public void setDataBook(Library[] dataBook) {
		this.dataBook = dataBook;
	}
	
}
