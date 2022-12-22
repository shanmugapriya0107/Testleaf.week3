package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters_Using_Set {

	public static void main(String[] args) {
		String text = "PayPal India";
		char[] charArray = text.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(charSet.add(charArray[i]))
			{
				dupCharSet.add(charArray[i]);
				System.out.print(charArray[i]);

			}

		}

	}
}
