package hu.petrik.oop.kor;

public class Kor {
    private int x;
    private int y;
    private int r;

    public int getR() {
        return r;
    }

    public Kor(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Kor(int r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    public Kor() {
        this.x = (int) (Math.random() * (2 * 100) + 1) - 100;
        this.y = (int) (Math.random() * (2 * 100) + 1) - 100;
        this.r = (int) (Math.random() * (2 * 100) + 1) - 100;
    }

    public double getKerulet() {
        double kerulet = 2 * r * Math.PI;
        return kerulet;
    }

    public double getTerulet() {
        double terulet = r * r * Math.PI;
        return terulet;
    }

    public double getMeretezes(int meret) {
        this.r += meret;
        return this.r;
    }

    public String getAdatok(){
        return "("+this.x+","+this.y+","+this.r+")";
    }

}


