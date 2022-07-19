package algorithm;

public class Main {

	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.selectionSort();
		
		int num = 10;
		int[] quickArray = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		System.out.println("");
		sort.quickSort(quickArray, 0, num-1);
		for (int i : quickArray) {
			System.out.print(i);
		}
		System.out.println("");
		int[] mergeArray = {7, 6, 5, 8, 3, 5, 9, 1};
		sort.mergeSort(mergeArray, 0, mergeArray.length-1);
		for (int i : mergeArray) {
			System.out.print(i);
		}
		System.out.println("");
		int heapNum = 9;
		int[] heapArray = {7, 6, 5, 8, 3, 5, 9, 1, 6};
		
		sort.heapSort(heapArray.length, heapArray);
		
		for (int i : heapArray) {
			System.out.println(i);
		}
	}

}
