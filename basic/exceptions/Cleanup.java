package exceptions;
//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.
// 保证对资源的正确清理

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("StormyInning.java");
			try {
				String s;
				//int i = 1;
				StringBuilder sb = new StringBuilder();
				while((s = in.getLine()) != null)
					sb.append(s); // Perform line-by-line processing here... 在这里执行逐行处理...
				System.out.println(sb.toString());
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
