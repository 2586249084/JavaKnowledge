package typeinfo;
//: typeinfo/HiddenImplementation.java
// Sneaking around package access.
// �ƹ�������.

import java.lang.reflect.*;
import typeinfo.interfaces.*;
import typeinfo.packageaccess.*;

public class HiddenImplementation {

	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		
		// Compile error : cannot find symbol 'C':
		// �������:�޷��ҵ�����'C'
		/*if (a instanceof C) {
			C c = (C)a;
			c.g();
		}*/
		
		// Oops! Reflection still allows us to call g():
		// Ŷ!������Ȼ�������ǵ���g()
		callHiddenMethod(a, "g");
		
		// And even Methods that are less accessible!
		// �����ǲ�̫����ʹ�õķ���!
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}
	
	static void callHiddenMethod(Object object, String methodName) throws Exception {
		Method method = object.getClass().getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(object);
	}

}/*Output:
public C.f()
typeinfo.packageaccess.C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
