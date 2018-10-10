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
public class TextSplit{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		int p = lector.nextInt();
		int q = lector.nextInt();
		String s = lector.next();
		int i=0;
		while(p*i<=n){
			int j = n-p*i;
			if(j%q==0){
				int iteraciones= j/q;
				System.out.println(i+iteraciones);
				int iteraciones2=0;
				for(int num1=0; num1<i;num1++){
					System.out.println(s.substring(iteraciones2,p+iteraciones2));
					iteraciones2+=p;
				}
				for(int num1=0; num1<iteraciones;num1++){
					System.out.println(s.substring(iteraciones2,iteraciones2+q));
				  iteraciones2+=q;
				}
				return;
			}
			i++;
		}
		System.out.println("-1");
	}

}