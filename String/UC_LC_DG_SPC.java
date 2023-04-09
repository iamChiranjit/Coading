import java.util.Scanner;

public class UC_LC_DG_SPC {
	static void readArray(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		int uc=0, lc=0, dg=0, spc=0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				dg++;
			else
				spc++;
		}
		System.out.println("UpperCase = "+uc);
		System.out.println("LowerCase = "+lc);
		System.out.println("Digits = "+dg);
		System.out.println("SpecialCharacter = "+spc);
	}
	
	
	public static void main(String[] args) {
		readArray();
	}
}
