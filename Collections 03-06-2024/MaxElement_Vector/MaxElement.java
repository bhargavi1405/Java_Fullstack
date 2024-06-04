//Get max element from vector
import java.util.Vector;
import java.util.Iterator;
public class MaxElement {
	public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();     
        v.add(17);
        v.add(5);
        v.add(23);
        v.add(95);
        v.add(87);
        int max = Integer.MIN_VALUE;     
        Iterator itr = v.iterator();
        while (itr.hasNext()){
            int ele = (Integer)itr.next();
            if (ele > max){
             max=ele;
            }
        }
        System.out.println("Maximum element value from vector is "+max);
    }
}
