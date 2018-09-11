package initialization;
//: initialization/Flower.java

import static commentUtil.Print.*;

/**
 * Flower 
 * 用this关键字调用构造函数
 * @author Mrzhang
 */
public class Flower {
	
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals){
		petalCount = petals;
		println("Constructor w/ int arg only, petalCount = " + petalCount);
	}
	
	Flower(String ss){
		println("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}
	
	Flower(String s, int petals){
		this(petals);
		//! this(s); //Can't call two 不能调用两次
		this.s = s;
		println("String & int args");
	}
	
	Flower(){
		this("hi", 47);
		println("default constructor (no args)");
		//! this("hi", 47); 必须将构造器调用放在最起始处
	}
	
	void printPetalCount() {
		//! this(11); //Not inside non-constructor 必须在构造函数里调用 
		println("petalCount = " + petalCount + ",s = " + s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
