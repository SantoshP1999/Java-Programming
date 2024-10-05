//User defined Exception

import java.util.*;
class Demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in){
            int x=sc.nextInt();
            try{
                System.out.println(10/x);
            }catch(NullPointerException np){
            //System.out.println("Exception Handled");
            }
            //System.out.println("Exception Handled");
        }
    }
}