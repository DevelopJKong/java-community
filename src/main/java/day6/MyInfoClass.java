package day6;

import java.util.Scanner;

public class MyInfoClass {
        Scanner sc = new Scanner(System.in);
        public String name;
        public int age;
        public String mb;
        public String sentence;
        public String blood;

        public MyInfoClass() {

        }

        public MyInfoClass(String name, int age, String mb, String sentence) {
                this.name = name;
                this.age = age;
                this.mb = mb;
                this.sentence = sentence;
                this.blood = blood;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getMb() {
                return mb;
        }

        public void setMb(String mb) {
                this.mb = mb;
        }

        public String getSentence() {
                return sentence;
        }

        public void setSentence(String sentence) {
                this.sentence = sentence;
        }

        public String getBlood() {
                return blood;
        }

        public void setBlood(String blood) {
                this.blood = blood;
        }
}
