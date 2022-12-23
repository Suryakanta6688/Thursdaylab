 
//Explain run-time polymorphism with a real time scenario....?



package thursdaylab;


class Shape{                   // parent class
	void draw() {
		System.out.println("Drawing shapes.....");
	}
}
class Rectangle extends Shape {           ////Sub-class
	void draw() {
		System.out.println("1->Drawing Rectangle....");
		
	}
}
class Square extends Shape {                   //Sub-class
	void draw() {
		System.out.println("2->Drawing Square....");
		
	}
}
class Circle extends Shape {                  //Sub-class
	void draw() {
		System.out.println("3->Drawing Circle.....");
	}
}
public class PolymorphismExample {                          //main class

	public static void main(String[] args) {
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Square();
		s.draw();
		s=new Circle();
		s.draw();
		

	}

}
