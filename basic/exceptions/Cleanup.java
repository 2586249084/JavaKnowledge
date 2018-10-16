package exceptions;
//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.
// ��֤����Դ����ȷ����

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("StormyInning.java");
			try {
				String s;
				//int i = 1;
				StringBuilder sb = new StringBuilder();
				while((s = in.getLine()) != null)
					sb.append(s); // Perform line-by-line processing here... ������ִ�����д���...
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
