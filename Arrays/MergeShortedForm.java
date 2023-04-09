import java.util.Arrays;
import java.util.Scanner;

public class MergeShortedForm {
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
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
			System.out.print(arr[i] + " ");
		}
	}
	static int[] shortedForm(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int[] c = new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i<a.length) {
			c[k++] = b[j++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		return c;
	}
	public static void main(String[] args) {
		int a[] = readArray();
		int b[] = readArray();
		int rs[] = shortedForm(a, b);
//		dispArray(rs);
		System.out.println(Arrays.toString(rs));
	}
}
