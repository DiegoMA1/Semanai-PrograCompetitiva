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
public class Genome {
    public static void main(String [] args){
        Scanner lector = new Scanner (System.in);
        int tamaño = lector.nextInt();
        String s = lector.next();
        int cuantasA=0;
        int cuantasG=0;
        int cuantasC=0;
        int cuantasT=0;
        int cuantasDeCadaUna=(tamaño/4);
        //Caso base
        if(tamaño%4!=0){
            System.out.println("===");
        }
        else{
            for (int i = 0; i < s.length(); i++) {
                String a = String.valueOf(s.charAt(i));
                if(a.equals("A")){
                    cuantasA++;
                }
                if(a.equals("G")){
                    cuantasG++;
                }
                if(a.equals("C")){
                    cuantasC++;
                }
                if(a.equals("T")){
                    cuantasT++;
                }
            }
                for (int i = 0; i < s.length(); i++) {
                    if(cuantasA<cuantasDeCadaUna){
                        String b = String.valueOf(s.charAt(i));
                        if(b.equals("?")){
                           s=s.substring(0, i)+"A"+s.substring(i+1, s.length());
                           cuantasA++;
                        }
                    }
                    if(cuantasG<cuantasDeCadaUna){
                        String b = String.valueOf(s.charAt(i));
                        if(b.equals("?")){
                           s=s.substring(0, i)+"G"+s.substring(i+1, s.length());
                           cuantasG++;
                        }
                    }
                    if(cuantasC<cuantasDeCadaUna){
                        String b = String.valueOf(s.charAt(i));
                        if(b.equals("?")){
                           s=s.substring(0, i)+"C"+s.substring(i+1, s.length());
                           cuantasC++;
                        }
                    }
                    if(cuantasT<cuantasDeCadaUna){
                        String b = String.valueOf(s.charAt(i));
                        if(b.equals("?")){
                           s=s.substring(0, i)+"T"+s.substring(i+1, s.length());
                           cuantasT++;
                        }
                    }
            }
                if(cuantasA!=cuantasDeCadaUna || cuantasG!=cuantasDeCadaUna || cuantasC!=cuantasDeCadaUna || cuantasT!=cuantasDeCadaUna){
                    System.out.println("===");
                }
                else{
                System.out.println(s);
                }
        }
    }
}
