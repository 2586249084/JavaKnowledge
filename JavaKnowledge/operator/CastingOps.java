package operator;
//: operator/CastingOps.java

/**
 * CastingOps 类型转换操作符
 * @author Mrzhang
 */
public class CastingOps {
	public static void main(String[] args) {
		int i = 100;
		long lng = (long) i;
		lng = i; // "Widening," so cast not really required.翻译:使扩大；扩展，所以类型转换事实上不是必须的
		long lng2 = (long)200;
		lng2 = 200;
		// A "narrowing conversion" 窄化转换
		i = (int)lng2; // Cast required
		System.out.println(lng);
	}
}
