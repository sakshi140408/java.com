class Calculator {
    //function overloading 

    //Methods 1; add two integer
int add(int a, int b) {
    return a+b;
}
int add(int a,int b,int c){
    return a+b+c;
}
double add(double a, double b){
    return a+b;
}
}
class Student{
    String name;
    int age;
    Student(){
        name="Unknown";
        age=0;
    }
    Student(String n, int a){
        name=n;
        age=a;
    }
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    void display(){
        System.out.println("Name:"+ name +",Age:"+ age);
    }
    Student getStudent(){
        return this;
    }
}
public class FunctionDemo{
    public static void main (String[]args) {
        Calculator calc=new Calculator();
        System.out.println("Add two integers:"+ calc.add(15, 10 ));
        System.out.println("Add three integers:"+ calc.add(10, 10, 15 ));
        System.out.println("Add two doubles:"+ calc.add(6.5, 4.5 ));
         //constructor 
         Student s1=new Student();
         Student s2=new Student("sakshi",18);
         Student s3=new Student(s2);

         s1.display();
         s2.display();
         s3.display();

         Student s4 = s2.getStudent();//returns reference of s2
         System.out.println("Student s4 details(refernce to s2:");
         s4.display();
    }
}



