package kr.co.acorn.dto;

public class MemberDTO {
	String id;
	String pw;
	String repw;
	String email;
	String addrs;
	
	public MemberDTO() {}
	
	public MemberDTO(String id, String pw, String repw, String email, String addrs) {
		super();
		this.id = id;
		this.pw = pw;
		this.repw = repw;
		this.email = email;
		this.addrs = addrs;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getRepw() {
		return repw;
	}
	public void setRepw(String repw) {
		this.repw = repw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	
}
