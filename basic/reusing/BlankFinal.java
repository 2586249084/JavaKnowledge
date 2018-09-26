package reusing;
//: reusing/BlankFinal.java
// "Blank" final fields
// �հ�final�ֶ�

import static util.Print.*;

class Poppet {
	
	private int i;
	
	public Poppet(int ii) {
		i = ii;
	}
	
	public String toString() {
		return "Poppet : i = " + i;
	}
}

public class BlankFinal {
	private final int i = 0; // Initialized final ��ʼ��final
	private final int j; // Blank final �հ�final
	private final Poppet p; // Blank final reference �հ�finalӦ��
	
	// Blank finals must be initialized in the constructor:
	// �հ�final���������ڹ����г�ʼ��
	public BlankFinal() {
		j = 1; // Initialize blank final
		p = new Poppet(1); // Initialize blank final reference
	}
	
	public BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}
	
	public String toString() {
		return "BlankFinal : i = " + i + ", j = " + j + "\t" + p.toString();
	}
	
	public static void main(String[] args) {
		println(new BlankFinal());
		println(new BlankFinal(47));
	}
}
