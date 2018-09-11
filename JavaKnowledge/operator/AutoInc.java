package operator;
//: operator/AutoInc.java

import static commentUtil.Print.*;

/** 
 * AutoInc 自动递增和递减
 * @author Mrzhang
 * ++、--
 * 前缀递增和递减:先执行运算，再生成值
 * 后缀递增和递减:先生成值，在进行运算
 */

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		println("i : " + i);
		println("++i : " + ++i);
		println("i++ : " + i++);
		println("i : " + i);
		println("--i : " + --i);
		println("i-- : " + i--);
		println("i : " + i);
	}
}
