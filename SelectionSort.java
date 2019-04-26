// In-place algorithn
// O(n^2)
// Unstable sort algorithm

public class SelectionSort {

	public static void main(String[] args) {
		//
		// int[] unsortedArray = { 20, 35, -15, 7, 55, 1, -22 };
		//
		// int index = unsortedArray.length - 1;
		//
		// for (int i = 0; i <= index; i++) {
		// int max = 0;
		// for (int j = 1; j <= index - i; j++) {
		// if (unsortedArray[max] < unsortedArray[j])
		// max = j;
		// }
		// swap(unsortedArray, index - i, max);
		//
		// }
		// for (int i = 0; i < unsortedArray.length; i++) {
		// System.out.println(unsortedArray[i]);
		// }
		// }

		// public static void swap(int[] argArray, int i, int max) {
		// int temp = argArray[max];
		// argArray[max] = argArray[i];
		// argArray[i] = temp;
		// }

		int[] unsortedArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = unsortedArray.length - 1; i > 0; i--) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				if (unsortedArray[max] < unsortedArray[j])
					max = j;
			}
			swap(unsortedArray, i, max);
		}
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
	}

	public static void swap(int[] argArray, int i, int max) {
		int temp = argArray[max];
		argArray[max] = argArray[i];
		argArray[i] = temp;
	}
}
