// Performance degrades quickly as number of elements in the array increases
// Stable sort algorithm
// In-place algorithm
// O(n^2)

public class BubbleSort {

	public static void main(String[] args) {

		int[] unsortedArray = { 20, 35, -15, 7, 55, 1, -22 };
		int index = unsortedArray.length - 1;
		// for (int i = index - 1; i > 0; i--) {
		// for (int j = 0; j < i; j++) {
		// if (unsortedArray[j + 1] < unsortedArray[j]) {
		// swap(unsortedArray, j, j + 1);
		// }
		// }
		// index--;
		// }

		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index - i; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					swap(unsortedArray, j, j + 1);
				}
			}
		}
		System.out.println("");
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j)
			return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
