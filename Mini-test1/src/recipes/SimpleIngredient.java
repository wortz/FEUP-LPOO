package recipes;

public class SimpleIngredient extends Ingredient{
	
	public SimpleIngredient(String name) {
		super(name);
	}
	
	public boolean equals(SimpleIngredient s) {
		return this.getName()==s.getName();
	}
	
	public boolean equals(Object s) {
		return this.getName()==((SimpleIngredient)s).getName();
	}
	
	
	
}
