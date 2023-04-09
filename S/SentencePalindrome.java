import java .util.Scanner;
public class SentencePalindrome {      // never odd or even
	static boolean isPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.nextLine();
		String r = "";
		for(int i = s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		r = r.replaceAll(" ", "");
		s = s.replaceAll(" ", "");
		if(s.equals(r)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome());
	}
}
