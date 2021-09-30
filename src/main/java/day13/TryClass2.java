package day13;

public class TryClass2 {
    public static void main(String[] args) {
        Student co = new Student();
        double num = co.Student("코뮤",100,80,76);
        double num2 = co.Student("커피볶는정콩",96,58,90);
        System.out.printf("평균 점수는 : %.5f",num);
        System.out.printf("평균 점수는 : %.5f",num2);
    }
}
