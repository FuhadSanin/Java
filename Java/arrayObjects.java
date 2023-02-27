import java.util.*;

class Student{
    String name;
    int roll;
    void read(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=s.nextLine();
        System.out.println("Enter the roll no. : ");
        roll=s.nextInt();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no. :"+roll);
    }
}

class Main{
    public static void main (String[] args) {
        Student obj[]=new Student[3];
        for(int i=0;i<3;i++){
            obj[i]=new Student();
        }
        for(int i=0;i<3;i++)
            obj[i].read();
        for(int i=0;i<3;i++)
            obj[i].display();
    }
}