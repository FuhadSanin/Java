import java.util.Scanner;
class Main{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix :");
        int r1=s.nextInt();
        int c1=s.nextInt();
        System.out.println("Enter the elements : ");
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix A :");
        for(int i=0;i<r1;i++){
            System.out.println("");
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+"\t");
                
            }
        }
        int large=a[0][0]; 
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(large<a[i][j]){
                    large=a[i][j];
                }
            }
        }
        System.out.println("Largest element :"+large);

    }
}