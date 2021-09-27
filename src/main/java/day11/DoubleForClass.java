package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleForClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요: ");
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 5; i >= 0; i--) {
            int arrayVar = sc.nextInt();
            arrList.add(arrayVar);
            for (int j = 0; j < i; j++) {
                arrList.set(j, arrList.get(arrList.size()-j));
            }
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }


    }
}
