package exceptions;
//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.
// ��֤����Դ����ȷ����

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("E:\\EclipseProject\\JavaKnowledge\\basic\\exceptions\\Cleanup.java");
			try {
				String s;
				//int i = 1;
				while((s = in.getLine()) != null)
					 System.out.println(s);// Perform line-by-line processing here... ������ִ�����д���...
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
