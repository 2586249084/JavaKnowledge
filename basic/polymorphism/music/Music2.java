package polymorphism.music;
//: polymorphism/music/Music2.java
// Overloading instead of upcasting
// 重载而不是向上转型

import static util.Print.*;

class Stringed extends Instrument {
	public void play(Note n) {
		println("Stringed.play()" + n);
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		println("Brass.play()" + n);
	}
}

public class Music2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Brass i) {
		i.play(Note.C_SHARP);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHron = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHron);
	}
}/*Output:
Wind.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() C_SHARP
*/
