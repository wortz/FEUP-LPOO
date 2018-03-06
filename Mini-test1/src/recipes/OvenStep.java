package recipes;

public class OvenStep {
	private RecipeStep recipe;
	private int temperature;
	public OvenStep(String string, String string2, int i) {
		RecipeStep r=new RecipeStep(string,string2);
		this.recipe=r;
		this.temperature=i;
	}
	public void addIngredient(SimpleIngredient s, float i) {
		this.recipe.addIngredient(s, i);
	}
	public String getName() {
		return (this.recipe.getName());
	}
	public String getAction() {
		return (this.recipe.getAction());
	}
	public int getTemperature() {
		return this.temperature;
	}
	
	

}
