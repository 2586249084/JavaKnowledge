package exceptions;
//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.
// 保证对资源的正确清理

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("E:\\EclipseProject\\JavaKnowledge\\basic\\exceptions\\Cleanup.java");
			try {
				String s;
				//int i = 1;
				while((s = in.getLine()) != null)
					 System.out.println(s);// Perform line-by-line processing here... 在这里执行逐行处理...
			} catch(Exception exception) {
				System.out.println("Caught Exception in main");
				exception.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch(Exception exception) {
			System.out.println("InputFile constructor failed");
		}
	}

}
