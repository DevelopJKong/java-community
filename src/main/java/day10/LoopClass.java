package day10;

import java.util.Scanner;

public class LoopClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ForMethodClass forClass = new ForMethodClass();
        int numVar = 0;

        System.out.print("숫자를 입력하세요: ");
        numVar = sc.nextInt();
        System.out.printf("1부터 %d 까지의 합은 %d 입니다",numVar,forClass.CalculateSum(numVar));
    }
}
