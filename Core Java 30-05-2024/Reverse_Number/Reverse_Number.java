//Reverse Number
import java.util.*;
public class Reverse_Number {
	         public static void main(String args[]) {
	    	 Scanner s=new Scanner(System.in);
	    	 int n=s.nextInt();
	    	 int r=0;
	    	 int temp=n;
	    	 while(n!=0) {
	    		r=(r*10)+n%10;
	    	     n/=10;
	    	 }
	    	 System.out.print("Reverse of "+temp+" is"+" "+r);
	     }
}
