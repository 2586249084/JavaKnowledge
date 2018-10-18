package util;
//: util/Print.java

import java.io.*;

public class Print {
	
	public static void print(Object object) {
		System.out.print(object);
	}
	
	public static void println(Object object) {
		System.out.println(object);
	}
	
	public static void println() {
		System.out.println();
	}
	
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
