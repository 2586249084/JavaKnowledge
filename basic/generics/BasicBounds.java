package generics;
//: generics/BasicBounds.java

import java.awt.*;

interface HasColor {
	
	Color getColor();
	
}

class Colored<T extends HasColor> {
	
	T item;

	Colored(T item) { this.item = item; }
	
	T getItem() { return item; }
	
	// The bound allows you to call a method:
	// 绑定允许您调用一个方法:
	Color color() { return item.getColor(); }
	
}

class Dimension { public int x, y, z; }

// This won't work -- class must be first, then interfaces:
// 这是行不通的--首先是类，然后是接口:
//! class ColoredDimension<T extends HasColor & Dimension> { }

// Multiple bounds:
// 多个边界:
class ColoredDimension<T extends Dimension & HasColor> {
	
	T item;
	
	ColoredDimension(T item) { this.item = item; }
	
	T geiItem() { return item; }
	
	Color color() { return item.getColor(); }
	
	int getX() { return item.x; }
	
	int getY() { return item.y; }
	
	int getZ() { return item.z; }
	
}

interface Weight { int weight(); }

// As with inheritance, you can have only one
// concrete class but multiple interfaces:
// 与继承一样，您只能有一个具体的类，但是有多个接口:
class Solid<T extends Dimension & HasColor & Weight> {
	
	T item;

	Solid(T item) { this.item = item; }
	
	T getItem() { return item; }
	
	Color color() { return item.getColor(); }
	
	int getX() { return item.x; }
	
	int getY() { return item.y; }
	
	int getZ() { return item.z; }
	
	int weight() { return item.weight(); }
	
}

class Bounded extends Dimension implements HasColor, Weight {

	@Override
	public int weight() { return 0; }

	@Override
	public Color getColor() { return null; }
	
}

public class BasicBounds {

	public static void main(String[] args) {
		Solid<Bounded> solid = 
		  new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}

} ///:~
