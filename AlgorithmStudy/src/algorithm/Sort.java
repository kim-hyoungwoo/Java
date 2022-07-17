package algorithm;

public class Sort {
	
	public void selectionSort() {
		/**
		 * 선택 정렬 (Selection Sort)<br>
		 * https://youtu.be/8ZiSzteFRYc
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
	
	public void bubbleSort() {
		/**
		 * 버블 정렬 (Bubble Sort)<br>
		 * https://youtu.be/EZN0Irp2aPs
		 */
		int temp = 0;
		
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for (int i = 0; i < array.length; i++) {
			// 뒤에서 부터 집합의 크기를 감소시키면서 비교해야하므로 
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}
	
	public void insertionSort() {
		/**
		 * 삽입 정렬 (Insertion Sort)<br>
		 * https://youtu.be/16I9Z7bS1iM
		 */
		int temp = 0;
		int j = 0;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(int i = 0; i < array.length-1; i++) {
			j = i;
			while (array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}
}