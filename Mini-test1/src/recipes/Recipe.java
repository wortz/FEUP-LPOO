package recipes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Recipe {
	private String name;
	private HashSet<RecipeStep> steps=new HashSet<RecipeStep>();
	
	public Recipe(String string) {
		this.name=string;
	}

	public int getStepCount() {
		return this.steps.size();
	}

	public void addStep(RecipeStep r) {
		if(steps.contains(r))
			return;
		steps.add(r);
		}
	
	
	
	

}
