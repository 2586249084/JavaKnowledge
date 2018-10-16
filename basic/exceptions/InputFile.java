package exceptions;
//: exceptions/InputFile.java
// Paying attention to exceptions in constructors.
// 注意构造函数中的异常

import java.io.*;

public class InputFile {
	
	private BufferedReader in;
	
	public InputFile(String fileName) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fileName));
			// Other code that might throw exceptions.
			// 其他可能抛出异常的代码
		} catch(FileNotFoundException exception) {
			System.out.println("Could not open " + fileName);
			// Wasn't open, so don't close it.
			// 没有打开，所以不要关闭它
			throw exception;
		} catch(Exception exception) {
			// All other exceptions must close it.
			// 所有其他的异常都必须关闭它
			try {
				in.close();
			} catch(IOException ioException) {
				System.out.println("in.close() unsuccessful");
			}
			throw exception; // Rethrow
		} finally {
			// Don't close it here!!!
			// 不能在这里关闭它
		}
	}
	
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException exception) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch(IOException exception) {
			throw new RuntimeException("in.close() failed");
		}
	}
	
}
