package kr.co.acorn.app.test3;

public class LaserPrinter implements Printer {
	int red, green, blue;
	
	// 1.생성자
	public LaserPrinter() {}
	public LaserPrinter(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	// 2.
	
	@Override
	public void print() {
		if(red > 0 && green > 0 && blue >0 ) {
			System.out.println("red: " + red);
			System.out.println("green: " + green);
			System.out.println("blue: " + blue);
		}else {
			System.out.println("토너 교체가 필요합니다.");
		}
		// 만약 3가지 색중 부족한게 있다면 출력할 수 없다.
		
		//토너 교체가 필요하다는 메세지를 출력
		
		
	}


}
