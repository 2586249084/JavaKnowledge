package polymorphism.shape;
//: polymorphism/shape/Shapes.java
// Polymorphism in java
// Java中的多态性

public class Shapes {
	private static RandomShapeGenerator gen = 
			new RandomShapeGenerator();
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			gen.next().draw();
		}
	}
}
