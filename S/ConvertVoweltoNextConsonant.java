import java.util.*;
public class ConvertVoweltoNextConsonant {
	static String VowelToCons(String st) {
		char[] ch = st.toCharArray();
		String rs = "";
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				rs = rs+(char)(ch[i]+1);
			}
			else {
				rs = rs+ch[i];
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		System.out.println(VowelToCons(st));
	}
}
