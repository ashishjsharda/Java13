/**
 * Example using String Methods
 * @author ashish
 */
public class StringMethods {
    public static void main(String[] args) {
        String str1=" Hi \t\n Hello World Ashish \r ";
        System.out.println(str1.stripIndent());
        System.out.println(str1.translateEscapes());
    }
}
