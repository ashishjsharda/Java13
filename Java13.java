/**
 * New  Features in Java 13
 * @author asharda
 *
 */
public class Java13 {
	
	/**
	 * Using Switch with Yield
	 * @param switchArg
	 * @return String
	 */
	private static String switchWithYield(int switchArg){
		  return switch(switchArg)
				  {
		  case 1,2: yield "one or two";
		  
		  default:yield "some other value than 1 or 2";
				  };
	}

	/**
	 * Text Blocks in Java 13
	 */
	public static void multiLineComent()
	{
		String output = """
			    This is multitline
			    comment
						""";
		
		System.out.println(output);
		
	}
	public static void main(String[] args) {
		
		String s=switchWithYield(10);
		System.out.println(s);
		multiLineComent();

	}

}
