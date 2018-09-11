package control;
//: control.ListCharacters.java

/**
 * ListCharacters for循环语句的使用
 * @author Mrzhang
 * for语句格式:
 * for (initialization; Boolean-expression; step) {
 * 		statement
 * }
 */
public class ListCharacters {
	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("value : " + (int)c + "\tcharacter : " + c);
			}
		}
		outC((0x8956 & 0x5647));
	}
	
	private static void outC(int c) {
		int d = 0x8000;
		for (int i = 0; i < 16; i++) {
			int out = (c | d) == c ? 1:0;
			System.out.print(out);
			d >>>= 1;
		}
		System.out.println();
	}
}
