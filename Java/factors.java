import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=s.nextInt();
        System.out.println("factors are :");
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}