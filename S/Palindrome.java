import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int i = 0, j = st.length()-1;
		do {
			if(st.charAt(i) != st.charAt(j))
				return false;
				i++;
				j--;
		}while(i<j);
		return true;
	}
	public static void main(String[] args) {
		//boolean rs  = isPalindrome();
//		Scanner sc = new Scanner(System.in);
//				String st = sc.nextLine();
		System.out.println(isPalindrome());
	}
}
