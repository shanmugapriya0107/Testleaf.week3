package week3.day2.classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> mentors = new HashMap<Integer, String>();
		mentors.put(101, "Priya");
		mentors.put(102, "Pranitha");
		mentors.put(103, "Vani");
		mentors.put(104, "Yamuna");
		mentors.put(105, "Amudha");
		mentors.put(106, "Bindu");
		mentors.put(107, "Sushu");
		
		System.out.println(mentors.size());
		
		Set<Entry<Integer, String>> entrySet = mentors.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey()+" - ");
			System.out.println(entry.getValue());
			
		}
		
		

	}

}
