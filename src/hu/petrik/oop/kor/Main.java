package hu.petrik.oop.kor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kor k1 = new Kor(10,10,10);


        //Kör kerülete
        System.out.printf("A kör kerülete: %.2f", k1.getKerulet());
        System.out.println("");

        //Kör területe
        System.out.printf("A kör területe: %.2f", k1.getTerulet());
        System.out.println("");

        //Kör méretezése
        System.out.printf("Kérem adja meg mennyivel legyen nagyítva/kicsinyítve a kör (+/-): ");
        System.out.println("");
        System.out.printf("A kör új mérete: %.2f", k1.getMeretezes(sc.nextInt()));
    }
}
