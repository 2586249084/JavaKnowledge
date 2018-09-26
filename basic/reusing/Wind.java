package reusing;
//: reusing/Wind.java
// Inheritance & upcasting
// �̳к�����ת��

class Instrument {
	public void play() {}
	
	static void tune(Instrument i) {
		i.play();
	}
}

// Wind objects are instruments
// because they have the same interface
// Wind������������Ϊ��������ͬ�Ľӿ�
public class Wind extends Instrument {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Wind flute = new Wind();
		flute.tune(flute);
	}
}
