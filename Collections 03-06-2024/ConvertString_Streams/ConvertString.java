//convert a list of strings to uppercase or lowercase using streams
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
public class ConvertString {
	       public static void main(String[] args) {
			List<String> sl = new ArrayList<>();
			sl.add("BharGavi");
			sl.add("PraNav");
			sl.add("JaI");
			System.out.println("List Input: "+sl);
			List<String> Uc= sl.stream().map(String::toUpperCase).collect(Collectors.toList());
			System.out.println("Uppercase: "+Uc);
			
			List<String> Lc = sl.stream().map(String::toLowerCase).collect(Collectors.toList());
			System.out.println("Lowercase: "+Lc);
		}
}
