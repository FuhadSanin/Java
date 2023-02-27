
import java.util.Scanner;
class Main{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=s.nextInt();
        System.out.println("Enter the elements : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int small=0;
        for(int i=0;i<n;i++){
            if(a[small]>a[i])
                small=i;
        }
        System.out.println("Smallest ="+a[small]);
    }
}