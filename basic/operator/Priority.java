package operator;
//: operator/Priority.java

/** Section two:
 * Operator's priority ��������ȼ�
 * @author Mrzhang
 */
public class Priority {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z; // (1)
		int b = x + (y - 2) / (2 + z); // (2) 
		System.out.print("a = " + a + "\nb = " + b);
	}
}
