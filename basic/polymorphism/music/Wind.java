package polymorphism.music;
//: polymorphism/music/Wind.java
// Wind objects are instruments 
// because they have the same interface:
// Wind对象是乐器因为他们有相同的接口


import static util.Print.*;

public class Wind extends Instrument {
	// Redefine interface method:
	// 重新定义接口方法
	public void play(Note n) {
		println("Wind.play() " + n);
	}
}
