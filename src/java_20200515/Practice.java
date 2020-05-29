package java_20200515;

public class Practice {
	//이름, 전화번호, 주소, 
	//class의 접근한정자는 public, default
	//멤버변수의 접근한정자는 public, private, protected, default
	
	//접근한정자가 public인 변수 생성
	public String name; //instance 변수 생성
	public String phone;
	public boolean isReleased;
	public static double interestRate;//static 변수 생성
	public static final String BANKNAME = "신한은행"; //final 변수 생성
	
	//접근한정자가 protected인 변수 생성
	protected String email;//instance변수 생성
	protected static String address;//static변수 생성
	protected static final String SECRETE = "비밀";//final 변수 생성
	
	//접근한정자가 default인 변수 생성
	int height; ; //instance 변수 생성
	static String family;//static변수 생성
	static final String CAR = "benz"; //final 변수 생성
	
	//접근한정자가 private인 변수 생성
	private int AccNum; //instance 변수 생성
	private static int DebtRatio = 450_000_000; //static 변수 생성
	private static final int CARNUMBER = 5;
	
	//Practice c1 = new Practice();
	//c1.CARNUMBER= "10";
	
	
	
	
	
	
	
	
}
