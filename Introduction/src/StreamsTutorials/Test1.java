package StreamsTutorials;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankit");
		names.add("Ravi");
		names.add("Mukesh");
		names.add("Amit");
		names.add("Abhishek");
//		int count=0;
//		
//		for(int i=0; i<names.size();i++)
//		{			
//			String actual =  names.get(i);
//
//			if(actual.startsWith("A"));
//			{
//				count++;
//			}
//			
//		}
//		System.out.println(count);
		
		// Java Stream is used to optimise the code
		//There is no life for intermediate operation if there is no terminal operation
		// Terminal operation will execute only if intermediate operation (filter method) returns true
		
		
		long c =names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println(c);
		
		
		long d =Stream.of("Ankit", "Ravi", "Mukesh", "Amit", "Abhishek").filter(s->s.startsWith("D")).count();
		System.out.println(d);
		
		// print all the names of arraylist
		
	//	names.stream().filter(s-> s.length()>3).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()>3).limit(5).forEach(s-> System.out.println(s));
				
		
		
		
		
	}

}
