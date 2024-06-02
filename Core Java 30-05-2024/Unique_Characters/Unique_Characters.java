//unique charaters in string
import java.util.*;
public class Unique_Characters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		StringBuilder uniqueChar=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if (uniqueChar.indexOf(String.valueOf(ch))== -1)
			{
				uniqueChar.append(ch);
			}
		}
	
		System.out.println("Unique chars in "+s+" are "+uniqueChar.toString());
	}
}
