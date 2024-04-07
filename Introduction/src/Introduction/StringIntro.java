package Introduction;

public class StringIntro {

	public static void main(String[] args) {
		String s = "Ankit Kumar Tiwari";
		System.out.println(s);
		
		//Printing all the character of the string
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Spliting string into pieces
		String[] s1 = s.split(" ");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		
		//Printing character in reverse order
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
