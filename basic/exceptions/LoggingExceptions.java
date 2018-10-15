package exceptions;
//: exceptions/LoggingExceptions.java
// An exception that reports through a Logger.
// ͨ����¼��������쳣

import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
}

public class LoggingExceptions {
	
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException error) {
			System.err.println("Caught " + error);
		}
		
		try {
			throw new LoggingException();
		} catch (LoggingException error) {
			System.err.println("Caught " + error);
		}
	}
	
}/*Output:
ʮ�� 15, 2018 11:40:22 ���� exceptions.LoggingException <init>
����: exceptions.LoggingException
	at exceptions.LoggingExceptions.main(LoggingExceptions.java:27)

Caught exceptions.LoggingException
ʮ�� 15, 2018 11:40:22 ���� exceptions.LoggingException <init>
����: exceptions.LoggingException
	at exceptions.LoggingExceptions.main(LoggingExceptions.java:33)

Caught exceptions.LoggingException
*///:~
