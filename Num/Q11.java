import java.util.Scanner;
public class Q11 {
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter "+n+" integer array");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static boolean isEven(int n) {
		if(n<=100) {
		if(n%2==0)
			return true;
		}
		return false;		
	}
	public static void main(String[] args) {
		int[] x = readArray();
		int count = 0;
		for(int i = 0; i<x.length; i++) {
			boolean rs = isEven(x[i]);
			if(rs==true) {
				count++;
			System.out.println(x[i]);
			}
		}
		System.out.println("Even numbers within 100: "+count);
	}
}
