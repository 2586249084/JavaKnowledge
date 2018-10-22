package typeinfo;
//: typeinfo/WildcardClassReferences.java

public class WildcardClassReferences {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Class<?> intClass = int.class;
		intClass = double.class;
	}

} ///:~
