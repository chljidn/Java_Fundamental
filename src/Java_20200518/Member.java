package Java_20200518;

public class Member {
	private String name;//(멤버변수 생성)
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;
	
	//name에 대한 setter
	public void setName(String name) {
		this.name = name; //(멤버변수)this.name = name(매개변수)
	}
	//name에 대한 gettet
	public String getName() {
		return name;
	}
	
	//zipcode에 대한 setter
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	//zipcode에 대한 gettet
	public String getZipcode() {
		return zipcode;
	}
	
	//addr1에 대한 setter
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	//addr1에 대한 gettet
	public String getAddr1() {
		return addr1;
	}
	
	//addr2에 대한 setter
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	//addr2에 대한 gettet
	public String getAddr2() {
		return addr2;
	}
	
	//ssn1에 대한 setter
	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}
	//ssn2에 대한 gettet
	public String getSsn1() {
		return ssn1;
	}
	
	//ssn2에 대한 setter
	public void setSsn2(String ssn2) {
		this.ssn2 = ssn2;
	}
	//ssn2에 대한 gettet
	public String getSsn2() {
		return ssn2;
	}
	
	//age에 대한 setter
	public void setAge(int age) {
		this.age = age;
	}
	//age에 대한 gettet
	public int getAge() {
		return age;
	}
	
	//regdate에 대한 setter
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	//regdate에 대한 gettet
	public String getRegdate() {
		return regdate;
	}
}
