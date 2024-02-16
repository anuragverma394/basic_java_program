import java.util.*;

/**
 * Arrays
 */
public class Arrays {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int Number[] = new int[size];
    
    for (int i=0;i<size;i++){
        Number[i]=sc.nextInt();
    }
    for(int i =0;i<size;i++){
        System.out.println(Number[i]);
    }
    
}  
}
