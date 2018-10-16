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
			// ��finally����ʹ��'return'����ʹ�׳����쳣���ֳ�Ĭ
			return;
		}
		
	}
	
} ///:~
