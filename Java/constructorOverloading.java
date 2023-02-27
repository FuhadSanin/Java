import java.util.Scanner;
class Shape{
    Shape(int l,int b){
        System.out.println("Reactanlge:"+(l*b));
    }
    Shape(int r){
        System.out.println("Circle :"+(3.14*r*r));
    }
}

class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        int l=s.nextInt();
        int b=s.nextInt();
        Shape obj=new Shape(l,b);
        System.out.println("Enter the radius :");
        int r=s.nextInt();
        Shape obj1=new Shape(r);
        
    }
}