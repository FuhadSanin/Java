import java.util.*;

class Student{
    String name;
    int roll;
    int mark[]=new int[5];
    void read(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=s.nextLine();
        System.out.println("Enter the roll no. : ");
        roll=s.nextInt();
        for(int i=0;i<5;i++)
            mark[i]=s.nextInt();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no. :"+roll);
        System.out.println("Marks :");
        for(int i=0;i<5;i++)
            System.out.println(mark[i]);
    }
}

class Main{
    public static void main (String[] args) {
        Student obj=new Student();
        obj.read();
        obj.display();
    }
}