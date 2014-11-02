package L4HW5_library;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
	
		Book[] dataBook = new Book[7];
		
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
		
		dataBook[3] = new Book();
		dataBook[3].authorName = "Samuel Fromartz";
		dataBook[3].bookName = "In Search of the Perfect Loaf: A Home Baker's Odyssey";
		dataBook[3].category = 3;
		
		dataBook[4] = new Book();
		dataBook[4].authorName = "Rowan Jacobsen";
		dataBook[4].bookName = "Apples of Uncommon Character: Heirlooms, Modern Classics, and Little-Known Wonders";
		dataBook[4].category = 3;
		
		dataBook[5] = new Book();
		dataBook[5].authorName = "Anika Denise";
		dataBook[5].bookName = "Baking Day at Grandma's";
		dataBook[5].category = 3;
		
		dataBook[6] = new Book();
		dataBook[6].authorName = "James McCaffrey";
		dataBook[6].bookName = "Machine Learning Using C# Succinctly";
		dataBook[6].category = 3;		
		
		sort(dataBook);
		showBook(dataBook);
		

	}
	//END main
	
//Methods:
	
	static void sort (Book[] dataSort) {
		for (int i = 0; i < dataSort.length - 1; i++) {
			authSwap(dataSort);
		}
	}
	
	static Book[] showBook (Book[] dataBookForShow) {
		for (int i = 0; i < dataBookForShow.length; i++) {
			System.out.println(dataBookForShow[i].authorName);
			System.out.println(dataBookForShow[i].bookName);
			System.out.println("-----");
		}
		return dataBookForShow;
	}
	
	static Book[] authSwap (Book[] bookForSwap) {
		
		for (int i = 0; i < bookForSwap.length - 1; i++) {
			
			if ((int)bookForSwap[i].authorName.charAt(0) > (int)bookForSwap[i + 1].authorName.charAt(0)){
			
			Book tempBook = new Book();
			tempBook = bookForSwap[i]; 
			bookForSwap[i] = bookForSwap[i + 1];
			bookForSwap[i + 1] = tempBook;
		}	
		}
		return bookForSwap;
	}

}
