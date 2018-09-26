package polymorphism.music;
//: polymorphism/music/Music.java
// Inheritance & upcasting.
// �̳к�����ת��

public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
