import java.util.Scanner;
class Shape{
    void area(int l,int b){
        System.out.println("Reactanlge:"+(l*b));
    }
    void area(int r){
        System.out.println("Circle :"+(3.14*r*r));
    }
}

class Main{
    public static void main (String[] args) {
        Shape obj=new Shape();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        int l=s.nextInt();
        int b=s.nextInt();
        obj.area(l,b);
        System.out.println("Enter the radius :");
        int r=s.nextInt();
        obj.area(r);
        
    }
}