package strings;
//: strings/InfiniteRecursion.java
// Accidental recursion.
// żȻ�ĵݹ�.

import java.util.*;

public class InfiniteRecursion {
	
	// �ٵ����������ʱ�����ص���һ���ַ�����Ȼ��this�����ַ�����
	// ���Ա��������԰�thisת�����ַ�����ת���������ǵ���this�ϵ�toString������
	// ��������ͻᷢ���ݹ���ã����򱨴�(StackOverflowError)
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
