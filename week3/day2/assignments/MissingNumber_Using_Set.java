package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber_Using_Set {

	public static void main(String[] args) {
		int[] data = {1,3,4,2,6,8,5,9,10};

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);		
		}
		System.out.println(set);
		for (int i = 0; i < data.length-1; i++) {
			if(!set.contains(data[i]+1))
			{
				System.out.println(data[i]+1);


			}

		}

	}

}
