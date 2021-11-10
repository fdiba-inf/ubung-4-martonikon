package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int length = input.nextInt();
    char[] array = new char[length];

    for(int i = 0; i < length; i++) {
      array[i] = input.next().charAt(0);
    }

    String str = String.valueOf(array);
    String nstr = new StringBuffer(str).reverse().toString();

    System.out.print("Reversed symbols: [");

    for(int i = 0; i < nstr.length(); i++) {
      if(i + 1 != nstr.length() && i != 0) {
        System.out.print(" " + nstr.charAt(i) + ",");
      } else if(i==0){
        System.out.print(nstr.charAt(i) + ",");
      } else if(i+1==nstr.length()){
        System.out.print(" " + nstr.charAt(i));
      }
    }

    System.out.print("]");

  }
}