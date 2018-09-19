package initialization;
//: initialization/Leaf.java

/**
 * Leaf this关键字的简单使用
 * @author Mrzhang
 */
public class Leaf {
	
	int i = 0;
	
	Leaf increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
