package generics;
//: generics/InstantiateGenericType.java

import static util.Print.*;

class ClassAsFactory<T> {
	
	T x;
	
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception exception) {
			throw new RuntimeException();
		}
	}
	
}

class Employee { }

public class InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = 
		  new ClassAsFactory<Employee>(Employee.class);
		println("ClassAsFactory<Employee> succeeded : " +
		  fe.getClass().getSimpleName());
		try {
			ClassAsFactory<Integer> fi = 
		      new ClassAsFactory<Integer>(Integer.class);
			println("ClassAsFactory<Employee> succeeded : " +
		      fi.getClass().getSimpleName());
		} catch (Exception exception) {
			println("ClassAsFactory<Integer> failed");
		}
	}

}/* Output:
ClassAsFactory<Employee> succeeded : ClassAsFactory
ClassAsFactory<Integer> failed
*///:~
