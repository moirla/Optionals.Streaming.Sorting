package cheese;

import java.util.Comparator;
import java.util.List;

public class CheeseSort {
	
	public List<Cheese> getCheesesL(){
		List<Cheese> cheeses = Cheese.getCheese();
		Comparator<Cheese> comp = (c1, c2) -> Cheese.compare(c1, c2);
		
		cheeses.sort(comp);
		return cheeses;
		
	}
	
	public List<Cheese> getCheesesM(){
		List<Cheese> cheeses = Cheese.getCheese();
		Comparator<Cheese> comp = Cheese::compare;
		
		cheeses.sort(comp);
		return cheeses;
	}
	
}
