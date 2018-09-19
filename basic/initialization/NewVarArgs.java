package initialization;
//: initialization/NewVarArgs.java
//Using array syntax to create variable argument lists.
//ʹ�������﷨�������������б�

public class NewVarArgs {
	
	static void printArray(Object...args) {
		for(Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Can take individual elements:����ȡ����Ԫ��
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 11.11, 3.14F);
		printArray("One", "two", "three");
		printArray(new A(), new A(), new A());
		// Or an array:����һ������
		printArray((Object[])new Integer[] {1, 2, 3, 4, 5});
		printArray();// Empty list is OK:�ռ���Ҳ�ǿ��Ե�
	}
}
