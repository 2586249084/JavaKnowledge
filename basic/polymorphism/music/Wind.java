package polymorphism.music;
//: polymorphism/music/Wind.java
// Wind objects are instruments 
// because they have the same interface:
// Wind������������Ϊ��������ͬ�Ľӿ�


import static util.Print.*;

public class Wind extends Instrument {
	// Redefine interface method:
	// ���¶���ӿڷ���
	public void play(Note n) {
		println("Wind.play() " + n);
	}
}
