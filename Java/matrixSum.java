import java.util.Scanner;
class Main{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix A :");
        int r1=s.nextInt();
        int c1=s.nextInt();
        System.out.println("Enter the row and column of matrix B :");
        int r2=s.nextInt();
        int c2=s.nextInt();
        
        if(r1!=r2 && c1!=c2){
            System.out.println("Invalid");
            System.exit(0);
            
        }
        System.out.println("Matrix A :");
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix B :");
        int b[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=s.nextInt();
            }
        }
        
        int c[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        System.out.println("Matrix C :");
        for(int i=0;i<r1;i++){
            System.out.println("");
            for(int j=0;j<c1;j++){
                System.out.print(c[i][j]+"\t");
            }
        }
        

    }

}