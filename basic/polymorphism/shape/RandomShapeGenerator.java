package polymorphism.shape;

//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
// 一个随机创造形状的工厂

import java.util.Random;

public class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next() {
		Shape shape = null;
		switch (rand.nextInt(3)) {
			case 0:
				shape = new Circle();
				break;
			case 1:
				shape = new Square();
				break;
			case 2:
				shape = new Triangle();
				break;
			default:
				shape = new Shape();
		}
		return shape;
	}
}
