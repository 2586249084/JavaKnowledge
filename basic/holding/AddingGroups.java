package holding;
//: holding/AddingGroups.java
// Adding groups of elements to Collection objects.
// 在Collection对象中添加元素组

import java.util.*;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInt = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInt));
		
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		// 运行速度要快得多，但是你不能用这种方式构造一个集合
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInt);
		
		// Produces a list "backed by" an array:
		// 生成一个"由"数组支持的列表
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element:修改一个元素
		//! list.add(21); // Runtime error because the 
					  // underlying array cannot be resized.
					  // 运行时错误，因为底层数组不能被调整
		
		// Show the collection:
		// 展示集合:
		for(Integer i : collection)
			System.out.print(i + " ");
		
		System.out.println();
		
		// Show the list:
		// 展示列表:
		for(Integer i : list)
			System.out.print(i + " ");
	}
}/*Output:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 6 7 8 9 10 
16 99 18 19 20 
*///:~
