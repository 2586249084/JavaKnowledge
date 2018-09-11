package control;
//: control/VowelsAndConsonants.java

import java.util.Random;
import static commentUtil.Print.*;

/**
 * VowelsAndConsonants
 * @author Mrzhang
 */
public class VowelsAndConsonants {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for(int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			print((char)c + ", " + c + ": ");
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					println("vowel");
					break;
				case 'y':
				case 'w':
					println("Sometimes a vowel");
					break;
				default:
					println("consonant");
			}
		}
	}
}
