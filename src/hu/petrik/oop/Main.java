package hu.petrik.oop;

import hu.petrik.oop.kor.Kor;
import hu.petrik.oop.pont.Pont;

public class Main {

    public static void main(String[] args) {
	    Pont p1 = new Pont();
	    Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }
        for (Pont p: pontok) {
            System.out.println(p);
        }

        //Origótól legtávolabb eső pont
        int legtavolabbPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[legtavolabbPontIndex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()){
                legtavolabbPontIndex = i;
            }
        }

        System.out.printf("A legtávolabbi pont az origótól: a(z) %d pont, koordinátái: %s, origótól mért távolsága: %.3f", legtavolabbPontIndex + 1, pontok[legtavolabbPontIndex], pontok[legtavolabbPontIndex].getOrigotolMertTavolsag());
        System.out.println("");

        //Két pont távolsága
        if (p1.getKetPontTavolsaga()>p3.getKetPontTavolsaga()){
            System.out.printf("A(z) %s és a(z) %s koordinátájú pontok távolsága: %.0f", p4, p3, p4.getKetPontTavolsaga()- p3.getKetPontTavolsaga());
        }else{
            System.out.printf("A(z) %s és a(z) %s koordinátájú pontok távolsága: %.0f", p4, p3, p3.getKetPontTavolsaga()- p4.getKetPontTavolsaga());
        }
        System.out.println("");

        //Pont helye síknegyedben
        System.out.printf("A(z) %s koordinátájú pont síknegyede: %s", p4, p4.getSiknegyed());
        System.out.println("");
    }

}
