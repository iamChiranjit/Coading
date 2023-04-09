import java.util.Scanner;
public class FrequencyOfElement {
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter "+n+" integer array");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static void printFrequency(int[] arr) {
		boolean[] rs = new boolean[arr.length];
		for(int i = 0; i<arr.length; i++) {
			if(rs[i]==false) {
				int count = 1;
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						rs[j]=true;
					}
				}
				System.out.println(arr[i]+"-->"+count);
			}
		}
	}
	public static void main(String[] args) {
		int[] a = readArray();
		printFrequency(a);
	}
}
