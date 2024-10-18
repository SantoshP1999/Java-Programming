import java.util.*;
import arithfun.Add;
import arithfun.Sub;
import arithfun.Mult;
import arithfun.Div;


class Demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x=sc.nextInt();
        System.out.println("Enter 2nd number");
        int y=sc.nextInt();

        Add obj=new Add(x,y);
        System.out.println("Addition: "+obj.add());

        Sub obj2=new Sub(x,y);
        System.out.println("Subtraction: "+obj2.sub());

        Mult obj3=new Mult(x,y);
        System.out.println("Multiplication: "+obj3.mult());

        Div obj4 =new Div(x,y);
        System.out.println("Division: "+obj4.div());
    }
}