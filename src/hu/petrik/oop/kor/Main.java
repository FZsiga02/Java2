package hu.petrik.oop.kor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kor k1 = new Kor(10, 10, 10);
        Kor k2 = new Kor(20, 10, 3);
        Kor k3 = new Kor(45, 33, 23);
        Kor k4 = new Kor(65, 49, 34);
        Kor k5 = new Kor(33, 77, 2);
        Kor k6 = new Kor(99, 94, 45);
        Kor k7 = new Kor(45, 55, 98);
        Kor k8 = new Kor(88, 70, 16);
        Kor k9 = new Kor(60, 90, 8);
        Kor k10 = new Kor(67, 20, 69);

        //Kör kerülete
        System.out.printf("A kör kerülete: %.2f", k1.getKerulet());
        System.out.println("");

        //Kör területe
        System.out.printf("A kör területe: %.2f", k1.getTerulet());
        System.out.println("");

        //Kör méretezése
        System.out.printf("Kérem adja meg mennyivel legyen nagyítva/kicsinyítve a kör (+/-): ");
        System.out.printf("A kör új mérete: %.2f", k1.getMeretezes(sc.nextInt()));
        System.out.println("");

        //Kör adatai
        System.out.printf("A kör adatai: %s", k1.getAdatok());
        System.out.println("");

        //Legnagyobb terület
        int[] t = {k1.getR(), k2.getR(), k3.getR(), k4.getR(), k5.getR(), k6.getR(), k7.getR(), k8.getR(), k9.getR(), k10.getR()};

        double legnagyobb = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] * t[i] * Math.PI > legnagyobb) {
                legnagyobb = t[i] * t[i] * Math.PI;
            }
        }
        System.out.printf("A legnagyobb kör területe: %.2f", legnagyobb);

    }
}
