//finding smallest vowel in a string
import java.util.*;
public class Smallest_Vowel_in_a_String {
	        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        char smallVowel='u';
	        char ch,temp;
	        for(int i=0;i<s.length();i++)
	        {
	            ch=s.charAt(i);
	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	            {
	                    temp=ch;
	                    if(temp<smallVowel)
	                    {
	                        smallVowel=temp;
	                    }
	            }
	        }
	        System.out.print("Smallest vowel in "+s+" is "+smallVowel);
}
}
