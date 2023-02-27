
import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=s.nextInt();
        System.out.println("Enter thee elements : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Elements are :");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        System.out.println("\nSum ="+sum);
    }
}