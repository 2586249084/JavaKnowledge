package exceptions;
//: exceptions/LostMessage.java
// How an exception can be lost.
// 一个异常是如何丢失的

class VeryImportantException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "A very important exception!";
	}
	
}

class HoHumException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "A trivial exception";
	}
	
}

public class LostMessage {
	
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch(Exception exception) {
			System.out.println(exception);
		}
	}
	
}/*Output:
A trivial exception
*///:~
