/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giaithua_ui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class GiaiThua {
    private int n;

    public GiaiThua() {
        this.n = 0;
    }

    public GiaiThua(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean KiemTra(){
        return this.n>=0;
    }
    
    public String TinhGT(){
        String result = "1";
        if(this.n<2)   return result;
//        for(int i=2;i<=this.n;i++)
//            result*=i;
//        return result;
        result = "";
        int a[]=new int[500000];
        int i,j,m=1;
        long r=0,q;
        a[0]=1;
        for(i=2;i<=n;i++){
            for(j=0;j<m;j++){
                q=r;
                r=(a[j]*i+r)/10;
                a[j]=(int) ((a[j]*i+q)%10);
            }
            while(r>0){
                a[m++]=(int) (r%10);
                r/=10;
            }
        }
        int count = 0;
        for(i=0;i<=m-1;i++)
            if(a[i]==0)
                count++;
            else break;
        int e = i;
        if(m>10){
            for(i=m-1;i>=e;i--)
            result+=String.valueOf(a[i]);
            result+="E"+e;
        }
        else{
            for(i=m-1;i>=0;i--)
            result+=String.valueOf(a[i]);
        }
        return result;
    }
}
