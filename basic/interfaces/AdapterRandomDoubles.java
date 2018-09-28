package interfaces;
//: interfaces/AdapterRandomDoubles.java
// Creating an adapter with inheritance.
// 使用继承创建适配器

import java.nio.*;
import java.util.*;

public class AdapterRandomDoubles extends RandomDoubles implements Readable {
	
	private int count;
	
	public AdapterRandomDoubles(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) {
		if(count-- == 0) 
			return -1;
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(new AdapterRandomDoubles(7));
		while(s.hasNextDouble())
			System.out.print(s.nextDouble() + " ");
	}
}
