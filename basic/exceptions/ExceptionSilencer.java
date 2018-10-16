package exceptions;
//: exceptions/ExceptionSilencer.java

public class ExceptionSilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			// Using 'return' inside the finally block
			// will silence any thrown exception.
			// 在finally块中使用'return'将会使抛出的异常保持沉默
			return;
		}
		
	}
	
} ///:~
