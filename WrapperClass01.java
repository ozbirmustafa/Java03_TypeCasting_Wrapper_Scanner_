package day03typecastingwrapperscanner;

public class WrapperClass01 {

    /* primitive + method ==> Wrapper Class

       primitive  ==>  Wrapper
       byte       ==>  Byte
       short      ==>  Short
       int        ==>  Integer   ****
       long       ==>  Long
       float      ==>  Float
       double     ==>  Double
       boolean    ==>  Boolean
       char       ==>  Character ****
  */
    public static void main(String[] args) {

        byte priByte= 12;

        Byte wrapperByte = 12;

        //byte data tipinin en küçük ve en büyük değerlerini yazdırınız.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //primitiveler nasıl "wrapper"lara çevrilir. ==>Autoboxing

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        //"wrapper"lar primitivelere nasıl çevrilir

        Character w1 = 's';
        char primitiveW1 = w1;
        System.out.println("\"" + primitiveW1 + "\"");

        //note: Autoboxing ve Unboxing Java tarafından otomatik olarak yapılır.





    }


}
