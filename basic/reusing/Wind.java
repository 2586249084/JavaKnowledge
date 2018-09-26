package reusing;
//: reusing/Wind.java
// Inheritance & upcasting
// 继承和向上转型

class Instrument {
	public void play() {}
	
	static void tune(Instrument i) {
		i.play();
	}
}

// Wind objects are instruments
// because they have the same interface
// Wind对象是乐器因为他们有相同的接口
public class Wind extends Instrument {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Wind flute = new Wind();
		flute.tune(flute);
	}
}
