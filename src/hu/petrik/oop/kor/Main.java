package hu.petrik.oop.kor;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(10,10,10);


        //Kör kerülete
        System.out.printf("A kör kerülete: %.2f", k1.getKerulet());
        System.out.println(" ");

        //Kör területe
        System.out.printf("A kör területe: %.2f", k1.getTerulet());
        System.out.println(" ");
    }
}
