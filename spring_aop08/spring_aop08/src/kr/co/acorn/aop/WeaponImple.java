package kr.co.acorn.aop;

public class WeaponImple implements Weapon{
	String type;
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void fire() {
		System.out.println(type+"으로 총을쏴");
	}

	@Override
	public void reload() {
		System.out.println("장전중");
	}

}
