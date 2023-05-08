import java.util.Scanner;
public class DaysInMonth {
	static String daysInMonth(int n) {
//		if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12) {
//			return 31 + " Days";
//		}
//		else if(n==4 || n==6 || n==9 || n==11) {
//			return 30 + " Days";
//		}
//		else if(n==2) {
//			return 28+" or "+29+" Days";
//		}
//		else {
//			return "Invalid month number";
//		}
		return (n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)? "31 Days": (n==4 || n==6 || n==9 || n==11)? "30 Days": (n==2)? "28 or 29 Days":"Invalid month number";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(daysInMonth(a));
	}
}		