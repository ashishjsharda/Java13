/**
 * Switch Implementation
 * @author ashish
 */
public class SwitchImpl {

   public static  String getNumber(int num)
   {
       return switch (num){
           case 1:yield "one";
           case 2:yield "two";
           default:yield String.valueOf(num);
       };
   }
    public static void main(String[] args) {
        System.out.println(getNumber(20));
    }
}
