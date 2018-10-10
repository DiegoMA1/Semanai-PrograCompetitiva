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
public class OddsAndEnds {
    public static void main(String [] args){
        int n;
        Scanner lector = new Scanner (System.in);
        n=lector.nextInt();
    
        int buffer; 
        boolean impar1=false,impar2=false;
        if(n%2==0){
         System.out.println("No");   
        }
        else{
        for (int i = 0; i < n; i++) {
            buffer=lector.nextInt();
            if(buffer%2==0 && i==0){
            System.out.println("No");
            break;
            }
            if(buffer%2==0 && i==(n-1)){
                System.out.println("No");
                break;
            }
            if(buffer%2==1 && i==0){
            impar1=true;
            }
            if(buffer%2==1 && i==(n-1)){
            impar2=true;
            }
        }
        if(impar1 && impar2){
            System.out.println("Yes");
        }
    }
    }
}
