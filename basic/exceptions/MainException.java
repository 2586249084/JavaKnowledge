package exceptions;
//: exceptions/MainException.java

import java.io.*;

public class MainException {
	

	// Pass all exceptions to the console:
	// 将所有异常传递给控制台:
	public static void main(String[] args) throws Exception {
		// Open the file:
		//打开文件
		FileInputStream file = new FileInputStream("E:/EclipseProject/JavaKnowledge/basic/exceptions/MainException.java");
		// Use the file:
		// Close the file:
		file.close();
	}

} ///:~
