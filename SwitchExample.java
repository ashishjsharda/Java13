package Java13;

/**
 * Switch in Java 13
 * @author ashish
 */
public class SwitchExample {
    public static void main(String[] args) {
        String val="Sunday";
        int day=switch(val)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                yield 5;
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
                yield 7;
            default:
                throw new IllegalStateException("Wrong input");

        };
        System.out.println("Value of day is " +day);
    }
}
