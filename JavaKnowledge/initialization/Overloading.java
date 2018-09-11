package initialization;
//: initialization/Overloading.java

import static commentUtil.Print.*;

/**
 * Overloading 重载
 * 演示构造函数和普通方法重载
 * @author Mrzhang
 */
public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		new Tree();
	}
}

class Tree{
	int height;
	
	Tree(){
		println("Planting a seeding");
		height = 0;
	}
	
	Tree(int inittialHeight){
		height = inittialHeight;
		println("Creating new tree that is " + height + " feet tall");
	}
	
	void info() {
		println("Tree is " + height + " feet tall");
	}
	
	void info(String str) {
		println(str + " Tree is " + height + " feet tall");
	}
}
