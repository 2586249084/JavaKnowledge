package exceptions;
//: exceptions/MainException.java

import java.io.*;

public class MainException {
	

	// Pass all exceptions to the console:
	// �������쳣���ݸ�����̨:
	public static void main(String[] args) throws Exception {
		// Open the file:
		//���ļ�
		FileInputStream file = new FileInputStream("E:/EclipseProject/JavaKnowledge/basic/exceptions/MainException.java");
		// Use the file:
		// Close the file:
		file.close();
	}

} ///:~
