package day6;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
       // String mb = sc.nextLine();
        String blood = sc.nextLine();
        String sentence = sc.nextLine();

        System.out.println("=============자기소개 입력하기==============");
        System.out.println(name + " 이름을 입력하세요");
        System.out.println(age +" 나이를 입력하세요");
        //System.out.println(mb +" 엠비티아이 을 입력하세요");
        System.out.println(blood + " 혈액형을 입력하세요");
        System.out.println(sentence + " 좌우명 한 문장을 입력하세요");
        System.out.println("=============자기소개 끝==============");

    }
}
