abstract class Shape{
    abstract void side();
 }
 
 class Traingle extends Shape{
     void side(){
         System.out.println("Traingle : 3 sides");
     }
 }
 
 class Rectangle extends Shape{
     void side(){
         System.out.println("Rectangle : 4 sides");
     }
 }
 
 class Main{
     public static void main(String args[]){
         Shape obj1=new Traingle();
         Shape obj2=new Rectangle();
         obj1.side();
         obj2.side();
     }
 }