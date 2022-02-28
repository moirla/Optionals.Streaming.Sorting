package cheese;

import java.util.ArrayList;
import java.util.List;

public class Cheese {

	private String name;
	static List<Cheese> cheeses = new ArrayList<Cheese>(List.of(new Cheese("Brie"),new Cheese("Colby"),
			new Cheese("Cheddar"),new Cheese("Parmesan")));
	
	
	public Cheese(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compare(Cheese c1, Cheese c2) {
		return c1.toString().compareTo(c2.toString());
	}

	@Override
	public String toString() {
		return "Cheese [name=" + name + " Type: Cheese]";
	}
	
	public static List<Cheese> getCheese() {
		return cheeses;


}
}
