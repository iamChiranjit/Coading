import java.util.Scanner;
public class CountPrimeWithinN {
	static boolean isPrime(int n) {
		for(int i = 2; i<=n/2; i++)
			if(n%i==0)
				return false;
		return true;
	}
	static int count(int m) {
		int count=0;
		for(int i=2;i<=m;i++) {
			boolean rs=isPrime(i);
			if(rs==true) {
				count++;
			System.out.println(i);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
//		int count = 0;
//		for(int i = 2; i<=a; i++) {
//			boolean rs = isPrime(i);
//			if(rs==true)
//				count++;
//		}
//		System.out.println(count);
		System.out.print("No. of PrimeNumber within n: " +count(a));
			
	}
}
