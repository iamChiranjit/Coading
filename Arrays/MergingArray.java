import java.util.Scanner;
public class MergingArray {
	
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" integer value");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static void dispArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		int[] a = readArray();
		int[] b = readArray();
		int[] y = merge(a, b);
		System.out.println("Merged array elements");
		dispArray(y);
		
	}
}
