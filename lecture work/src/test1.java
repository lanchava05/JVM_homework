import java.util.Random;



public class test1 {
    int a;
    int b;
    public test1(){
        a=2;
        b=50;
    }

    public static class TestRandom {
        public static void main(String[] args) {
            test1 number = new test1();
            for (int i = 0; i < 40; i++) {
                System.out.println(getRandomNumberInRange(number.a, number.b));
            }
            int [] randnumber= new int[getRandomNumberInRange(number.a,number.b)];


            System.out.print("odd numbers: ");
            for (int i =0; i < randnumber; i++ ){
                if (i%2!=0){
                    System.out.println(i + " ");
                }
            }

        }
        public static int getRandomNumberInRange(int a, int b) {
            test1 number = new test1();
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
