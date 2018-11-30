package kr.co.acorn.app;

public class WeaponImple implements Weapon{
	CheckWeapon cw;
	
	public WeaponImple() {}
	
	public WeaponImple(CheckWeapon cw) {
		super();
		this.cw = cw;
	}
	
	@Override	
	public void fire() {
		System.out.println("파이아");
		cw.check();
	}

	@Override
	public void reload() {
		System.out.println("장전중");
		cw.check();
	}

	
	public void setCw(CheckWeapon cw) {
		this.cw = cw;
	}
	
	
}
