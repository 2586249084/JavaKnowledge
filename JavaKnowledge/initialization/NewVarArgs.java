package initialization;
//: initialization/NewVarArgs.java
//Using array syntax to create variable argument lists.
//使用数组语法创建变量参数列表

public class NewVarArgs {
	
	static void printArray(Object...args) {
		for(Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Can take individual elements:可以取单个元素
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 11.11, 3.14F);
		printArray("One", "two", "three");
		printArray(new A(), new A(), new A());
		// Or an array:或者一个数组
		printArray((Object[])new Integer[] {1, 2, 3, 4, 5});
		printArray();// Empty list is OK:空集合也是可以的
	}
}
