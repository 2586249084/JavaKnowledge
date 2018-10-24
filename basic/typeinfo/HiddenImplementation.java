package typeinfo;
//: typeinfo/HiddenImplementation.java
// Sneaking around package access.
// 绕过包访问.

import java.lang.reflect.*;
import typeinfo.interfaces.*;
import typeinfo.packageaccess.*;

public class HiddenImplementation {

	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		
		// Compile error : cannot find symbol 'C':
		// 编译错误:无法找到符号'C'
		/*if (a instanceof C) {
			C c = (C)a;
			c.g();
		}*/
		
		// Oops! Reflection still allows us to call g():
		// 哦!反射仍然允许我们调用g()
		callHiddenMethod(a, "g");
		
		// And even Methods that are less accessible!
		// 甚至是不太容易使用的方法!
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
