package day15;

public class CharThreadClass extends Thread{

    @Override
    public void run(){
        for (char i = 0; i < 'z'; i++) {
            System.out.print(i);
        }
    }
}
