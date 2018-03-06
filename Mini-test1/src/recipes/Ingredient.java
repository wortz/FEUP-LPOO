package recipes;

public abstract class Ingredient {
	private String name;
	public Ingredient(String name) {
		if(name ==null) throw new IllegalArgumentException();
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
