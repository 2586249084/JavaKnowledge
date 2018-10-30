package generics;
//: generics/GenericsAndCovariance.java

import java.util.*;

public class GenericsAndCovariance {

	public static void main(String[] args) {
		// Wildcards allow covariance:
		// 通配符允许协变:
		List<? extends Fruit> flist = new ArrayList<Apple>();
		
		// Compile Error: can't add any type of object:
		// 编译错误:不能添加任何类型的对象:
		//! flist.add(new Apple());
		//! flist.add(new Fruit());
		//! flist.add(new Object());
		
		// Legal but uninteresting:
		// 合法但无趣的:
		flist.add(null);
		
		// We know that it returns at least Fruit:
		// 我们知道它至少会返回Fruit:
		Fruit f = flist.get(0);
		System.out.println(f);
	}

}/* Output:
null
*///:~
