package day15;

public class NumberThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.print(i);
        }
    }

}
