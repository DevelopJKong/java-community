package day14;

import java.util.Scanner;

public class tryAndCatchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (true) {
            System.out.print("please type number:");
            int i = sc.nextInt();
                try {
                    System.out.println(value[i]);
                } catch (Exception e){
                    System.out.println("it's done");
                    break;
                }

        }
    }
}
