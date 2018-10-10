
import java.util.Scanner;
public class WeirdSubstraction {
    public static void main (String [] args){
        Scanner lector = new Scanner (System.in);
        long a=lector.nextLong(); long b = lector.nextLong();
        
        while(a!=0 && b!=0){
            if(a>=2*b){
                a=a%(2*b);
                continue;
                
            }
            else if(b>=2*a){
                b=b%(2*a);
            }
            else break;
        }
        System.out.println(a+" "+b);
    }
}
