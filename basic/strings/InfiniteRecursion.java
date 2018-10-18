package strings;
//: strings/InfiniteRecursion.java
// Accidental recursion.
// 偶然的递归.

import java.util.*;

public class InfiniteRecursion {
	
	// 再调用这个方法时，返回的是一个字符串，然而this不是字符串，
	// 所以编译器尝试把this转换成字符串，转换方法正是调用this上的toString方法，
	// 所以在这就会发生递归调用，程序报错(StackOverflowError)
	public String toString() {
		return " InfiniteRecursion address : " + this +"\n";
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}

} ///:~
