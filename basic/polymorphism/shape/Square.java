package polymorphism.shape;
//: polymorphism/shape/Square.java

import static util.Print.println;

public class Square extends Shape {
	@Override
	public void draw() {
		println("Square.draw()");
	}
	
	@Override
	public void earse() {
		println("Square.earse()");
	}
}
