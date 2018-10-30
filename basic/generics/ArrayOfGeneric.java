package generics;
//: generics/ArrayOfGeneric.java

public class ArrayOfGeneric {
	
	static final int SIZE = 100;
	
	static Generic<Integer>[] gia;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Compiles; produces ClassCastException:
		// 编译;产生ClassCastException:
		//! gia = (Generic<Integer>[])new Object[SIZE];
		
		// Runtime type is the raw (erased) type:
		// 运行时类型是原始(已删除)类型:
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		
		// Compile-time error:
		// 编译时错误:
		//! gia[1] = new Object();
		
		// Discovers type mismatch at compile time:
		// 在编译时发现类型不匹配:
		//! gia[2] = new Generic<Double>();
	}

}/* Output:
Generic[]
*///:~
