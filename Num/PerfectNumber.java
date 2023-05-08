import java.util.Scanner;

public class PerfectNumber {
	static boolean perfectNumber(int n) {
		int sum = 0;
		for(int i = 1; i<n; i++) {
			if(n%i==0)
				sum = sum+i;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean a = perfectNumber(n);
		if(a==true)
			System.out.println(n + " is Perfct Number");
		else
			System.out.println(n + " is not Perfect Number");
//		System.out.println(perfectNumber(n));
	}
	
}
