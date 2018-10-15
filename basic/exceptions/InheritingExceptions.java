package exceptions;
//: exceptions/InheritingExceptions.class
// Creating your own exceptions.
// �������Լ����쳣

class SimpleException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String error = "Default error";
	
	SimpleException() {
		
	}
	
	SimpleException(String error) {
		this.error = error;
	}
	
	@Override
	public String getLocalizedMessage() {
		return error;
	}
	
}

public class InheritingExceptions {
	
	public void f() throws SimpleException {
		throw new SimpleException("My DIY error");
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException error) {
			System.out.println("Caught it : " + error.getLocalizedMessage());
		}
	}
	
}/*Output:
Caught it : My DIY error
*///:~
