package initialization;
//: initialization/Flower.java

import static commentUtil.Print.*;

/**
 * Flower 
 * ��this�ؼ��ֵ��ù��캯��
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
		//! this(s); //Can't call two ���ܵ�������
		this.s = s;
		println("String & int args");
	}
	
	Flower(){
		this("hi", 47);
		println("default constructor (no args)");
		//! this("hi", 47); ���뽫���������÷�������ʼ��
	}
	
	void printPetalCount() {
		//! this(11); //Not inside non-constructor �����ڹ��캯������� 
		println("petalCount = " + petalCount + ",s = " + s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
