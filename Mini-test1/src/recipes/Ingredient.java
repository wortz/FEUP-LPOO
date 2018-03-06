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
	

	public boolean equals(SimpleIngredient s) {
		return this.getName()==s.getName();
	}
	
	public boolean equals(Object s) {
		return this.getName()==((SimpleIngredient)s).getName();
	}
	
	
	public String toString() {
		return this.name;
	}
	
}
