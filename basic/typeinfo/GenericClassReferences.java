package typeinfo;
//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Class<?> intClass = int.class;
		@SuppressWarnings("unused")
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class; // Same thing 相同的
		intClass = double.class;
		//! genericIntClass = double.class; // Illegal 违法的
	}

} ///:~
