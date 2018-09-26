package polymorphism;
//: polymorphism/PolyConstructor.java
// Constructor and polymorphism
// don't produce what you might expect.
// 构造函数和多态性不会产生你所期望的

import static util.Print.*;

class Glyph {
	void draw() {
		println("Glyph().draw()");
	}
	
	Glyph() {
		println("Glyph() before draw()");
		draw();
		println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw() {
		println("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}/*Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5

*/
