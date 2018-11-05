//: generics/DynamicProxyMixin.java
package generics;

import java.lang.reflect.*;
import java.util.*;
import util.*;
import static util.Tuple.*;

class MixinProxy implements InvocationHandler {
	
	Map<String, Object> delegatesByMethod;
	
	@SuppressWarnings("unchecked")
	public MixinProxy(TwoTuple<Object, Class<?>>... pairs) {
		delegatesByMethod = new HashMap<String, Object>();
		for (TwoTuple<Object, Class<?>> pair : pairs) {
			for (Method method : pair.second.getMethods()) {
				String methodName = method.getName();
				// The first interface in the map
				// implements the method.
				// 映射中的第一个接口实现了该方法.
				if (!delegatesByMethod.containsKey(methodName))
					delegatesByMethod.put(methodName, pair.first);
			}
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		Object delagate = delegatesByMethod.get(methodName);
		return method.invoke(delagate, args);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object newInstance(TwoTuple... pairs) {
		Class[] interfaces = new Class[pairs.length];
		for (int i = 0; i < pairs.length; i++) {
			interfaces[i] = (Class)pairs[i].second;
		}
		ClassLoader cl = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
	}
	
}

public class DynamicProxyMixin {

	public static void main(String[] args) {
		Object mixin = MixinProxy.newInstance(
		  tuple(new BasicImp(), Basic.class), 
		  tuple(new TimeStampedImp(), TimeStamped.class), 
		  tuple(new SerialNumberedImp(), SerialNumbered.class));
		Basic basic = (Basic)mixin;
		TimeStamped timeStamp = (TimeStamped) mixin;
		SerialNumbered serialNumber = (SerialNumbered) mixin;
		basic.set("Hello");
		System.out.println(basic.get());
		System.out.println(timeStamp.getStamp());
		System.out.println(serialNumber.getSerialNumber());
	}

}/* Output:
Hello
1541405903332
1
*///:~
