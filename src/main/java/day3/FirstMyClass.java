package day3;

public class FirstMyClass {
    public String check(String name){
        System.out.println("체크할 이름은 : "+name);
        return name;
    }

    public static void main(String[] args) {
        FirstMyClass firstMyClass = new FirstMyClass();
        firstMyClass.check("정콩");
    }

}
