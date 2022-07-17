package algorithm;

public class Main {

	public static void main(String[] args) {
		Sort sort = new Sort();
		//sort.selectionSort();
		
		int num = 10;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		sort.quickSort(array, 0, num-1);
		for (int i : array) {
			System.out.print(i);
		}
	}

}
