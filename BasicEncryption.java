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
public class BasicEncryption {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        String s = lector.next();
        String[]a=new String [26];
        String[]b=new String[26];
        
        a[0]="a"; 
        a[1]="b"; a[2]="c"; a[3]="d"; a[4]="e"; a[5]="f"; a[6]="g";a[7]="h"; a[8]="i"; a[9]="j";
        a[10]="k"; a[11]="l"; a[12]="m"; a[13]="n"; a[14]="o"; a[15]="p"; a[16]="q";a[17]="r"; a[18]="s"; a[19]="t";
        a[20]="u"; a[21]="v"; a[22]="w"; a[23]="x"; a[24]="y"; a[25]="z";
        
        b[0]="A"; b[1]="B"; b[2]="C"; b[3]="D"; b[4]="E"; b[5]="F"; b[6]="G";b[7]="H"; b[8]="I"; b[9]="J";
        b[10]="K"; b[11]="L"; b[12]="M"; b[13]="N"; b[14]="O"; b[15]="P"; b[16]="Q";b[17]="R"; b[18]="S"; b[19]="T";
        b[20]="U"; b[21]="V"; b[22]="W"; b[23]="X"; b[24]="Y"; b[25]="Z";
        
        for (int i = 0; i < s.length(); i++) {
            String temp = ""+s.charAt(i);
            if(temp.equals(a[i])){
            System.out.println("True");
        }
        }  
    }
}
