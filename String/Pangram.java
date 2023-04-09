import java.util.Scanner;
public class Pangram {
	static boolean isPangram() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int[] count = new int[26];
		if(st.length()<26)
			return false;
		for(int i = 0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-67]++;
			}
			else if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
		}
		for(int i = 0; i<count.length; i++) {
			if(count[i]==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPangram());
	}
}
