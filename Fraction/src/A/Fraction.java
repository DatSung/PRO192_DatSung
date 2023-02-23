package A;

public class Fraction {
    private  int num;
    private  int deno;


    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDeno() {
        return deno;
    }

    public void setDeno(int deno) {
        if (deno != 0) {
            this.deno = deno;
        }
    }
//    ADD
    public Fraction add(Fraction B) {
        int tmp1 = this.num * B.getDeno() + this.deno * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction result = new Fraction(tmp1, tmp2);
        return result;
    }
//    SUB
    public Fraction sub(Fraction B) {
        int tmp1 = this.num * B.getDeno() - this.deno * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction result = new Fraction(tmp1, tmp2);
        return result;
    }
//    DIV
    public  Fraction div(Fraction B) {
        int tmp1 = this.num * B.getDeno() ;
        int tmp2 = this.deno * B.getNum();
        Fraction result = new Fraction(tmp1, tmp2);
        return result;
    }
//    MUL
    public Fraction mul(Fraction B) {
        int tmp1 = this.num * B.getNum();
        int tmp2 = this.deno * B.getDeno();
        Fraction result = new Fraction(tmp1, tmp2);
        return result;
    }
//    USCLN
    public int findUSCLN(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (a != b) {
            if (a > b) a = a - b;
            if (a < b) b = b - a;
        }
        return a;
    }
//    rutGon
    public Fraction shorten() {
        int UCLN = findUSCLN(this.getNum(), this.getDeno());
        int  tmp1 = this.getNum() / UCLN;
        int tmp2 = this.getDeno() / UCLN;
        Fraction result = new Fraction(tmp1, tmp2);
        return result;
    }
}
