package week3.day2.classwork;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValues_Using_Set {

	public static void main(String[] args) {
		int[] numbers = {2,3,5,2,3,6,7,8,3,8,8,9,11};
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			if(!unique.add(numbers[i]))
			{
				duplicate.add(numbers[i]);
			}
			
		}
		System.out.println(duplicate);

	}

}
