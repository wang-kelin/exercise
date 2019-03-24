package testSort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arrs = { 12, 4, 5, 8, 1, 89, 9 };

		System.out.println("排序前： ");

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}

		bubbleSort(arrs);

		System.out.println();
		System.out.println("排序后： ");

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}

	/**
	 * 冒泡排序：比较两个相邻的元素，将值大的元素交换至右端，重复步骤，直至全部排序完成。
	 * 
	 * @param arrs
	 */
	private static void bubbleSort(int[] arrs) {

		for (int i = 1; i <= arrs.length - 1; i++) { // 外层循环控制排序趟数

			for (int j = 1; j <= arrs.length - i; j++) { // 内层循环控制每趟需要排序的次数

				if (arrs[j - 1] > arrs[j]) {
					int temp = arrs[j - 1];
					arrs[j - 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
	}
}
