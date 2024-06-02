//reverse of a string
import java.util.*;
public class Reverse_String {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			res=s.charAt(i)+res;
		}
		System.out.print("Reverse of "+s+" is "+res);
	}
}
