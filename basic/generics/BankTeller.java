package generics;
//: generics/BankTeller.java
// A very simple bank teller simulation.
// 一个非常简单的银行出纳员模拟.

import java.util.*;
import util.*;

class Customer {
	
	private static long counter = 1;
	
	private final long id = counter++;
	
	private Customer() { }
	
	public String toString() { return "Customer + " + id; }
	
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {

			@Override
			public Customer next() {
				return new Customer();
			}
			
		};
	}
	
}

class Teller {
	
	private static long counter = 1;
	
	private final long id = counter++;
	
	private Teller() { }
	
	public String toString() { return "Teller" + id; }
	
	public static Generator<Teller> generator() {
		return new Generator<Teller>() {

			@Override
			public Teller next() {
				return new Teller();
			}
			
		};
	}
	
}

public class BankTeller {
	
	public static void serve(Teller teller, Customer customer) {
		System.out.println(teller + " serves " + customer);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for (Customer customer : line)
			serve(tellers.get(rand.nextInt(tellers.size())), customer);
	}

}/* Output:
Teller3 serves Customer + 1
Teller2 serves Customer + 2
Teller3 serves Customer + 3
Teller1 serves Customer + 4
Teller1 serves Customer + 5
Teller3 serves Customer + 6
Teller1 serves Customer + 7
Teller2 serves Customer + 8
Teller3 serves Customer + 9
Teller3 serves Customer + 10
Teller2 serves Customer + 11
Teller4 serves Customer + 12
Teller2 serves Customer + 13
Teller1 serves Customer + 14
Teller1 serves Customer + 15
*///:~
