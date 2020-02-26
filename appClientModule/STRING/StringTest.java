package STRING;

public class StringTest {

	public static void main(String[] args) {
		
		String str="Sahil Sharma";
		char c = str.charAt(4);
		System.out.println(c);
		
		System.out.println(str.length());
		
		System.out.println(str.substring(6));
		
		System.out.println(str.substring(4,10));
		
		System.out.println(str.concat(" is a java developer"));
		
		System.out.println(str.replace('S', 'Y'));
		
		System.out.println(str.equals("sahil sharma"));
		
		System.out.println(str.equalsIgnoreCase("sahil sharma"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.replace("Sa", "Ya"));
		
		System.out.println(str.indexOf(' '));
		
		System.out.println(str.indexOf(5, 3)); // something is wrong with this
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		//System.out.println(str.valueOf()); something is wrong with this 
	}

}
