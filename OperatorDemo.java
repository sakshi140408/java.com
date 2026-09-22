public class OperatorDemo {
    void add(int a,int b){
        int sum = a+b;
        System.out.println("Adittion:"+sum);
    }

int multiply(int a,int b){
    return a*b;
}
public static void main(String[] args) {
    int x = 25, y = 14;
    System.out.println("x + y="+(x + y));
    System.out.println("x - y="+(x - y));
    System.out.println("x * y="+(x * y));
    System.out.println("x / y="+(x / y));
    System.out.println("x % y="+(x % y));

    byte a = 25,b = 14;
    int result= a + b;  
    System.out.println("Arithemetic Promotion Result:+ result");

    OperatorDemo obj = new OperatorDemo();
    obj.add(5,9);
    int product =obj.multiply(7,6);
    System.out.println("Multiplication:"+ product);
 }
}