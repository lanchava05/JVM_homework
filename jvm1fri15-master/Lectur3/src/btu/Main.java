package btu;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ClassPerson p1 = new ClassPerson();
//        System.out.println("--------------");
//        ClassPerson p2 = new ClassPerson();
//        System.out.println("--------------");
//        ClassPerson p3 = new ClassPerson("Java");
//        System.out.println(p1.name);
//        ClassPerson p4 = new ClassPerson("Nato", 23);
//        if(p4.checkAge()){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        Test2 t12 = null;
////        int x;
//        System.out.println(t12);
//        System.out.println(x);
//        Test1 t1 = new Test1();
////        t1.printData();
//        System.out.println("---------------------");
//        Test2 t2 = new Test2();
//        t2=null;
////        t2.printData();
//
//        Test2 t3 = new Test2("C++");
//        abst1 a = new abst1();
        abstr2 ab2 = new abstr2();
//        ab2.d;
    }
}

abstract class abst1{
    String d = "dato";
}

class abstr2 extends abst1{}




class Test1{
    String s1 = "Java";
    void printData(){
        System.out.println(s1);
    }
    public Test1(){
//        System.out.println("Constructor of Test1");
    }

    public Test1(String s){
        System.out.println("Constructor of Test1: "+s);
    }
}

class Test2 extends Test1{
    public Test2(){
        System.out.println("Constructor of Test2");
    }

    public Test2(String s){
        super(s);
        System.out.println("Constructor of Test2: "+s);
    }
}

class test3{

}
