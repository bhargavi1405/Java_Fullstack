//char at odd position
import java.util.*;
public class Character_At_Odd_Position {
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print("Char at odd position are ");
		for(int i=1;i<=s.length();i=i+2)
		{
				System.out.print(s.charAt(i));
			
		}
	}
}
