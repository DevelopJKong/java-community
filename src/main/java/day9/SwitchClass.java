package day9;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        //객체 선언
        Scanner sc = new Scanner(System.in);
        MbtiClass mbtiClass = new MbtiClass();
        //초기화
        String mbti;

        //콘솔표시
        System.out.println("========= 개발자 MBTI ===========");
        System.out.println("당신의 MBTI를 입력하세요");

        //Inputstream
        mbti = sc.nextLine();
        System.out.println(mbtiClass.SelectMbit(mbti));
        sc.close();
    }

}
