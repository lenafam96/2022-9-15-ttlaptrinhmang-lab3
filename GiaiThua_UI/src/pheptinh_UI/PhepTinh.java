/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptinh_UI;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class PhepTinh {
    private int th1;
    private int th2;
    private char toantu;

    public PhepTinh() {
        this.th1 = 0;
        this.th2 = 0;
        this.toantu = '+';
    }

    public PhepTinh(int th1, int th2, char toantu) {
        this.th1 = th1;
        this.th2 = th2;
        this.toantu = toantu;
    }

    public int getTh1() {
        return th1;
    }

    public void setTh1(int th1) {
        this.th1 = th1;
    }

    public int getTh2() {
        return th2;
    }

    public void setTh2(int th2) {
        this.th2 = th2;
    }

    public char getToantu() {
        return toantu;
    }

    public void setToantu(char toantu) {
        this.toantu = toantu;
    }

    public  double tinhToan() {
        switch (this.toantu) {
            case '-':
                return this.th1 - this.th2;
            case '*':
                return this.th1 * this.th2;
            case '/':
                return this.th1*1.0 / this.th2;
            case '%':
                return this.th1 % this.th2;
            case '^':
                return (int) Math.pow(this.th1, this.th2);
            default:
                return this.th1 + this.th2;
        }
    }
    
}
