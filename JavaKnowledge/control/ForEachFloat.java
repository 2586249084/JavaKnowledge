package control;
//: control/ForEachFloat.java

import java.util.Random;

/**
 * ForEachFloat For each”Ô∑®
 * @author Mrzhang
 */
public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random(47);
		float f[] = new float[10];
		for (int i = 0; i < f.length; i ++) {
			f[i] = rand.nextFloat();
		}
		for (float x : f) {
			System.out.println(x);
		}
	}
}
