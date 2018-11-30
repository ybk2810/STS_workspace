package spring_app2;

import org.springframework.beans.factory.annotation.Value;

public class HandDripCoffee implements Beverage{
	@Value("핸드드립커피에 맞는 과자")
	String snack;
	@Override
	public void drink(String name) {
		System.out.println("'"+ name + "'님이 'HandDripCoffee'와 '" + snack + "'를 맛있게 먹어요.");
	}
	public void setSnack(String snack) {
		this.snack = snack;
	}
}
