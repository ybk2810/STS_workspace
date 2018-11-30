package kr.co.acorn.app;

public class TaserGun implements Weapon {
	int battery;
	
	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public void use() {
		if(battery>10) {
			System.out.println("지이이잉ㅇ");
		}
	}
	
	@Override
	public void reuse() {
		System.out.println("테이저건 장전");
		battery = 100;
	}

	@Override
	public void drop() {
		System.out.println("지지지지직");
		battery = 0;
	}
}
