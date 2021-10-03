package day15;

public class ThreadClass {
    public static void main(String[] args) {
        Thread threadNumber = new NumberThreadClass();
        Thread threadChar = new CharThreadClass();

        threadChar.start();
        threadNumber.start();
    }
}
