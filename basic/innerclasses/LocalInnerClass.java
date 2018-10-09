package innerclasses;
//: innerclasses/LocalInnerClass.java
// Holds a sequence of Objects.
// ����һϵ�ж���

import static util.Print.*;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;
	
	Counter getCounter(final String name) {
		// A local inner class:һ�������ڲ���
		class LocalCounter implements Counter {
			public LocalCounter() {
				// Local inner class can have a constructor
				// �����ڲ��������һ�����캯��
				println("LocalCounter()");
			}
			
			public int next() {
				print(name); // Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}
	
	// The same thing an anonymous inner class:
	// ͬ���Ķ�����һ���������ڲ���:
	Counter getCounter2(final String name) {
		return new Counter() {
			// Anonymous inner class cannot have a named
			// constructor, only an instance initializer:
			//�����ڲ��಻����һ�������Ĺ��캯����ֻ��һ��ʵ����ʼ����:
			{
				println("Counter()");
			}
			
			public int next() {
				print(name);// Access local final
				return count ++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner"),
				c2 = lic.getCounter2("Anonymous inner");
		for(int i = 0; i < 5; i++)
			println(c1.next());
		for(int i = 0; i < 5; i++)
			println(c2.next());
	}
}/*Output:
LocalCounter()
Counter()
Local inner 0
Local inner 1
Local inner 2
Local inner 3
Local inner 4
Anonymous inner 5
Anonymous inner 6
Anonymous inner 7
Anonymous inner 8
Anonymous inner 9
*///:~
