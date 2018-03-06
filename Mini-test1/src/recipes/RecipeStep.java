package recipes;

import java.util.HashMap;
import java.util.Map;

public class RecipeStep{
	private String nameRecipe;
	private String action;
	private Map<Ingredient,Float> ingredients=new HashMap<Ingredient,Float>();
	private Map<RecipeStep,Integer> recipes=new HashMap<RecipeStep,Integer>();
	
	public RecipeStep(String nameRecipe, String action) {
		if(nameRecipe ==null||action==null) throw new IllegalArgumentException();
		this.nameRecipe=nameRecipe;
		this.action=action;
	}
	
	public String getAction() {
		return this.action;
	}

	public String getName() {
		return nameRecipe;
	}

	public void addIngredient(Ingredient s, float f) {
		if(this.ingredients.containsKey(s))
			return;
		this.ingredients.put(s, f);
	}

	public int getIngredientCount() {
		return (this.ingredients.size());
	}

	public float getQuantity(Ingredient s) {
		float quant=0;
		for (Map.Entry<RecipeStep, Integer> entry : recipes.entrySet())
		{
		   quant+=(entry.getKey().getQuantity(s))*(entry.getValue());
		}
		if(ingredients.containsKey(s))
			quant +=ingredients.get(s);
		return quant;
	}

	public void addIngredient(RecipeStep r, int f) {
		if(this.recipes.containsKey(r)) {
			f+=this.recipes.get(r);
			this.recipes.replace(r, f);
			return;
		}
		this.recipes.put(r, f);
	}
	
	public String toString() {
		String res="to make " + this.nameRecipe + ", " + this.action + " ";
		if(!recipes.isEmpty()) {
			for (Map.Entry<RecipeStep, Integer> entry : recipes.entrySet())
			{
				res+= ((float)entry.getValue()) + " " + entry.getKey().getName() + ", ";
			}
		}
		if(!ingredients.isEmpty()) {
			for (Map.Entry<Ingredient, Float> entry : ingredients.entrySet())
			{
				res+= this.getQuantity(entry.getKey()) + " " + entry.getKey() + ", ";
			}
		}
		return res.substring(0, res.lastIndexOf(","));
	}

	public int getQuantity(RecipeStep r) {
		if(this.recipes.containsKey(r))
			return (this.recipes.get(r));
	return 0;
	}

}
