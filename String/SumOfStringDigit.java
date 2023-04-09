import java.util.Scanner;

public class SumOfStringDigit {
	static int sumOfDigit() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int sum = 0;
		for(int i = 0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='0' && ch<='9') 
				sum = sum+ch-48;
		}
		return sum;
	}
	public static void main(String[] args) {
		int x = sumOfDigit();
		System.out.println(x);
	}
}
