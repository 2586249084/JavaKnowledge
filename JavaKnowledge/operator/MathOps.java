package operator;

import java.util.*;
import static commentUtil.Print.*;

/**
 * MathOps ËãÊõ²Ù×÷·û
 * @author Mrzhang
 * +¡¢-¡¢*¡¢/¡¢%
 */
public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i,j,k;
		j = rand.nextInt(100) + 1;
		println("j : " + j);
		k = rand.nextInt(100) + 1;
		println("k : " + k);
		i = j + k;
		println("j + k : " + i);
		i = j - k;
		println("j - k : " + i);
		i = j / k;
		println("j / k : " + i);
		i = j * k;
		println("j * k : " + i);
		i = j % k;
		println("j % k : " + i);
		j %= k;
		println("j %= k : " + j);
	}
}
