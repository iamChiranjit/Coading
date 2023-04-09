import java.util.Scanner;
public class ReverseArray {
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
	static void dispArr(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	static int[] reverseArr(int[] ar) {
		int[] ar2 = new int[ar.length] ;
		for(int i = 0; i<ar.length; i++) {
			ar2[i] = ar[ar.length-i-1];
		}
		return ar2;
	}
	public static void main(String[] args) {
		int[] x = readArray();
		int[] y = reverseArr(x);
//		dispArr(x);
		System.out.println("Reversing");
		dispArr(y);
	}
}
