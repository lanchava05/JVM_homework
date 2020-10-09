package btu;

public class ClassPerson {
    String name = "Nino";
    String lastName;
    int age;
    public ClassPerson(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
        if(checkAge()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public ClassPerson() {
        System.out.println("Constructor");
    }
    public ClassPerson(String a) {
        System.out.println("Constructor: "+a);
    }

    boolean checkAge(){
        if(age>=18){
            return true;
        }
        return false;
    }
}
