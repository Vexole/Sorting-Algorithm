// Variation of insertion sort
// In-place algorithm
// O(n^2)
// Unstable sort algorithm

public class ShellSort {

	public static void main(String[] args) {
		int[] unsortedArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int gap = unsortedArray.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < unsortedArray.length; i++) {
				int newElement = unsortedArray[i];

				int j = i;

				while (j >= gap && unsortedArray[j - gap] > newElement) {
					unsortedArray[j] = unsortedArray[j - gap];
					j -= gap;
				}
				unsortedArray[j] = newElement;
			}
		}
		System.out.println("ok");
	}
}
