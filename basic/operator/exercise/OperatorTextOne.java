package operator.exercise;
// :operatorText/OperatorTextOne.java

import static util.Print.*;

/**
 * 创建一个包含一个float域的类，并用这个类来展示别名机制
 * @author Mrzhang
 */

class Text{
	float index;
}

public class OperatorTextOne {
	public static void main(String[] args) {
		Text t1 = new Text();
		Text t2 = new Text();
		t1.index = 10;
		t2.index = 20;
		println("1:t1.level = " + t1.index + "\tt2.level = " + t2.index);
		t1.index = t2.index;
		println("2:t1.level = " + t1.index + "\tt2.level = " + t2.index);
		t1.index = 21;
		println("3:t1.level = " + t1.index + "\tt2.level = " + t2.index);
	}
}
