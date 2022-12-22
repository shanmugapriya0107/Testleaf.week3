package week3.day2.classwork;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount_Using_Map {

	public static void main(String[] args) {
		String text = "amazon development center";
		char[] charArray = text.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i]))
			{
				Integer res = map.get(charArray[i]);
				map.put(charArray[i], res+1);				
			}
			else
			{
				map.put(charArray[i], 1);
			}
						
		}
		
			System.out.println(map);
	}

}
