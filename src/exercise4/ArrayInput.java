package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput{ 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int a = input.nextInt();
        int[] array =new int [a];

        for(int i = 0; i < a ; i++){

          array[i] = input.nextInt();

        }
         System.out.print("Numbers: [");

          for(int i = 0; i < array.length; i++){
            if( i + 1 != array.length && i != 0 ){
              System.out.print(" " + array[i] + ",");
            }else if(i==0){
              System.out.print(array[i] + ",");
            }else if(i+1==array.length){
              System.out.print(" " + array[i]);
            }

          }
          System.out.print("]");

        

    
    }
}