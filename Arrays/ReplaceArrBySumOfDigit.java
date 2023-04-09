import java.util.Scanner;
public class ReplaceArrBySumOfDigit {
	
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter "+n+" integer value");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static int[] replaceArr(int[] numbers) {
		for(int i = 0; i<numbers.length; i++) {
			int sum = 0, num = numbers[i];
			do {
				int r = num%10;
				sum = sum+r;
				num = num/10;
			}while(num!=0);
			numbers[i] = sum;
		}
		return numbers;
	}
	static void dispArr(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		int[] x = readArray();
//		System.out.println("before replace");
		dispArr(x);
		
		int[] y = replaceArr(x);
//		System.out.println("after replace");
		dispArr(y);
	}
}
