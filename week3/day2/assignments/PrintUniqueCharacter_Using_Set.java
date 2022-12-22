package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter_Using_Set {

	public static void main(String[] args) {
		String text = "Shanmugapriya";
		char[] charArray = text.toCharArray();

		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(set.add(charArray[i]))
			{
				System.out.print(charArray[i]);
			}

		}
	}
}
