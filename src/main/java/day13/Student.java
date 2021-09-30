package day13;

public class Student {
    public double Student(String name ,double firstScore,double secondScore,double thirdScore){
        double sum = firstScore + secondScore + thirdScore;
        double average = sum / 3;
        return average;
    }
}
