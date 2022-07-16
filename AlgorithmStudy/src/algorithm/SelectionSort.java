package algorithm;

public class SelectionSort {
	
	public void selectionSort() {
		/**
		 * 정렬 알고리즘 개요 및 선택 정렬 (Selection Sort)<br>
		 * https://youtu.be/8ZiSzteFRYc
		 * 이게 잘 올라가는지 확인 이것도 
		 */
		int min = 0;
		int index = 0;
		int temp = 0;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for (int i = 0; i < array.length; i++) {
			// 항상 최소값을 선택해야하기 때문에 큰값을 넣어준다. 
			min = 9999;
			for (int j = i; j < array.length; j++) {
				// 현재 탐색하고있는것이 대상보다 작다면 min 변경 및 해당 인덱스 저장 
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			// 원소 스와핑 진행
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i : array) {
			System.out.print(i);
		}
		
	}
	
}
