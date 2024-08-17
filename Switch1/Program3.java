/* WAP in which user should enter two numbers if both numbers are positive , multiply them & 
provide to switch case to verify whethere number is even or odd .If the user enters any 
negative number program should terminate by saying "Sorry Negative anumbers not allowed"
 */

 import java.util.*;
 class Program3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 =sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 =sc.nextInt();
        

        if(num1<0||num2<0){
            System.out.println("Negative numbers not allowed");
        }else{
            

            switch((num1*num2)%2){
                case 0:
                    System.out.println("The multiplication is Even");
                    break;

                case 1:
                    System.out.println("The multiplication is Odd");
                    break;

            
            }
        }
    }
 }