package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers {

	/**
	 * 프로그래머스(해시) - 전화번호 목록<br>
	 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
	 */
	public boolean solution1(String[] phone_book) {

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

	public int solution2(int[] nums) {
		/**
		 * 프로그래머스(해시) - 포켓몬<br>
		 * https://school.programmers.co.kr/learn/courses/30/lessons/1845 아직 못풀음???
		 */
		// 중복 제거 후
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], true);
			}
		}

		return 0;
	}

	public int[] solution3(int[] array, int[][] commands) {
		
		/**
		 * 프로그래머스(정렬) - K번째수<br>
		 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
		 */
		
		int start = 0;
		int end = 0;
		int index = 0;
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			start = commands[i][0];
			end = commands[i][1];
			index = commands[i][2];
			
			int[] copy = Arrays.copyOfRange(array, start-1, end);
			
			Arrays.sort(copy);
			
			answer[i] = copy[index-1];
		}
		return answer;
	}
	
	public String solution4(int[] numbers) {
		/**
		 * 다시풀기
		 * 프로그래머스(정렬) - 가장 큰 수<br>
		 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
		 */
		String answer = "";
		Integer[] numbersInt = new Integer[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			numbersInt[i] = numbers[i];
		}
		
		Arrays.sort(numbersInt, Collections.reverseOrder());
		
		for (int i : numbersInt) {
			answer += i;
		}
		
		return answer;
	}
}
