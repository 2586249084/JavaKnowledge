package util;
//: util/TextFile.java
// Static functions for reading and writing text files as
// a single string, and treating a file as an ArrayList.
// 将文本文件作为单个字符串读取和写入的静态函数，并将文件视为ArrayList.

import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String> {

	private static final long serialVersionUID = 1L;

	// Read a file, split by any regular expression:
	// 阅读一个文件，由任何正则表达式分割:
	public TextFile(String fileName, String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		// Regular expression split() often leaves an empty
		// string at the first position:
		// 正则表达式split()通常在第一个位置留下空字符串:
		if (get(0).equals(""))
			remove(0);
	}

	// Normally read by lines:
	// 通常按行阅读:
	public TextFile(String fileName) {
		this(fileName, "\n");
	}

	// Read a file as a single string:
	// 将文件作为单个字符串读取:
	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}

	// Write a single file in one method call:
	// 在一个方法调用中写入一个文件:
	public static void write(String fileName, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void write(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				for (String item : this)
					out.println(item);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
