package access;

import java.util.ArrayList;

//: access/SingleImport.java

public class SingleImport {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new java.util.ArrayList();
		System.out.println(list.toString());
	}
}
