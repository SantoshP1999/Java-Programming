import java.util.*;
class Demo3{
    static void add(int a,int b){
        int ans=a + b;
        System.out.println("Addition: "+ans);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        add(a,b);//Static methods are directly call from main().......>because main()is also a Static method 
    }
}