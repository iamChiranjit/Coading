import java.util.Scanner;
import java.util.Arrays;
public class ZigzagOrder {
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" integer array");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static void dispArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static int[] isZigzag(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i = 0, j = 0;
		while(i<a.length && i<b.length) {
			c[j++] = a[i];
			c[j++] = b[i++];
			
		}
		while(i<a.length) {
			c[j++] = a[i++];
		}
		while(i<b.length) {
			c[j++] = b[i++];
		}
		return c;
	}
	public static void main(String[] args) {
		int[] x1 = readArray();
		int[] x2 = readArray();
		int[] y = isZigzag(x1, x2);
		System.out.println(Arrays.toString(y));
//		dispArray(y);
	}
}
