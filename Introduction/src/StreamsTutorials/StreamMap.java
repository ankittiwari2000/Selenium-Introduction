package StreamsTutorials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print names which have last letter as "k" with uppercase 
		
		List<String> names = Arrays.asList("Ankit", "Ravi", "Mukesh", "Abhishek", "Amit");
		//names.stream().filter(s-> s.endsWith("k")).map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
		
		// Print names which have first letter as "a" with uppercase & sorted
		
		//names.stream().filter(s-> s.startsWith("A")).sorted().map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
		
		// How to concatenate/ merging two list
		
		List<String> names1 = Arrays.asList("Meera", "Hema", "Shikha", "Shweta", "Preeti");
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s-> System.out.println(s));
		
		// to find any name present in the list or not
		
		boolean flag = newStream.anyMatch(s-> s.equalsIgnoreCase("Ankit"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		

	}

}
