import java.util.Scanner;
public class ReverseString {
	static String isReverse() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int i = 0, j = ch.length-1;
		while(i<j){
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
			i++;
			j--;
		}
		st = new String(ch);
		return st;
	}
	public static void main(String[] args) {
		System.out.println(isReverse());
	}
}
