package initialization;
//: initialization/OverloadingVarargs2
// {CompliTimeError} (Won't compile)

public class OverloadingVarargs2 {
	
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	
	static void f( Character... args) {
		System.out.println("seconed");
	}
	
	public static void main(String[] args) {
		f(new Character[] {'a', 'b'});
		f(1, 'a');
		f();
	}
}
