package exceptions;
//: exceptions/CleanIdiom.java
// Each disposable object must be followed by a try-finally
// 每个一次性的对象都必须有一个try-finally

class NeedsCleanup {
	
	private static long counter = 1;
	
	private final long id = counter++;
	
	public void dispose() {
		System.out.println("NeedsCleanup" + id + "disposed");
	}
	
}

@SuppressWarnings("serial")
class ConstructionException extends Exception {}

class NeedsCleanupDouble extends NeedsCleanup {
	
	// Construction can fail:
	// 构建可以失败:
	public NeedsCleanupDouble() throws ConstructionException {}
	
}

public class CleanupIdiom {
	
	public static void main(String[] args) {
		// Section 1: 第一节
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			// ...
		} finally {
			nc1.dispose();
		}
		
		// Section 2: 第二节
		// If construction cannot fail you can group objects:
		// 如果构建不能失败你可以对对象进行分组
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			// ...
		} finally {
			nc3.dispose(); // Reverse order of construction 逆序
			nc2.dispose();
		}
		
		// Section 3: 第三节
		// If construction can fail you must guard each one:
		// 如果构建失败，你必须保护每一个
		try {
			NeedsCleanupDouble nc4 = new NeedsCleanupDouble();
			try {
				NeedsCleanupDouble nc5 = new NeedsCleanupDouble();
				try {
					// ...
				} finally {
					nc5.dispose();
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				nc4.dispose();
			}
		} catch (ConstructionException e) { // nc4 constructor
			System.out.println(e);
		}
	}
	
}/*Output:
NeedsCleanup1disposed
NeedsCleanup3disposed
NeedsCleanup2disposed
NeedsCleanup5disposed
NeedsCleanup4disposed
*///:~
