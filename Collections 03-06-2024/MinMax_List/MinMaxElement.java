//min and max element from list
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class MinMaxElement {
	 public static Integer findMin(List<Integer> l) 
	    { 
	        if (l == null || l.size() == 0) { 
	            return Integer.MAX_VALUE; 
	        } 
	        return Collections.min(l); 
	    } 
	  
	    public static Integer findMax(List<Integer> l) 
	    { 
	        if (l == null || l.size() == 0) { 
	            return Integer.MIN_VALUE; 
	        } 
	        return Collections.max(l); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        List<Integer> l = new ArrayList<>(); 
	        l.add(65); 
	        l.add(25); 
	        l.add(4); 
	        l.add(19);
	        l.add(34);
	        System.out.println("Min value is " + findMin(l)); 
	        System.out.println("Max values is " + findMax(l)); 
	    } 
}
