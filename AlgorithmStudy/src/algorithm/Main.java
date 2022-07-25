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
		int[] heapArray = {3, 4, 9, 5, 3, 6, 8, 7};
		
		sort.makeHeap(heapArray.length, heapArray);
		
		sort.setHeapSort(heapArray.length, heapArray);
		
		for (int i : heapArray) {
			System.out.print(i);
		}
		System.out.println("");
		
		int count = 5;
		int[] countingArray = {
				1, 3, 2, 4, 3, 2, 5, 3, 1, 2, 
				3, 4, 4, 3, 5, 1, 2, 3, 5, 2, 
				3, 1, 4, 3, 5, 1, 2, 1, 1, 1
			};
		sort.countingSort(count, countingArray);
	}

}
