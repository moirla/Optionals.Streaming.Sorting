package cheese;

import java.util.NoSuchElementException;
import java.util.Optional;

public class CheeseMenu3 {

	public static void main(String[] args) {

		new CheeseMenu3().run();
		
	}
	
	private void run() {
		Cheese cheese = CheeseMethodA(Optional.of(new Cheese("Guda")));
		System.out.println(cheese);
		
		try {		
		CheeseMethodA(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Cheese CheeseMethodA(Optional<Cheese> optionalcheese) {
		return optionalcheese.orElseThrow(() -> new NoSuchElementException("No Cheese"));
	}

	
	
}
