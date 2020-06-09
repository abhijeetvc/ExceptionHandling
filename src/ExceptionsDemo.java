import java.util.Scanner;

public class ExceptionsDemo {
    
    public static void main(String[] args){
      //  System.out.println("Args : "+args[0]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1 :");
        int a=sc.nextInt();
        System.out.println("Enter no2");
        int b=sc.nextInt();
        int c=0;
        try {
         //   System.out.println("Args : "+args[0]);  //Array Index out of bounds exception
            c = a / b;   // Divide by zero - Arithmetic exception
            System.out.println("Print value of c: ");
        }catch(Exception e){
          //  System.out.println(e);
            System.out.println("Denominator value cannot be zero. "+e);
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Total : "+c);

    }
}

//class Demo{
//    void getData(){
//        System.out.println("Hello");
//    }
//}
