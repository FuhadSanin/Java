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
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Second largest :"+a[n-2]);
            
    }
}