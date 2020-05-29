package Java_20200520;

public class ShapeDemo {
	//추상 클래스의 다형성 
	public static void run(Shape s) {//부모클래스인 Shape의 draw()메서드를 run메서드로 참조.
		s.draw(); //이렇게 하면 각각의 자식클래스(Rectangle, Circle...)에 속한 부모클래스(shape)의 draw()메서드가 호출됨.
	}
	
	/* public static void run(Triangle t) {
		t.draw(); //이렇게 지정하면 자식클래스(Triangle) 안에 있는 draw()메서드가 호출됨.
	}
	
	public static void run(Circle c) {
		c.draw();
	}
	
	public static void run(Rectangle r) {
		r.draw();
	} */
	
	
	
	public static void main(String[] args) {
		//추상클래스는 객체를 생성할 수 없다.
		//shape s1 = new Shape();
		
		Shape s1 = new Rectangle(); //s1 객체 생성 -> Rectangle 클래스의 객체 생성
		                            //정해진 타입(Shape)의 클래스까지만 호출 가능
		s1.draw();
		
		Rectangle r1 = new Rectangle(); //r1 객체 생성 -> Rectangle 클래스의 객체를 만든다
		                                //정해진 타입(Rectangle)의 클래스까지 호출가능.
		run(r1); //자식 클래스(Rectangle)가 속한 부모클래스(Shape)의 draw호출.
		
		Circle c1 = new Circle();
		run(c1);//자식 클래스(Circle)가 속한 부모클래스 (Shape)의 draw호출.
		
		Triangle t1 = new Triangle();
		run(t1);//자식 클래스(Triangle)가 속한 부모클래스(Shape)의 draw호출.
		
		

		
		
		
	}

}
