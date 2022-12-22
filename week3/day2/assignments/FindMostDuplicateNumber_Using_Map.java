package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicateNumber_Using_Map {

	public static void main(String[] args) {
		String s = "abbabab";
		char[] charArray = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(!map.containsKey(charArray[i]))
			{
				map.put(charArray[i], 1);
			}
			else
			{
				int a = map.get(charArray[i]);
				map.put(charArray[i], a+1);
			}
		}
		System.out.println(map);
		int c =0;
		Character res=' ';
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>c)
			{
				res = entry.getKey();
				c = entry.getValue();
			}


		}
		System.out.println(res);

	}

}
