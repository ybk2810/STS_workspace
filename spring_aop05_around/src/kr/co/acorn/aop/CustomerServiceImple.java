package kr.co.acorn.aop;

public class CustomerServiceImple implements CustomerService {
	String name;
	String email;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void printName() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("당신의 이름은: " + name);
	}
	@Override
	public void printEmail() {
		System.out.println("당신읠 이메일: " + email);
	}
}
