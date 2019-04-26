// In-place algorithm
// O(n^2)
// Stable sort algorithm

public class InsertionSort {
	public static void main(String[] args) {
		int[] unsortedArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int i = 1; i < unsortedArray.length; i++) {
			int newElement = unsortedArray[i];
			int j;
			for (j = i; j > 0 && unsortedArray[j - 1] > newElement; j--) {
				unsortedArray[j] = unsortedArray[j - 1];
			}
			unsortedArray[j] = newElement;
		}
		System.out.println("");
	}
}
