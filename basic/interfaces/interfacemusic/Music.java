package interfaces.interfacemusic;
//: interfaces/interfacemusic/Music.java
// Interfaces 接口

import util.Note;
import static util.Print.*;

interface Instrument {
	// Compile-time constant:
	// 编译时常量
	int VALUE = 5;
	// Cannot have method definitions:
	// 不能有方法定义
	void play(Note n);// Automatically public 自动为public
	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) { println(this + ".play() " + n); }
	
	public String toString() { return "Wind"; }
	
	public void adjust() { println(this + ".adjust()"); }
}

class Percussion implements Instrument {
	public void play(Note n) { println(this + ".play() " + n); }
	
	public String toString() { return "Percussion"; }
	
	public void adjust() { println(this + ".adjust()"); }
}

class Stringed implements Instrument {
	public void play(Note n) { println(this + ".play() " + n); }
	
	public String toString() { return "Stringed"; }
	
	public void adjust() { println(this + ".adjust()"); }
}

class Brass extends Wind {
	public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
	public String toString() { return "Woodwind"; }
}

public class Music {
	static void tune(Instrument i) {
		// ...
		i.play(Note.B_FLAT);
	}
	
	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			i.play(Note.B_FLAT);
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
