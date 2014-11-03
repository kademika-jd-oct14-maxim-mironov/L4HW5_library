package L4HW5_library;

public enum Category {
	
	UNCATEGORIZED(0), FANTASY(1), FOOD(2), COMPUTERS(3), FICTION(4), HISTORY(5), GRAPHIC_DESIGN(6);
	
	int index = 0;
	
	private Category(int index) {
		this.index = index;
	}
	
	Category () {
	}
}


