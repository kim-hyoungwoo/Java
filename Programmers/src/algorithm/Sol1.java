package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Sol1 {
	
	public boolean solution(String[] phone_book) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], 1);
		}
		
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				if (map.containsKey(phone_book[i].substring(0, j))) {
					return false;
				}
			}
		}
		return true;
	}
	
}
