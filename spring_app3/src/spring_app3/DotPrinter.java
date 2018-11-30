package spring_app3;

public class DotPrinter implements Printer {

	@Override
	public void printing(String msg) {
		System.out.println(msg + "로 닷출력합니다.");
	}

}
