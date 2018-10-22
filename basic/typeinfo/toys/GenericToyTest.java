package typeinfo.toys;
//: typeinfo/toys/GenericToyTest.java
// Testing class Class.

public class GenericToyTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Class<FancyToy> ftClass = FancyToy.class;
		
		// Produces exact type:
		// 生产的具体类型:
		FancyToy tancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		
		// This won't compile:
		// 这不会编译:
		//! Class<Toy> up2 = ftClass.getSuperclass();
		
		// Only produces Object:
		// 只有生产对象:
		Object object = up.getSuperclass();
	}

} ///:~
