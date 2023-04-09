import java.util.Arrays;
import java.util.Scanner;
public class Angram {
	static int[] isReverse(String s) {

		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;

		}
		return count;
	}

	static boolean isAnagram(String st1, String st2) {
		int[] ct1 = isReverse(st1);
		int[] ct2 = isReverse(st2);
		for (int i = 0; i < 26; i++) {
			if (ct1[i] != ct2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2));
//		int[] x = isReverse("Babay");
//		System.out.println(Arrays.toString(x));
	}
}
