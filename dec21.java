
//package dec21;

public class dec21 {

	public static void main(String[] args) {

		int[] arr = { 55, 66, 67, 68, 12, 33, 44, 45, 47 };

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				System.out.println("min no :" + arr[mid + 1] + " index no :" + (mid + 1));

			}

			if (mid > start && arr[mid] < arr[mid - 1]) {
				System.out.println("Min no :" + arr[mid] + "  Index no :" + mid);

			}

			if (arr[start] < arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

	}

}
