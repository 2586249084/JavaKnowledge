package exceptions;
//: exceptions/LoggingExceptions2.java
// Logging caught exceptions.
// 日志记录了异常

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
十月 15, 2018 1:17:48 下午 exceptions.LoggingExceptions2 logException
严重: java.lang.NullPointerException
	at exceptions.LoggingExceptions2.main(LoggingExceptions2.java:21)
*///:~
