package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //scanner kullanıcıdan data almaya yarar.
    //scanner kullanıcıyla etkileşim kurmamızı sağlar.
    //scanner bir Java class ıdır. Bu class ı kullanabilmek için "import" etmek gerekir.
    //"util library" Scanner Class bu kütüphanedeki classlardan biridir

    public static void main(String[] args) {

        //kullanıcadan data almak için yapılması gerekenler

        //1. Adım: Scanner Classından object oluşturun


       Scanner input = new Scanner(System.in);

       //2. Adım: kullanıcıya ne yapacagini söyle

        System.out.println("Hey Kullanici Yasini Gir");

        //3. Adım: Kullanicidan aldiginiz datayi variable nin içine koyun

        byte age = input.nextByte();

        System.out.println("Hey Kullanici Senin Yasin: " + age);




    }

}
