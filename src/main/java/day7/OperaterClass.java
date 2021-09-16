package day7;

import java.util.Scanner;

public class OperaterClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        FunctionMethodClass fm = new FunctionMethodClass();
        System.out.println("==========================사칙연산===========================");
        System.out.println(firstNum +" + "+secondNum +" = " + fm.sum(firstNum,secondNum));
        System.out.println(firstNum +" - "+secondNum +" = " + fm.sub(firstNum,secondNum));
        System.out.println(firstNum +" * "+secondNum +" = " + fm.mul(firstNum,secondNum));
        System.out.println(firstNum +" / "+secondNum +" = " + fm.div(firstNum,secondNum));
        System.out.println(firstNum +" % "+secondNum +" = " + fm.per(firstNum,secondNum));
    }
}
