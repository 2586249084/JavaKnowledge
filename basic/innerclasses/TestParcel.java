package innerclasses;
//: innerclasses/TestParcel.java

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	protected class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			this.label = whereTo;
		}
		public String readLabel() { return label; }
	}
	
	public Contents contents() {
		return new PContents();
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
}

public class TestParcel {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasnania");
		// Illegal -- can't access private class:
		// 错误 -- 不能初始化私有类
		//! Parcel4.PContents pc = p.new PContents();
	}
}/*
*///:~
