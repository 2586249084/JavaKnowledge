package polymorphism.shape;
//: polymorphism/shape/Triangle.java

import static util.Print.println;

public class Triangle extends Shape {
	@Override
	public void draw() {
		println("Triangle.draw()");
	}
	
	@Override
	public void earse() {
		println("Triangle.earse()");
	}
}
