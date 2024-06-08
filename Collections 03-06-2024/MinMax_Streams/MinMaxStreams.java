//maximum and minimum values in a list of integers using streams
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class MinMaxStreams {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(58);
		l.add(100);
		l.add(45);
		l.add(15);
		int max = l.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max value is "+max);
		
		int min = l.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min value is "+min);
	}
}
