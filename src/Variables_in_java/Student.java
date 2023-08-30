package Variables_in_java;

import java.sql.SQLOutput;

// Global variable
public class Student {
    int id=101;
    String name ="vasu";
   static int salary=2000;
  static int pincode=517325;
    public static void main(String[] args) {
        // object creation
        Student s1=new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        test1();

    }
    public static void test1(){
        System.out.println(pincode);
        System.out.println(salary);
    }

}
