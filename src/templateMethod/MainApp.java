package templateMethod;

public class MainApp {
	public static void main(String[] args) {

		final CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
	}
}
