package reusing;
//: reusing/Bath.java
// Constructor initialization with composition.
// 构造器初始化

import static util.Print.*;

class Soap{
	
	private String s;
	
	Soap() {
		println("Soap()");
		s = "Constructor";
	}
	
	public String toString() {
		return s;
	}
}

public class Bath {
	
	private String // Initializing at point of definition:
				   // 在定义点初始化
		s1 = "Happy", 
		s2 = "Happy", 
		s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath() { // Initializing at constructor 
					// 在构造函数中初始化
		println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	
	{ // Instance initialization 实例初始化
		i = 47;
	}
	
	public String toString() {
		if (s4 == null) { // Delayed initialization 延迟初始化
			s4 = "Tom";
		}
		return
		  "s1 = " + s1 + "\n" +
		  "s2 = " + s2 + "\n" +
		  "s3 = " + s3 + "\n" +
		  "s4 = " + s4 + "\n" +
		  "i = " + i + "\n" +
		  "toy = " + toy + "\n" +
		  "castille = " + castille;
	}
	
	public static void main(String[] args) {
		Bath bath = new Bath();
		System.out.println(bath);
	}
}
