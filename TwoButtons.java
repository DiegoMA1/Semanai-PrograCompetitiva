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

public class TwoButtons {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int m = lector.nextInt();
        int cont = 0;
        if (n > m) {
            System.out.println(n - m);
        } else {
            while (m > n) {
                if (m % 2 != 0) {
                    m += 1;
                    cont++;
                } else {
                    m /= 2;
                    cont++;
                }
            }
            System.out.println(cont+=(n-m));
        }
    }
    public static int BotonAzul(int n) {
        n -= 1;
        return n;
    }

    public static int BotonRojo(int n) {
        n = n * 2;
        return n;
    }

}