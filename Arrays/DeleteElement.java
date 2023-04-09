import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {
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
	static int[] deleteElement(int[] ar, int in) {
		if(in<0 || in>ar.length) {
			System.out.println("Index not in the range");
			return ar;
		}
		int[] br = new int[ar.length-1];
		for(int i = 0; i<ar.length-1; i++) {
			if(i<in)
				br[i] = ar[i];
			else
				br[i] = ar[i+1];
		}
		return br;
 	}
	public static void main(String[] args) {
		int[] x = readArray();
		int[] rs = deleteElement(x, 2);
		System.out.println(Arrays.toString(rs));
	}
}
