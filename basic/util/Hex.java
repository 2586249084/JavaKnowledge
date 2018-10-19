package util;
//: util/Hex.java
// Tool classes for hexadecimal dumps.
// 十六进制转储的工具类.

// import java.io.*;

public class Hex {
	
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0)
				result.append(String.format("%05X: ", n));
			result.append(String.format("%02X ", b));
			n++;
			if (n % 16 == 0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	
} ///:~
