package strings;
//: strings/TheReplacements.java

import java.util.regex.*;
import util.*;
import static util.Print.*;

	/*!   Here's a block of text to use as input to 
	 	   the regular expression matcher. Note that we'll 
	 	   first extract the block of text by looking for 
	 	   the special delimiters, then process the 
	 	   extracted block.    !*/

public class TheReplacements {

	public static void main(String[] args) {
		String s = TextFile.read("TheReplacements.java");
		
		// Match the special commented block of text above:
		// ƥ�����������ע�Ϳ�:
		Matcher mInput = 
				Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
				.matcher(s);
		if (mInput.find())
			s = mInput.group(1); // Captured by parentheses ������
		
		// Replace two or more spaces with a single space:
		// ��һ���ո��滻���������ո�:
		s = s.replaceAll(" {2,}", " ");
		
		// Replace one or more spaces at the beginning of each
		// line with no spaces. Must enable MULTILINE mode:
		// ��ÿ�п�ͷ��һ�������ո��滻Ϊ�޿ո�.�������ö���ģʽ:
		s = s.replaceAll("(?m)^ +", "");
		
		println(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer buffer = new StringBuffer();
		Pattern pattern = Pattern.compile("[aeiou]");
		Matcher matcher = pattern.matcher(s);
		
		// Process the find information as you
		// perform the replacements:
		// ��ִ���滻ʱ���������Ϣ:
		while(matcher.find())
			matcher.appendReplacement(buffer, matcher.group().toUpperCase());
		
		// Put in the remainder of the text:
		// ���ı������ಿ��д��ȥ:
		matcher.appendTail(buffer);
		println(buffer);
	}

}/*Output:
Here's a block of text to use as input to 
	 	 the regular expression matcher. Note that we'll 
	 	 first extract the block of text by looking for 
	 	 the special delimiters, then process the 
	 	 extracted block. 
H(VOWEL1)rE's A blOck Of tExt tO UsE As InpUt tO 
	 	 thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE'll 
	 	 fIrst ExtrAct thE blOck Of tExt by lOOkIng fOr 
	 	 thE spEcIAl dElImItErs, thEn prOcEss thE 
	 	 ExtrActEd blOck. 
*///:~
