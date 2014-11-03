package L4HW5_library;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Library library = new Library();

		sortByAuthorName(library.getDataBook());
		//sortByBookName(library.getDataBook());
		//findByBookName(library.getDataBook(), "Perfect");
		//findByAuthor(library.getDataBook(), "Alex");
		showMeBook(library.getDataBook());
		//showCategory(library.getDataBook(), 1);
		
	}

	// END main

	// Methods:
	static void sortByAuthorName(Book[] dataForSort) {
		for (int i = 0; i < dataForSort.length - 1; i++) {
			swapByAuthorName(dataForSort);
		}
	}

	static void sortByBookName(Book[] dataForSort) {
		for (int i = 0; i < dataForSort.length - 1; i++) {
			swapByBookName(dataForSort);
		}
	}

	static Book[] swapByAuthorName(Book[] booksForSwap) {

		for (int i = 0; i < booksForSwap.length - 1; i++) {

			if ((int) booksForSwap[i].getAuthorName().charAt(0) > (int) booksForSwap[i + 1].getAuthorName().charAt(0)) {

				Book tempBook = new Book();
				tempBook = booksForSwap[i];
				booksForSwap[i] = booksForSwap[i + 1];
				booksForSwap[i + 1] = tempBook;
			}
		}
		return booksForSwap;
	}

	static Book[] swapByBookName(Book[] booksForSwap) {

		for (int i = 0; i < booksForSwap.length - 1; i++) {

			if ((int) booksForSwap[i].getBookName().charAt(0) > (int) booksForSwap[i + 1].getBookName().charAt(0)) {

				Book tempBook = new Book();
				tempBook = booksForSwap[i];
				booksForSwap[i] = booksForSwap[i + 1];
				booksForSwap[i + 1] = tempBook;
			}
		}
		return booksForSwap;
	}

	static Book[] showMeBook(Book[] booksForShow) {
		System.out.println("                  ");
		System.out.println("	All Books In Our Catalogue: ");
		System.out.println("                  ");
		for (int i = 0; i < booksForShow.length; i++) {
			System.out.println("Author:		" + booksForShow[i].getAuthorName());
			System.out.println("Book:		" + booksForShow[i].getBookName());
			System.out.println("Category:	" + categoryHeader(booksForShow[i].category));
			System.out.println("       ");
		}
		return booksForShow;
	}

	static String categoryHeader(int indexOfCategory) {
		String headerText = "n/a";

		if (indexOfCategory == 0) {
			headerText = "UNCATEGORIZED";
		} else if (indexOfCategory == 1) {
			headerText = "FANTASY";
		} else if (indexOfCategory == 2) {
			headerText = "FOOD";
		} else if (indexOfCategory == 3) {
			headerText = "COMPUTERS";
		} else if (indexOfCategory == 4) {
			headerText = "FICTION";
		} else if (indexOfCategory == 5) {
			headerText = "HISTORY";
		} else if (indexOfCategory == 6) {
			headerText = "GRAPHIC DESIGN";
		}
		return headerText;
	}

	static Book[] findByBookName(Book[] booksForFind, String whatWeFind) {
		System.out.println("                  ");
		System.out.println("	Find By Book: ");
		System.out.println("                  ");
		for (int i = 0; i < booksForFind.length; i++) {
			if (booksForFind[i].getBookName().indexOf(whatWeFind) >= 0) {
				System.out.println("Author:		" + booksForFind[i].getAuthorName());
				System.out.println("Book name:	"+ booksForFind[i].getBookName());
				System.out.println("Category:	" + categoryHeader(booksForFind[i].category));
				System.out.println("                  ");
				System.out.println("                  ");
			}
		}
		return booksForFind;
	}

	static Book[] findByAuthor(Book[] booksForFind, String whatWeFind) {
		System.out.println("                  ");
		System.out.println("	Find By Author: ");
		System.out.println("                  ");
		for (int i = 0; i < booksForFind.length; i++) {
			if (booksForFind[i].getAuthorName().indexOf(whatWeFind) >= 0) {
				System.out.println("Author:		" + booksForFind[i].getAuthorName());
				System.out.println("Book name:	"+ booksForFind[i].getBookName());
				System.out.println("Category:	" + categoryHeader(booksForFind[i].category));
				System.out.println("                  ");
				System.out.println("                  ");
			}
		}
		return booksForFind;
	}

	static Book[] showCategory(Book[] booksForFind, int dataCategory) {
		System.out.println("                  ");
		System.out.println("	Category " + categoryHeader(dataCategory) + ":");
		System.out.println("                  ");
		for (int i = 0; i < booksForFind.length; i++) {
			if (booksForFind[i].category == dataCategory) {
				System.out.println("Author:		" + booksForFind[i].getAuthorName());
				System.out.println("Book name:	" + booksForFind[i].getBookName());
				System.out.println("                  ");
				System.out.println("                  ");
			}
		}
		return booksForFind;
	}
}
