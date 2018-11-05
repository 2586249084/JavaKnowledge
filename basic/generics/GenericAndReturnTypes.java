package generics;
//: generics/GenericAndReturnTypes.java

interface GenericGetter<T extends GenericGetter<T>> {
	T get();
}

interface Getter extends GenericGetter<Getter> {
}

public class GenericAndReturnTypes {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	void test(Getter getter) {
		Getter result = getter.get();
		GenericGetter gg = getter.get();
	}
	
} ///:~
