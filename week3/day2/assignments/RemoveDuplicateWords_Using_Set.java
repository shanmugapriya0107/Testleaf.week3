package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords_Using_Set {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String [] split_word = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < split_word.length; i++) {
			if(!set.add(split_word[i]))
				set.add(split_word[i]);
		}
		System.out.println(set);
		Object[] array = set.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");



		}
	}
}