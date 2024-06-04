//convert array to collection
import java.util.Arrays;
import java.util.List;
public class ArrayToCollection {
	public static void main(String[] args)
    {
        String proglangArray[] = { "Java", "Python", "Javascript", "Go" };
        List proglangList = Arrays.asList(proglangArray);
        System.out.println("Converted ArrayList elements are " + proglangList);
    }
}
