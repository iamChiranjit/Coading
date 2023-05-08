import java.util.Scanner;
public class LeapYear {
	static String isLeapYear(int n) {
		return ((n%4==0 && n%400==0) || n%100!=0 )? "Leap Year": "Not a Leap Year";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(isLeapYear(a));
	}
}
