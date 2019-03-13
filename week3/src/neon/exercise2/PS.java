package neon.exercise2;

import neon.exercise1.UCLN;

public class PS {
    private int tu;
    private int mau;
    UCLN uclnPS = new UCLN();
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void addPS(PS ps1, PS ps2){
        int tu_f = ps1.tu*ps2.mau + ps2.tu*ps1.mau;
        int mau_f = ps1.mau + ps2.mau;
        int b = uclnPS.ucln(tu_f,mau_f);
        int tu = tu_f/b;
        int mau = mau_f/b;
        System.out.println("mau chung la :"+b);
        System.out.println(tu+"/"+mau);
    }
}
