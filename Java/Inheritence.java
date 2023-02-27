import java.util.*;

class Employee{
    int age,salary;
    String name,adress;
    Scanner s=new Scanner(System.in);
    void read(){
        System.out.println("Enter name :");
        name=s.nextLine();
        System.out.println("Enter age :");
        age=s.nextInt();
        System.out.println("Enter the adress :");
        adress=s.next();
        System.out.println("Enter the salary :");
        salary=s.nextInt();
    }
    void print_salary(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Adress :"+adress);
        System.out.println("Salary :"+salary);
    }
}

class Officer extends Employee{
    void Officer(){
        Scanner s=new Scanner(System.in);
        System.out.println("Officer :");
        read();
        System.out.println("Enter Specialization :");
        String str=s.nextLine();
        print_salary();
        System.out.println("Specialization :"+str);
    }
}

class Manager extends Employee{
    void Manager(){
        Scanner s=new Scanner(System.in);
        System.out.println("Manager : ");
        read();
        System.out.println("Enter Designation:");
        String str=s.nextLine();
        print_salary();
        System.out.println("Designation :"+str);
    }
}
class Main{
    public static void main(String args[]){
        Officer obj1=new Officer();
        obj1.Officer();
        Manager obj2=new Manager();
        obj2.Manager();
    }
}