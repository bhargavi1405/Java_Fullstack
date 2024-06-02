//last character of every word
import java.util.*;
public class LastChar {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		String[] parts = s.split(" ");
		for(String st : parts) {
			if(st.length() == 0) continue;
			Character ch = st.charAt(st.length()-1);
			if(Character.isLetter(ch)) {
				res += ch;
			}
		}
		System.out.println(res);
	}
}
