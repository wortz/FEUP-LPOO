package recipes;

import java.util.HashMap;
import java.util.Map;

public class RecipeStep{
	private String nameRecipe;
	private String action;
	private Map<Ingredient,Float> map=new HashMap<Ingredient,Float>();
	private Map<RecipeStep,Integer> map2=new HashMap<RecipeStep,Integer>();
	
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
		if(this.map.containsKey(s))
			return;
		this.map.put(s, f);
	}

	public int getIngredientCount() {
		return (this.map.size());
	}

	public float getQuantity(Ingredient s) {
	float q=0;
		if(this.map.containsKey(s))
			q += (this.map.get(s));
		if()
			return q;
	}

	public void addIngredient(RecipeStep r, int f) {
		if(this.map2.containsKey(r))
			return;
		this.map2.put(r, f);
		
	}

	public int getQuantity(RecipeStep r) {
		if(this.map2.containsKey(r))
			return (this.map2.get(r));
	return 0;
	}

}
