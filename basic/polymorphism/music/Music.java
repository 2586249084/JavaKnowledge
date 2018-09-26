package polymorphism.music;
//: polymorphism/music/Music.java
// Inheritance & upcasting.
// 继承和向上转型

public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
