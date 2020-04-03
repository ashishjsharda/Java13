/**
 * Using Swicth Java 13
 * @author ashish
 *
 */
public class SwitchEx {

	public static String getNumLetters(int day)
	{
		return switch(day) {
		case 1 ->"Mon";
		case 2 ->"Tue";
		case 3 ->"Wed";
		case 4 ->"Thu";
		case 5 ->"Fri";
		case 6 ->"Sat";
		case 7 ->"Sun";
		default ->"No such day";
		};
	}
	public static void main(String[] args) {

		System.out.println(getNumLetters(1));
	}

}
