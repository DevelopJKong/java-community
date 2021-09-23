package day9;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MbitClass mbtiClass = new MbitClass();
        String mbti;

        System.out.println("========= 개발자 MBTI ===========");
        System.out.println("당신의 MBTI를 입력하세요");
        mbti = sc.nextLine();
        System.out.println(mbtiClass.SelectMbit(mbti));
    }

}
