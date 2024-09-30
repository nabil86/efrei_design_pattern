package templateMethod;

public abstract class CaffeineBeverage {

	/**
	 * Template method for preparing a caffeine beverage
	 **/
	public void prepareRecipe() {
		boilWater();
		brew();
		if (customerWantsCondiments()) {
			addCondiment();
		}
		pourInCup();
	}

	public void pourInCup() {
		System.out.println("Pouring beverage into cup.");
	}

	public void boilWater() {
		System.out.println("Boiling water.");
	}

	public abstract void addCondiment();

	public abstract void brew();

	public boolean customerWantsCondiments() {
		return true;
	}

}