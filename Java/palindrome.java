import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=s.nextLine();
        int l=0,r=str.length()-1;
        int flag=0;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                flag=1;
                break;
            }
            l++;r--;
        }
        if(flag==1)
            System.out.println(str+" is not Palindrome");
        else
            System.out.println(str +" is Palindrome");
    }
}