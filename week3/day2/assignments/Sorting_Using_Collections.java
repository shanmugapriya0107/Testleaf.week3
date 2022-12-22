package week3.day2.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Using_Collections {
	public static void main(String[] args) {
		String[] text = {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		List<String> li = new ArrayList<String>();
		for (int i = 0; i < text.length; i++) {
			li.add(text[i]);

		}
		Collections.sort(li);
		for (int i = li.size()-1; i >= 0 ; i--) {
			System.out.print(li.get(i)+ " ");

		}

	}


}


