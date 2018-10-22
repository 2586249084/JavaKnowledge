package typeinfo;
//: typeinfo/BoundedClassReferences.java

public class BoundedClassReferences {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		// Or anything else derived from Number.
		// 或者任何从Number衍生出来的东西.
	}

} ///:~
