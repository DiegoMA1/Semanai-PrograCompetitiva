/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progracompetitiva;
import java.util.Scanner;
/**
 *
 * @author diegomorenoacevedo
 */
public class CuttingRectangles {
    public static void main(String [] args){
        Scanner lector = new Scanner (System.in);
        int n;
        n=lector.nextInt();
        int [][] n1 = new int [n][3];
        for (int i = 0; i < n1.length; i++) {
            n1[i][i+1]=lector.nextInt(); 
        }
        
        
    }
    
}
