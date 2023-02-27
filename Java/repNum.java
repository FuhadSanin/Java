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
        System.out.println("Enter the number to be replaced :");
        int rep=s.nextInt();
        System.out.println("Enter the value :");
        int val=s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==rep){
                a[i]=val;
            }
        }
        System.out.println("New Array is : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
    }
}