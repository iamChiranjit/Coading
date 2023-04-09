import java.util.Scanner;
public class BiggestElement {
	static int getBiggest(int[] ar) {
		int big = ar[0];
		for(int i = 0; i<ar.length; i++) {
			if(ar[i]>big)
				big = ar[i];
		}
		return big;
	}
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int arr[] = new int[5];
		System.out.println("Enter "+" "+" integer value");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] x = readArray();
		int big = getBiggest(x);
		System.out.println(big);
	}
}
