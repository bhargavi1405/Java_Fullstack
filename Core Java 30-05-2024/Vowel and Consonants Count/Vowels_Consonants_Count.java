//Vowels & consonants count
import java.util.*;
public class Vowels_Consonants_Count {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		int vc=0,cc=0;	
		String vowels = "aeiou";
		//enhanced for loop
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch) != -1) {
				    vc+=1;
				}else {
					cc+=1;
				}
			}
		}
		System.out.println("Vowels count is "+vc);
		System.out.println("Consonants count is "+cc);
	}
}
