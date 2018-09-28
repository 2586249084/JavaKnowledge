package polymorphism.music;
//: polymorphism/music/Instrument.java

import static util.Print.println;

import util.Note;

class Instrument {
	public void play(Note n) {
		println("Instrument.play()");
	}
}
