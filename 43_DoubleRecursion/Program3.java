

//  Factorial of Number

import java.util.*;
class Factorial{
    int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        Factorial obj=new Factorial();
        int ret=obj.factorial(num);
        System.out.println(ret);
    }
}