import java.util.Scanner;
class Main{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix A :");
        int r1=s.nextInt();
        int c1=s.nextInt();

        System.out.println("Matrix A :");
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=s.nextInt();
            }
        }
        
        System.out.println("Matrix C :");
        for(int i=0;i<c1;i++){
            System.out.println("");
            for(int j=0;j<r1;j++){
                System.out.print(a[j][i]+"\t");
            }
        }
        

    }

}