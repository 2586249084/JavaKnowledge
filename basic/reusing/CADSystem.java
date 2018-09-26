package reusing;
//: reusing/CADSystem.java
// Ensuring proper cleanup.
// 确保适当的清理

import static util.Print.*;

class Shape{
	Shape(int i) {
		println("Shape constructor");
	}
	
	void dispose() {
		println("Shape dispose");
	}
}

class Circle extends Shape{
	Circle(int i) {
		super(i);
		println("Drawing Circle");
	}
	
	void dispose() {
		println("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape{
	Triangle(int i) {
		super(i);
		println("Drawing Triangle");
	}
	
	void dispose() {
		println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	
	private int start, end;
	
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		println("Drawing Line : " + start + ", " + end);
	}
	
	void dispose() {
		println("Erasing Line : " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j * j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		println("Combined constructor");
	}
	
	public void dispose() {
		println("CADSystem.dispose()");
		// The order of cleanup is the reverse
		// of the order of initialization:
		// 清理的顺序与初始化顺序相反
		t.dispose();
		c.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			// Code and exception
			// 代码和异常
		} finally {
			x.dispose();
		}
	}
}/* Output:
Shape constructor
Shape constructor
Drawing Line : 0, 0
Shape constructor
Drawing Line : 1, 1
Shape constructor
Drawing Line : 2, 4
Shape constructor
Drawing Circle
Shape constructor
Drawing Triangle
Combined constructor
CADSystem.dispose()
Erasing Triangle
Shape dispose
Erasing Circle
Shape dispose
Erasing Line : 0, 0
Shape dispose
Erasing Line : 1, 1
Shape dispose
Erasing Line : 2, 4
Shape dispose
Shape dispose
*/
