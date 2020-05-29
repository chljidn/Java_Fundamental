package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}

}

class A{
	A(int a){
	}
	A() {//이 디폴트 생성자가 없으면 class B는 에러가 나게 된다. 		
	}
}

class B extends A {
	
}
	



/*
class A extends Object{
	A(){ //컴파일러가 디폴트 생성자를 만들때는 클래스의 접근한정자를 그대로 따라간다.
		super();
	}
	
}

class B extends A{
	B(){
		super();
		
	} */