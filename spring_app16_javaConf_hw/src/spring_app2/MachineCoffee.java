package spring_app2;

public class MachineCoffee implements Beverage {
	String snack;

	public void setSnack(String snack) {
		this.snack = snack;
	}

	@Override
	public void drink(String name) {
		System.out.println("'" + name + "'님이 'MachineCoffee'와 '" + snack + "'을 먹어요.");
	}

}
