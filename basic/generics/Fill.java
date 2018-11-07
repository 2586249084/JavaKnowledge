//: generics/Fill.java
// Generalizing the FilledList idea
// 推广FilledList思想
package generics;

import java.util.*;

// Doesn't work with "anything that has an add()." There is
// no "Addable" interface so we are narrowed to using a
// Collection. We cannot generalize using generics in
// this case.
// 不能使用"任何具有add()的东西".没有"可添加"接口,因此我们只能使用集合.
// 在这种情况下，我们不能使用泛型进行一般化

public class Fill {
	
	public static <T> void fill(Collection<T> collection, 
	Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++)
			// Assumes default constructor:
			// 假设默认的构造函数:
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
		// 不能工作。fill()不够通用
		//! Fill.fill(contractQueue, Contract.class, 5);
	}
	
}/* Output:
Contract 0
Contract 1
Contract 2
TitleTransfer 3
TitleTransfer 4
*///:~
