package week3.day2.classwork;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateString_Using_Set {

	public static void main(String[] args) {
		String text = "google";
		char[] charArray = text.toCharArray();

		Set<Character> unique = new LinkedHashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if(!unique.add(charArray[i]))
			{
				duplicate.add(charArray[i]);
				{
					System.out.print(charArray[i]);
				}

			}

		}

	}
}
