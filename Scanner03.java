package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Diktörtgenin Kısa Enini Giriniz");

        int en = scan.nextInt();

        System.out.println("Dikdörtgenin Uzun Kenarını Giriniz");

        int boy = scan.nextInt();

        System.out.println("Dikdörtgenin Alanı: " + en*boy);

        System.out.println("Çevre Uzunluğu: " + 2*(en+boy));



    }
}
