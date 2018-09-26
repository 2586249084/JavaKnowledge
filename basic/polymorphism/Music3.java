package polymorphism;
//: polymorphism/Music3.java
// An extensible program.
// 一个可扩展的程序

import static util.Print.*;
import polymorphism.music.Note;

class Instrument {
	void play(Note n) { println("Instrument.play() " + n); }
	
	String what() { return "Instrument"; }
	
	void adjust() { println("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { println("Wind.play() " + n); }
	
	String what() { return "Wind"; }
	
	void adjust() { println("Adjusting Wind"); }
}

class Percussion extends Instrument {
	void play(Note n) { println( "Percussion.play() " + n); }
	
	String what() { return "Percussion"; }
	
	void adjust() { println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
	void play(Note n) { println("Stringed.play() " + n); }
	
	String what() { return "Stringed"; }
	
	void adjust() { println("Adjusting Stringed"); }
}

class Brass extends Wind {
	void play(Note n) { println("Brass.play() " + n); }
	
	void adjust() { println("Adjusting Brass"); }
}

class Woodwind extends Wind {
	void play(Note n) { println( "Woodwind.play() " + n); }
	
	String what() { return "Woodwind"; }
}

public class Music3 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	// 不关心类型，所以添加到系统中的新类型仍然正常工作
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for (Instrument  i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		
		tuneAll(orchestra);
	}
}
