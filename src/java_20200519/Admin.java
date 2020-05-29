package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//-------------------------변수(생성자, setter, getter) ------------------------------
	//디폴트 생성자(default constructor)
	//alt + shift + s => c
	public Admin() { //생성자는 반환값이 없기에 굳이 void를 쓸 필요 없음. 내포되어 있음.
		super(); //부모 클래스의 디폴트 생성자를 호출		
	}
	//인스턴스 변수의 경우 무조건 생성자가 있어야 초기화 가능. 생성자가 없음에도 호출이 가능한 것은 생성자를 아무것도 생성하지 않을 경우
	//프로그램 자체적으로 이러한 디폴트 생성자가 생성되기 때문.
	
	
	//생성자(Constructor) 
	//생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	//생성자의 역할은 인스턴스 변수 초기화
	//alt + shift + s => o
	public Admin(String id, String pwd, String email, int level) {
		super(); //부모 클래스의 디폴트 생성자를 호출
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	//생성자도 오버로딩 가능.
	public Admin(String id, String pwd, String email) {  
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		this(id,pwd,email,0);//다른 생성자를 호출,반드시 생성자에서만 호출 가능
		//this 용법 2가지
		//1. 자기자신 객체 => this.
		//2. 다른 생성자를 호출 => this(~, ~,,,,)
	}
	
	//private으로 감춰진 변수는 setter, getter를 통해서 접근 가능.
	//id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}
	//id에 대한 getter 메서드
	public String getId() {
		return id;
	}
	
	//pwd에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//pwd에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}
	
	//email에 대한 setter 메서드
	public void setEmail(String email) {
		this.email = email;
	}
	//email에 대한 getter 메서드
	public String getEmail() {
		return email;
	}
	
	//level에 대한 setter 메서드
	public void setLevel(int level) {
		this.level = level;
	}
	//level에 대한 getter 메서드
	public int getLevel() {
		return level;
	}

}
