import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=s.nextInt();
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(num+" is NOT prime");
        }else{
            System.out.println(num+" is Prime");
    
        }  
    }
}