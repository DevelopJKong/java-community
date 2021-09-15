package day5;

public class SystemOut {
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("덧셈,뺄셈,곱셈의 결과를 볼까요?");
        System.out.printf("a+b는 %d ",add(10,10));
        System.out.printf("a-b는 %d ",sub(10,10));
        System.out.printf("a*b는 %d  \n",mul(10,10));
        System.out.println("-------------------------------");

    }
    public static int add(int a, int b){
        int sum;
        sum = a+b;
        return sum;
    }
    public static int sub(int a,int b){
        int sub;
        sub = a-b;
        return sub;
    }
    public static int mul(int a,int b){
        int mul;
        mul = a * b;
        return mul;
    }


}
