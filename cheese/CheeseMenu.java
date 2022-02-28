package cheese;

import java.util.List;

public class CheeseMenu {
	private CheeseSort cheeseSort = new CheeseSort();
	
	public static void main(String[] args) {

		new CheeseMenu().runMR();
		
	}

	private void runL() {
		List<Cheese> cheeses = cheeseSort.getCheesesL();
		
		cheeses.forEach(Cheese -> System.out.println(Cheese.getName()));
	}
	
	private void runMR() {
		List<Cheese> cheeses = cheeseSort.getCheesesL();
		
		cheeses.forEach(System.out::println);
	}
	
}
