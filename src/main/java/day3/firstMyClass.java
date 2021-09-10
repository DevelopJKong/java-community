package day3;

public class firstMyClass {
    public String check(String name){
        System.out.println("체크할 이름은 : "+name);
        return name;
    }

    public static void main(String[] args) {
        firstMyClass firstMyClass = new firstMyClass();
        firstMyClass.check("정콩");
    }

}
