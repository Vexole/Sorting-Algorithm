
// O(n)
// Not in-place algorithm
// Only positive numbers and range must be small

public class CountingSort {
	public static void main(String[] args) {
		int[] unsortedArray = { 1, 5, 3, 1, 2, 7, 7, 5 };

		// int max = Arrays.stream(unsortedArray).boxed().mapToInt(item ->
		// item).max().getAsInt();
		//
		// int[] countingNumbers = new int[max + 1];
		// Arrays.fill(countingNumbers, 0);
		//
		// Arrays.stream(unsortedArray).boxed().forEach(item -> {
		// countingNumbers[item] += 1;
		// });
		//
		// int[] sortedNumbers = new int[unsortedArray.length];
		// Arrays.fill(sortedNumbers, 0);
		//
		// Arrays.stream(unsortedArray).forEach(item -> {
		// System.out.println(item);
		// sortedNumbers[countingNumbers[item]-1] = item;
		// countingNumbers[item] -= 1;
		// });

		// for (int i = 0; i < sortedNumbers.length; i++) {
		// System.out.println(sortedNumbers[i]);
		// }

		countingSort(unsortedArray, 1, 7);
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}

	}

	public static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int[max - min + 1];

		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}

		int j = 0;

		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}
}
