package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleForClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = new String[10];
        for(int i = 0; i<array.length; i++){
            String arrayVar = sc.nextLine();
            array[i] = arrayVar;
        }
        for(int i = array.length-1; i>=0; i--){
            if(i%2==0) {
                System.out.print(array[i]+" ");
            }
        }

    }
}
