package StreamsTutorials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collect method is used to convert back to list
		
		List<String> names = Arrays.asList("Ankit", "Ravi", "Mukesh", "Abhishek", "Amit");
		List<String> nl =names.stream().filter(s-> s.startsWith("A")).map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(nl.get(0));
		
		
		// Print unique number from the array 
		// Sort the array
		
		List<Integer> values = Arrays.asList(6,5,4,3,2,1,1,2,3,4,5,6,7);
		// values.stream().distinct().forEach(s-> System.out.println(s));
		
		// to print 3rd index from the list
		
		List<Integer> nli = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(nli.get(5));

	}

}
