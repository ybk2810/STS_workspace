package spring_app2;

public class HandDripCoffee implements Beverage{
	String snack;
	
	public void setSnack(String snack) {
		this.snack = snack;
	}
	
	@Override
	public void drink(String name) {
		System.out.println(name + "님이 dropcoffee와 " + snack + "를 맛있게 먹어요");
	}

}
