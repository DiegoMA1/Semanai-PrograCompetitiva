/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author diegomorenoacevedo
 */
public class ABC {
    public static long gcd(long a,long b) {
        if(b>0) return gcd(b, a%b);
        return a;
    }

    public static long mcm(long a, long b) {
        return a/gcd(a, b)*b;
    }
    public static long mcm3(long a, long b, long c){
        return mcm(mcm(a,b),c);
    }
    public static String suma(long num1, long den1, long num2, long den2, long num3, long den3){
        String res="";
        long m=mcm3(den1,den2,den3);
        long sum=(m/den1*num1)+(m/den2*num2)+(m/den3*num3);
        long gc=gcd(m,sum);
        if(sum%m!=0){
            if(gc>1)
            {
                sum/=gc;
                m/=gc;
            }
            res=String.valueOf(sum)+"/"+String.valueOf(m);
        }
        else
            res=String.valueOf(sum/m)+"/1";
        
        return res;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n;
        n=leer.nextInt();
        String []res= new String[n];
        String uno="",dos="",tres="";
        long num1,num2,num3,den1,den2,den3;
        for (int i = 0; i < n; i++) {
            uno=leer.next();
            String[] parts1= uno.split("/");
            num1 = Long.parseLong(parts1[0]); 
            den1 = Long.parseLong(parts1[1]); 
            long gcd1=gcd(num1,den1);
            if(gcd1>1){
                num1/=gcd1;
                den1/=gcd1;
            }
            
            dos=leer.next();
            String[] parts2= dos.split("/");
            num2 = Long.parseLong(parts2[0]); 
            den2 = Long.parseLong(parts2[1]); 
            long gcd2=gcd(num2,den2);
            if(gcd2>1){
                num2/=gcd2;
                den2/=gcd2;
            }
            
            tres=leer.next();
            String[] parts3= tres.split("/");
            num3 = Long.parseLong(parts3[0]); 
            den3 = Long.parseLong(parts3[1]); 
            long gcd3=gcd(num3,den3);
            if(gcd3>1){
                num3/=gcd3;
                den3/=gcd3;
            }
            res[i]=suma(num1,den1,num2,den2,num3,den3);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
