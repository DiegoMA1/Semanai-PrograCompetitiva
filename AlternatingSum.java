/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progracompetitiva;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author diegomorenoacevedo
 */
public class AlternatingSum {
    public static void main(String [] args){
        Scanner lector = new Scanner (System.in);
        int n=lector.nextInt(); int a=lector.nextInt(); int b=lector.nextInt(); int k=lector.nextInt();
        int [] s = new int [k]; //Secuencia de tamaño k
        int suma=0;
        
        for (int i = 0; i < k; i++) {
            s[i]=lector.nextInt();
        }
        if(n>k){
            for (int i = 0; i < k; i++) {
                s[i]=s[0];
            }
        }
        for (int i = 0; i <= n; i++) {
            
            suma+= ((int) Math.pow(a, n-i) * (int) Math.pow(b, i))*s[i];
            
            
        }
        System.out.println(suma);
    }
}
