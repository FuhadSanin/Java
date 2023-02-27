
class t1 extends Thread
{
    public void run(){
    System.out.println("Odd number is : ");
    for(int i=1;i<100;i=i+2)
        System.out.print(i+" ");
    }
}

class t2 extends Thread
{
    public void run(){
    System.out.println("\n Even number is : ");
    for(int i=2;i<=100;i=i+2)
        System.out.print(i+" ");
    }
}

class Main{
    public static void main(String args[]){
        t1 obj1=new t1();
        t2 obj2=new t2();
        obj1.start();
        try{
        obj1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        obj2.start();
    }
}

