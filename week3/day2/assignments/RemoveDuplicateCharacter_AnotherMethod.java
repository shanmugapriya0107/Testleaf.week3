package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter_AnotherMethod {

	public static void main(String[] args) {
		String text = "PayPal India";
		char[] charArray = text.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);			
		}
		System.out.println(charSet);
		Object[] array = charSet.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

		}

	}
}
