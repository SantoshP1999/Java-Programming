import java.util.*;
class Demo4{
    void add(int a,int b){
        int ans=a+b;
        System.out.println("Addition is: "+ans);
    }

    void sub(int a,int b){
        int ans=a-b;
        System.out.println("Substraction is: "+ans);
    }

    void mult(int a,int b){
        int ans=a*b;
        System.out.println("Multiplication is: "+ans);
    }

    void div(int a,int b){
        int ans=a/b;
        System.out.println("Division is: "+ans);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();

        System.out.println("Enter Value of b");
        int b=sc.nextInt();

        Demo4 obj=new Demo4();

        obj.add(a,b);
        obj.sub(a,b);
        obj.mult(a,b);
        obj.div(a,b);
    }
}