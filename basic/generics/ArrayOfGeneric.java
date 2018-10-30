package generics;
//: generics/ArrayOfGeneric.java

public class ArrayOfGeneric {
	
	static final int SIZE = 100;
	
	static Generic<Integer>[] gia;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Compiles; produces ClassCastException:
		// ����;����ClassCastException:
		//! gia = (Generic<Integer>[])new Object[SIZE];
		
		// Runtime type is the raw (erased) type:
		// ����ʱ������ԭʼ(��ɾ��)����:
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		
		// Compile-time error:
		// ����ʱ����:
		//! gia[1] = new Object();
		
		// Discovers type mismatch at compile time:
		// �ڱ���ʱ�������Ͳ�ƥ��:
		//! gia[2] = new Generic<Double>();
	}

}/* Output:
Generic[]
*///:~
