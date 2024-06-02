//Perfect Square
import java.util.*;
public class Perfect_Square {
	public static boolean isperfectSquare(int n) {
		int s=(int)Math.sqrt(n);
		if(s*s==n) {
			return true;
		}else {
			return false;
		}
	}
     public static void main(String[]args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 if(isperfectSquare(n)) {
    		 System.out.print("True");
    	 }else {
    		 System.out.print("False");
    	 }
    }
}

