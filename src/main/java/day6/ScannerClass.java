package day6;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyInfoClass info = new MyInfoClass();

        System.out.println("=============please writer your info==============");
        System.out.printf("%s please write your name \n",info.name);
        System.out.printf("%s please write your age \n",info.age);
        System.out.printf("%s please write your mbti \n",info.mb);
        System.out.printf("%s please write your blood type \n",info.blood);
        System.out.printf("%s please write your best sentence \n",info.sentence);
        System.out.println("=============your info end=============");

//        System.out.println("=============자기소개 입력하기==============");
//        System.out.printf("%s 이름을 입력하세요 \n",info.name);
//        System.out.printf("%s 나이를 입력하세요 \n",info.age);
//        System.out.printf("%s 엠비티아이 을 입력하세요 \n",info.mb);
//        System.out.printf("%s 혈액형을 입력하세요 \n",info.blood);
//        System.out.printf("%s 좌우명 한 문장을 입력하세요 \n",info.sentence);
//        System.out.println("=============자기소개 끝==============");

    }
}
