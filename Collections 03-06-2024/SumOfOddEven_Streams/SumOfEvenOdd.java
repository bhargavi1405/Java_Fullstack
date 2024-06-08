//sum of all even, odd numbers in a list using streams
import java.util.ArrayList;
import java.util.List;
public class SumOfEvenOdd {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(80);
		l.add(41);
		l.add(55);
		l.add(6);	
		l.add(3);
		double oddsum = l.stream().mapToInt(Integer::intValue).filter(n -> n%2 != 0).sum();
		System.out.println("Odd elements sum is "+oddsum);

		double evensum = l.stream().mapToInt(Integer::intValue).filter(n -> n%2 == 0).sum();
		System.out.println("Even elements sum is "+evensum);
	}
}
