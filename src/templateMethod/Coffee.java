package templateMethod;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter.");
	}

	@Override
	public void addCondiment() {
		System.out.println("Adding sugar and milk.");
	}

}
