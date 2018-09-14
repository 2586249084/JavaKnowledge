package initialization;
//: initialization/TerminationCondition.java

/**
 * TerminationCondition
 * ʹ��finalize()�����һ��δ����ȷ����Ķ���
 * @author Mrzhang
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// Proper cleanup �ʵ�������
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}

class Book{
	
	boolean checkedOut = false;
	
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	
	protected void finalize() {
		if(checkedOut) {
			System.out.println("Error: checked out");
			// Normally, you'll also do this: ͨ������Ҳ��������
			// super.finalize(); // Call the base-class version ���û���汾
		}
	}
}
