package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data tipini diğer numeric data tipine çevirmek demektir.
    // byte<short<int<long<float<double
    //küçük data tipini büyük data tipine çevirmeye "Auto Widening"
    //büyük data tipini küçük data tipine çevirmeye  "Explicit Narrowing"

    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;

        long population = 1234;
        int newPopulation = (int) population;

        short priceOfShirt = 250;
        double newPriceOfShirt = priceOfShirt;

        float heightOfChild = 120.5F;
        byte newHeightOfChild = (byte) heightOfChild;

        System.out.println(newHeightOfChild);
        // Java ondalık sayıyı tam sayıya çevirirken ondalık kısmı siler

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber); //-128+ 0 + 127 = 256rakam => 515/256=3 mod aritmeti

        int num = 510;
        byte newNum =(byte) num;
        System.out.println(newNum);






    }



}
