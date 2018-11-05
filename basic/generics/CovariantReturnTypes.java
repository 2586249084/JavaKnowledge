package generics;
//: generics/CovariantReturntypes.java

class Base {
}

class Derived extends Base {
}

interface OrdinaryGetter {
	Base get();
}

interface DerivedGetter extends OrdinaryGetter {
	// Return type of overridden method is allowed to vary:
	// 被覆盖方法的返回类型允许改变:
	Derived get();
}

public class CovariantReturnTypes {

	@SuppressWarnings("unused")
	void test(DerivedGetter mDerivedGetter) {
		Derived d = mDerivedGetter.get();
	}

}
