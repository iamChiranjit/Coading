import java.util.Scanner;

public class FrequencyOfAlph {
	static void isFrequency() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int[] count = new int[26];
		for(int i = 0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
		}
		for(int j = 0; j<count.length; j++) {
			if(count[j]!=0) {
				System.out.println((char)(j+65)+"="+count[j]);
			}
		}
	}
	public static void main(String[] args) {
		isFrequency();
	}
}
