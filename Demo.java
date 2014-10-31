package L4HW5_library;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
	
		Book[] dataBook = new Book[3];
		
		dataBook[0] = new Book();
		dataBook[0].authorName = "Tracy Hickman";
		dataBook[0].bookName = "Embers of Atlantis";
		dataBook[0].category = 0;
		
		dataBook[1] = new Book();
		dataBook[1].authorName = "Fauche, Leturgie, and Luguy";
		dataBook[1].bookName = "Legends of Percevan, Volume 4: The Seven Seals";
		dataBook[1].category = 1;
		
		dataBook[2] = new Book();
		dataBook[2].authorName = "Graham McNeill";
		dataBook[2].bookName = "The Dweller in the Deep";
		dataBook[2].category = 3;

		for (int i = 0; i < dataBook.length; i++) {
		System.out.println(dataBook[i].authorName);	
		}
	}

}
