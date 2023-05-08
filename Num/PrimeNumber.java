import java.util.Scanner;
public class PrimeNumber {
	static boolean isPrime(int n) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int isCount(int a) {
		int count = 0;
		for(int i = 2; i<=a; i++) {
			if(isPrime(i)==true)
				count++;
		}
		return count;
	}
	static void uptoN(int b) {
		int x = 2, y = 1;
		while(y<=b) {
			if(isPrime(x)==true) {
				System.out.print(x+" ");
				y++;
			}
			x++;
		}
	}
	static int nthPrime(int c) {
		int count = 0;
		for(int i = 2; i>0; i++) {
			if(isPrime(i)==true) {
				count++;
			}
			if(count==c) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(n+" is Prime no: "+isPrime(n));
		System.out.println("Prime no within "+n+": "+isCount(n));
		uptoN(n);
		System.out.println();
		System.out.println(n+"th Prime no is: "+nthPrime(n));
	}
}
