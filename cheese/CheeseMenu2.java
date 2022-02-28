package cheese;

import java.util.stream.Collectors;

public class CheeseMenu2 {
	//private CheeseSort cheeseSort = new CheeseSort();
	
	public static void main(String[] args) {

		new CheeseMenu2().run();
		
	}

	private void run() {
		System.out.println(
				Cheese.getCheese().stream()
				.map(Cheese::toString)
				.collect(Collectors.joining(",")));			
	}
	
	
}
