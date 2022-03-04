package Assignment;

public class Array {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4, 3, 2, 4, 5, 3, 6, 8, 3 };
		int count = 0;
		int n = 3;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				count++;

			}
		}
		System.out.println(count + " No.of times 3 is repeated");
		int c = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i] == arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				System.out.println(arr[i]);
			}
		}
	}
}
