//average of list using streams
import java.util.ArrayList;
import java.util.List;
public class AverageOfList {
		public static void main(String[] args) {
			List<Integer> l = new ArrayList<>();
			l.add(20);
			l.add(5);
			l.add(3);
			l.add(12);
			l.add(30);		
			double avg = l.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
			System.out.println("The average of list elements is "+avg);
		}

	}

