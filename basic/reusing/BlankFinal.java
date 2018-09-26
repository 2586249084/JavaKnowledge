package reusing;
//: reusing/BlankFinal.java
// "Blank" final fields
// 空白final字段

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
	private final int i = 0; // Initialized final 初始化final
	private final int j; // Blank final 空白final
	private final Poppet p; // Blank final reference 空白final应用
	
	// Blank finals must be initialized in the constructor:
	// 空白final常量必须在构造中初始化
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
