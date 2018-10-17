package exceptions;
//: exceptions/TurnOffChecking.java
// "Turning off" Checked exception.
// "�ر�"����쳣.

import java.io.*;
import static util.Print.*;

class WrapCheckedException {
	
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0: throw new FileNotFoundException();
			case 1: throw new IOException();
			case 2: throw new RuntimeException("Where am I?");
			default: return;
			}
		} catch(Exception exception) { // Adapt to unchecked: ��Ӧδ���˶Ե�
			throw new RuntimeException(exception);
		}
	}
	
}

@SuppressWarnings("serial")
class SomeOtherException extends Exception {}

public class TurnOffChecking {

	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		
		// You can call throwRuntimeException() without a try
		// block, and let RuntimeExceptions leave the method:
		// �������ڲ�ʹ��try�������µ���throwRuntimeException()����������ʱ�쳣�뿪����:
		wce.throwRuntimeException(3);
		
		// Or you can choose to catch exceptions:
		// ���������ѡ�񲶻��쳣:
		for (int i = 0; i < 4; i++)
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch(SomeOtherException sException) {
				println("SomeOtherException : " + sException);
			} catch(RuntimeException rException) {
				try {
					throw rException.getCause();
				} catch(FileNotFoundException fException) {
					println("FileNotFoundException : " + fException);
				} catch(IOException ioException) {
					println("IOException : " + ioException);
				} catch(Throwable throwable) {
					println("Throwable : " + throwable);
				}
			}
	}

}/*Output:
FileNotFoundException : java.io.FileNotFoundException
IOException : java.io.IOException
Throwable : java.lang.RuntimeException: Where am I?
SomeOtherException : exceptions.SomeOtherException
*///:~
