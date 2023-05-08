import java.util.Scanner;

public class PrintEvenNo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	int i = 2;
	while(i<=n) {
		if(i%2==0)
			System.out.println(i + " is Even");
		i++;
	}
//	int i = 2;
//	while(i<=n) {
//		System.out.println(i);
//		i = i+2;
//	}
}
}
