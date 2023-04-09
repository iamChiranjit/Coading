import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		System.out.println("Enter "+n+" integer value");
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int sum = 0;
		for(int j = 0; j<ar.length; j++) {
			sum = sum + ar[j];
		}
		System.out.println(sum);
	}
}
