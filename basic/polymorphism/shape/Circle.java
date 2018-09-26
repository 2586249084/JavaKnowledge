package polymorphism.shape;
//: polymorphism/shape/Circle.java

import static util.Print.*;

public class Circle extends Shape {
	@Override
	public void draw() {
		println("Circle.draw()");
	}
	
	@Override
	public void earse() {
		println("Circle.earse()");
	}
}
