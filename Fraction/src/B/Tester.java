package B;

import A.Fraction;

public class Tester {
    public static void main(String[] args) {
        Fraction A = new Fraction(1,2);
        Fraction B = new Fraction(3,4);

        Fraction C = A.add(B).shorten();
        Fraction D = A.sub(B).shorten();
        Fraction E = A.div(B).shorten();
        Fraction F = A.mul(B).shorten();

        System.out.println("After adding: " + C.getNum() + "/" + C.getDeno());
        System.out.println("After sub: " + D.getNum() + "/" + D.getDeno());
        System.out.println("After div: " + E.getNum() + "/" + E.getDeno());
        System.out.println("After mul: " + F.getNum() + "/" + F.getDeno());

    }
}
