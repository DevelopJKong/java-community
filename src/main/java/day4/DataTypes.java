package day4;
public class DataTypes {
    public static void main(String[] args) {
        //기본타입
        char charVar =  1; // 0~2^16-1
        short shortVar = -1; // -2^16 ~ (2^15-1) (-32,768 ~ 32.767)
        int intVar = 4000; // -2^31 ~ (2^31-1) (-2,147,483,648 ~ 2,147,483,647)
        long longVar = 4000l; // -2^63 ~ (2^63-1)
        float floatVar = 1.1f; // (+/-) 1.4E-45 ~ (+/-) 3.4028235E38
        double doubleVar = 1.1; // (+/-) 4.9E-324 ~ (+/-) 1.7976931348623157E08
        boolean booleanVar = true; // true , false
        System.out.println("booleanVar = " + booleanVar);
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("longVar = " + longVar);
        System.out.println("intVar = " + intVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("charVar = " + charVar);

        //-레퍼런스타입 :
        //클래스, 인터페이스, 배열, 열거형 / 값을 변수에 대입하지만 변수는
        //참조값(메모리상)을 가지고있지 값(프리미티브타입 값들로 이루어진)을 직접 들고있지는 않는 것이 특징이다.

        String stringVar = "정콩";
        Integer integerVar = 1;
        String array [] = new String[5];
        String arrs[] = {"코뮤니티","오늘도","화이팅","자바스터디","정콩"};
        for (String arr : arrs) {
            System.out.println(arr + "+");
        }
    }
}
