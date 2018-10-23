package typeinfo;
//: typeinfo/SimpleDynamicProxy.java

import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	
	private Object proxied;
	
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("***** proxy : " + proxy.getClass() + ", method : " + method + ", args : " + args);
		if (args != null)
			for (Object arg : args)
				System.out.println("   " + arg);
		return method.invoke(proxied, args);
	}
	
}

public class SimpleDynamicProxy {
	
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonono");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		
		// Insert a proxy and call again:
		// 插入代理并再次调用:
		Interface proxy = (Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[] { Interface.class }, 
				new DynamicProxyHandler(real));
		consumer(proxy);
	}

}/*Output:
doSomething
somethingElse bonono
***** proxy : class typeinfo.$Proxy0, method : public abstract void 
typeinfo.Interface.doSomething(), args : null
doSomething
***** proxy : class typeinfo.$Proxy0, method : public abstract void 
typeinfo.Interface.somethingElse(java.lang.String), args : [Ljava.lang.Object;@6bc7c054
   bonono
somethingElse bonono
*///:~
