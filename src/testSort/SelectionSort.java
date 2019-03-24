package testSort;

public class SelectionSort {

	public static void main(String[] args){
		int[] arrs = {1,34,67,5,32,8,90};
		
		System.out.println("排序前： ");
		
		for(int arr : arrs){
			System.out.print(arr + " ");
		}
		
		selectionSort(arrs);
		
		System.out.println();
        System.out.println("排序后： ");
		
		for(int arr : arrs){
			System.out.print(arr + " ");
		}
	}
	
	private static void selectionSort(int[] arrs){
		
		for(int i = 1;i <= arrs.length - 1;i ++){
			for(int j = i; j <= arrs.length - 1; j ++){
				if(arrs[j] < arrs[i - 1]){
					int temp = arrs[j];
					arrs[j] = arrs[i -1];
					arrs[i - 1] = temp;
				}
			}
		}
	}
}
