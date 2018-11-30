package spring_app3;

public class LaserPrinter implements Printer {

	@Override
	public void printing(String msg) {
		System.out.println(msg + "로 출력합니다.");
		System.out.println("찌이이이잉ㅇ~");
	}
	
}
