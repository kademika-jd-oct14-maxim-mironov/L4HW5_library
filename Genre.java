package L4HW5_library;

public enum Genre {

	UNCATEGORIZED(0), FANTASY(1), FOOD(2), COMPUTERS(3), FICTION(4), HISTORY(5);
	
	int id;
	
	private Genre(int id){
		this.id = id;
	}
	
	Genre defaultBook() {
		return UNCATEGORIZED;
	}
	
}
