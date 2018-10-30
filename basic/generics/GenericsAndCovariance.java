package generics;
//: generics/GenericsAndCovariance.java

import java.util.*;

public class GenericsAndCovariance {

	public static void main(String[] args) {
		// Wildcards allow covariance:
		// ͨ�������Э��:
		List<? extends Fruit> flist = new ArrayList<Apple>();
		
		// Compile Error: can't add any type of object:
		// �������:��������κ����͵Ķ���:
		//! flist.add(new Apple());
		//! flist.add(new Fruit());
		//! flist.add(new Object());
		
		// Legal but uninteresting:
		// �Ϸ�����Ȥ��:
		flist.add(null);
		
		// We know that it returns at least Fruit:
		// ����֪�������ٻ᷵��Fruit:
		Fruit f = flist.get(0);
		System.out.println(f);
	}

}/* Output:
null
*///:~
