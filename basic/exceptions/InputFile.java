package exceptions;
//: exceptions/InputFile.java
// Paying attention to exceptions in constructors.
// ע�⹹�캯���е��쳣

import java.io.*;

public class InputFile {
	
	private BufferedReader in;
	
	public InputFile(String fileName) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fileName));
			// Other code that might throw exceptions.
			// ���������׳��쳣�Ĵ���
		} catch(FileNotFoundException exception) {
			System.out.println("Could not open " + fileName);
			// Wasn't open, so don't close it.
			// û�д򿪣����Բ�Ҫ�ر���
			throw exception;
		} catch(Exception exception) {
			// All other exceptions must close it.
			// �����������쳣������ر���
			try {
				in.close();
			} catch(IOException ioException) {
				System.out.println("in.close() unsuccessful");
			}
			throw exception; // Rethrow
		} finally {
			// Don't close it here!!!
			// ����������ر���
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
