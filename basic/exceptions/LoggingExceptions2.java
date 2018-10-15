package exceptions;
//: exceptions/LoggingExceptions2.java
// Logging caught exceptions.
// ��־��¼���쳣

import java.io.*;
import java.util.logging.*;

public class LoggingExceptions2 {
	
	private static Logger logger = Logger.getLogger("LogginExceptions2");
	
	static void logException(Exception error) {
		StringWriter trace  = new StringWriter();
		error.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		}catch (NullPointerException error) {
			logException(error);
		}
	}
	
}/*Output:
ʮ�� 15, 2018 1:17:48 ���� exceptions.LoggingExceptions2 logException
����: java.lang.NullPointerException
	at exceptions.LoggingExceptions2.main(LoggingExceptions2.java:21)
*///:~
