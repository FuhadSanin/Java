class Emp{
    void display(){
        System.out.println("Employee class");
    }
    void calc(){
        System.out.println("10000");
    }
}

class Eng extends Emp{
    void display(){
        super.display();
        System.out.println("Engineering class");
    }
    void calc(){
        super.calc();
        System.out.println("20000");
    }
}

class Main{
    public static void main (String[] args) {
        Eng obj=new Eng();
        obj.display();
        obj.calc();
    }
}