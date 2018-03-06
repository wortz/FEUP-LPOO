package recipes;

public class OvenStep extends RecipeStep{
	private int temperature;
	public OvenStep(String string, String string2, int i) {
		super(string,string2);
		this.temperature=i;
	}

	public int getTemperature() {
		return this.temperature;
	}
	
	

}
