package week3.day2.assignments;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindNumberOfOccurances_Using_Map {

	public static void main(String[] args) {
		int[] data = {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < data.length; i++) {
			if(!map.containsKey(data[i]))
			{
				map.put(data[i], 1);
			}
			else
			{
				Integer integer = map.get(data[i]);
				map.put(data[i], integer+1);
			}
		}
		System.out.println(map);

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + " " + "-->" +" "+ entry.getValue() +" " + "times" +",");

		}


	}


}

