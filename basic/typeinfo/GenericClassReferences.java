package typeinfo;
//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Class<?> intClass = int.class;
		@SuppressWarnings("unused")
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class; // Same thing ��ͬ��
		intClass = double.class;
		//! genericIntClass = double.class; // Illegal Υ����
	}

} ///:~
