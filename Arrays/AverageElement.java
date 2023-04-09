import java.util.Scanner;
public class AverageElement {
	static double getAvg(int[] ar) {
		double sum = 0;
		for(int i = 0; i<ar.length; i++) {
			sum = sum + ar[i];
		}
		double avg = sum/ar.length;
		return avg;
	}
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" integer value");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] x = readArray();
		System.out.println(getAvg(x));
	}
}
