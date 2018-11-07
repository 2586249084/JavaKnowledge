//: generics/Fill.java
// Generalizing the FilledList idea
// �ƹ�FilledList˼��
package generics;

import java.util.*;

// Doesn't work with "anything that has an add()." There is
// no "Addable" interface so we are narrowed to using a
// Collection. We cannot generalize using generics in
// this case.
// ����ʹ��"�κξ���add()�Ķ���".û��"�����"�ӿ�,�������ֻ��ʹ�ü���.
// ����������£����ǲ���ʹ�÷��ͽ���һ�㻯

public class Fill {
	
	public static <T> void fill(Collection<T> collection, 
	Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++)
			// Assumes default constructor:
			// ����Ĭ�ϵĹ��캯��:
			try {
				collection.add(classToken.newInstance());
			} catch (Exception exception) {
				throw new RuntimeException();
			}
	}

}

class Contract {
	
	private static long counter = 0;
	
	private final long id = counter++;
	
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
	
}

class TitleTransfer extends Contract { }

class FillTest {
	
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for (Contract contract : contracts)
			System.out.println(contract);
		@SuppressWarnings("unused")
		SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();
		// Won't work. fill() is not generic enough:
		// ���ܹ�����fill()����ͨ��
		//! Fill.fill(contractQueue, Contract.class, 5);
	}
	
}/* Output:
Contract 0
Contract 1
Contract 2
TitleTransfer 3
TitleTransfer 4
*///:~
