package week3.day2.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest_Using_SetOrList {
	public static void main(String[] args) {
		int[] data = {19,23,4,5,6,7,1};

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);

		}
		List<Integer> list = new ArrayList<Integer>(set);	
		Collections.sort(list);
		System.out.println(list);
		int num = list.get(list.size()-2); //To get the last second element
		System.out.println("The second largest element in the list is " +num);
		}
	}










