package day12;

public class Calculater {
    public int x;
    public int y;

    public void printResult(){
        System.out.println(x + "+" + y + "=" + (x+y));
        System.out.println(x + "-" + y + "=" + (x-y));
        System.out.println(x + "*" + y + "=" + (x*y));
        System.out.println(x + "/" + y + "=" + (x/y));
    }
}
