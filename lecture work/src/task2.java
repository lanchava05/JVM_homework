import java.util.Scanner;

public class task2 {
    String a;
    public task2(){
        a=("hello");
    }
    public static void main(String[] args){
        task2 hello= new task2();
        System.out.println(hello.a);
        Scanner input = new Scanner(System.in);
        System.out.print("shemoitane ricxvi: ");
        int x = input.nextInt();
        System.out.println("x+12="+ (x+12));
        if (x%2 ==0){
            System.out.println("luwi");
        }else {
            System.out.println("kenti");
        }



    }

}
