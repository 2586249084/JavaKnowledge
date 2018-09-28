package interfaces.music;
// interfaces/music/Music.java
// Abstract classes and methods.
// 抽象类和方法

import util.Note;
import static util.Print.*;

abstract class Instrument {
	@SuppressWarnings("unused")
	private int i;
	public abstract void play(Note n);
	public String what() { return "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		println("Wind.play()" + n);
	}
	
	public String what() { return "Wind"; }
	
	public void adjust() { }
}

class Percession extends Instrument {
	public void play(Note n) {
		println("Percession.paly()" + n);
	}
	
	public String what() { return "Percession"; }
	
	public void adjust() { };
}

class Stringed extends Instrument {
	public void play(Note n) {
		println("Stringed.play()" + n);
	}
	
	public String what() {
		return "Stringed";
	}
	
	public void adjust() { }
}

class Brass extends Wind {
	public void play(Note n) {
		println("Brass.play()" + n);
	}
	
	public void adjust() {
		println("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		println("Woodwind.play()" + n);
	}
	
	public String what() {
		return "Woodwind";
	}
}

public class Music {
	// Doesn't care about type, so new types
	// added to the system still work right:
	// 不关心类型，所以添加到系统中的新类型仍然正常工作
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
				new Percession(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}/*Output:
Wind.play() B_FLAT
Percession.paly() B_FLAT
Stringed.play() B_FLAT
Brass.play() B_FLAT
Woodwind.play() B_FLAT
*/
