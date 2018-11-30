package kr.co.acorn.app;

public class Police implements Character {
	int hp;
	Weapon w;
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	@Override
	public void walk() {
		System.out.println("뚜벅뚜벅 걸어요.");
	}

	@Override
	public void eat(String it) {
		System.out.println(it + "을 먹어요.");
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj + "을 공격합니다.");
		w.use();
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj + "을 획득하였습니다.");
	}

}
