package kr.co.acorn.app;

public class Gun implements Weapon{
	int bullet;
	
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}

	@Override
	public void use() {
		fire();
	}
	
	private void fire() {
		if(bullet>0) {
			System.out.println("빵~");
			bullet--;
		}else {
			System.out.println("뿡~");
		}
	}
	
	@Override
	public void reuse() {
		System.out.println("철컥");
		bullet=6;
	}

	@Override
	public void drop() {
		bullet=0;
	}
}
