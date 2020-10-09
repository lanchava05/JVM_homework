import java.util.Random;
import java.util.Scanner;


public class test {
    int a;
    int b;
    public test(){
        a=2;
        b=50;
    }

    public static class TestRandom {
        public static void main(String[] args) {
            test number = new test();
            for (int i = 0; i < 40; i++) {
                System.out.println(getRandomNumberInRange(number.a, number.b));


            }
        }
        public static int getRandomNumberInRange(int a, int b) {
            test number = new test();
            if (a > b) {
                a=number.b;
                b=number.a;
            }
            Random rand = new Random();
            int random = rand.nextInt((b - a) + 1) + a;
            return random;

        }

    }
}
