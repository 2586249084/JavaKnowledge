package reusing;
//: reusing/Cartoon.java
// Constructor calls during inheritance.
// �̳��ڼ�Ĺ��캯������

import static util.Print.*;

class Art{
	Art() {
		println("Art constructor");
	}
}

class Drawing extends Art{
	Drawing() {
		println("Drawing constructor");
	}
}

public class Cartoon extends Drawing{
	public Cartoon() {
		println("Cartoon constructor");
	}
	
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
		x.toString();
	}
}
