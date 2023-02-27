import java.util.*;

class Main {
        public static void main(String args[]){
        int b[]={23,4};
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("Enter the numbers : ");
            int p=s.nextInt();
            int q=s.nextInt();
            int a=p/q;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        try
        {
            System.out.println(b[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds");
        }
        
    }
}