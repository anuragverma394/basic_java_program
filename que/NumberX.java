//Take an array os input from the user .Search for a given number x and print the resul the index at which it occurs.
package que;
import java.util.Scanner;

public class NumberX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int number[] = new int[size];
        
        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        //input

        int x=sc.nextInt();
    
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.println("x is found at index ="+i);
        }

    }
     

    
}
}
