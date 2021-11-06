package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int[] array = new int[size];

    for(int i = 0; i < length; i++){
      array[i] = input.nextInt();
    }
    int index = 0;
    int min = 99999;

     for(int i = 0; i < array.length; i++){
        if(array[i] < min) {
          min = array[i];
        index = i;
        }
     }
     System.out.println("Min index: " + index);



  }
}