//count no of spaces and chars
import java.util.*;
public class Space_Character_Count {
	        public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int spc = 0,cc =0;
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch == ' ') {
	                spc++;
	            } else if (ch < '0' || ch > '9') {
	                cc++;
	            }
	        }
	        
	        System.out.println("No of spaces : " + spc + " and characters : " + cc);
	    }
}
