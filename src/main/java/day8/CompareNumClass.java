package day8;

import java.util.Scanner;


public class CompareNumClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================== 10 이하의 숫자를 입력해주세요====================");
        System.out.println("ex) 7 8 -> 숫자를 입력하고 space(공백)를 하고 다음 숫자를 입력해주세요 :)");
        String firstNum = sc.nextLine();
        char[] arrs = new char[firstNum.length()];
        for (int i=0; i<firstNum.length(); i++) {
            arrs[i] = firstNum.charAt(i);
        }
       // System.out.println(Arrays.toString(arrs));
        if(firstNum.length()==3){
            if(arrs[0]<arrs[2]){
                System.out.println(arrs[2]+"이(가) 더 큽니다");
            }else if(arrs[0]>arrs[2]){
                System.out.println(arrs[0]+"이(가) 더 큽니다");
            }else {
                System.out.println("서로 같습니다");
            }
        }else {
            System.out.println("다시 입력해주세요");
            //throw new Exception("please rewrite");
        }


    }
}
