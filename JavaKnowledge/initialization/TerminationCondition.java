package initialization;
//: initialization/TerminationCondition.java

/**
 * TerminationCondition
 * 使用finalize()来检测一个未被正确清理的对象
 * @author Mrzhang
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// Proper cleanup 适当的清理
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
			// Normally, you'll also do this: 通常，你也会这样做
			// super.finalize(); // Call the base-class version 调用基类版本
		}
	}
}
