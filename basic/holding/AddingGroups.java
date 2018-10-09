package holding;
//: holding/AddingGroups.java
// Adding groups of elements to Collection objects.
// ��Collection���������Ԫ����

import java.util.*;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInt = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInt));
		
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		// �����ٶ�Ҫ��ö࣬�����㲻�������ַ�ʽ����һ������
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInt);
		
		// Produces a list "backed by" an array:
		// ����һ��"��"����֧�ֵ��б�
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element:�޸�һ��Ԫ��
		//! list.add(21); // Runtime error because the 
					  // underlying array cannot be resized.
					  // ����ʱ������Ϊ�ײ����鲻�ܱ�����
		
		// Show the collection:
		// չʾ����:
		for(Integer i : collection)
			System.out.print(i + " ");
		
		System.out.println();
		
		// Show the list:
		// չʾ�б�:
		for(Integer i : list)
			System.out.print(i + " ");
	}
}/*Output:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 6 7 8 9 10 
16 99 18 19 20 
*///:~
