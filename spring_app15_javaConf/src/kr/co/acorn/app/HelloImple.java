package kr.co.acorn.app;

public class HelloImple implements Hello {

	@Override
	public void sayHello(String msg) {
		System.out.println("msg: " + msg);
		
	}

}
