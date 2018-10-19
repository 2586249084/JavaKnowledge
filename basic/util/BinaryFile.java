package util;
//: util/BinaryFile.java
// Tool classes for reading files in binary from.
// 用于从二进制文件中读取文件的工具类.

import java.io.*;

public class BinaryFile {
	
	public static byte[] read(File file) throws IOException {
		BufferedInputStream bufferedInput = new BufferedInputStream(
				new FileInputStream(file));
		try {
			byte[] data = new byte[bufferedInput.available()];
			bufferedInput.read(data);
			return data;
		} finally {
			bufferedInput.close();
		}
	}
	
	public static byte[] read(String pathName) throws IOException {
		return read(new File(pathName).getAbsoluteFile());
	}

} ///:~
