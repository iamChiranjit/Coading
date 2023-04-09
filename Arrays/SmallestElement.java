import java.util.Scanner;
public class SmallestElement {
	static int getSmallest(int[] ar) {
		int sm = ar[0];
		for(int i = 0; i<ar.length; i++) {
			if(ar[i]<sm)
				sm = ar[i];
		}
		return sm;
	}
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter"+" "+"integer value");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] x = readArray();
		System.out.println(getSmallest(x));
	}
}
