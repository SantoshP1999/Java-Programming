/* WAP that asks the user to enter a number from 0 to 5 and print its spelling if entererd number is 
greater than 5 print entered number is greater than 5
 */

 import java.util.*;
 class Program2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number:");
       int num =sc.nextInt();

        if(num>5){
            num=6;
        }
        if(num<0){
            num=-1;
        }
            
            switch(num){
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                 case 6:
                    System.out.println("Number is greater than 5");
                    break;

                 case -1:
                    System.out.println("Number is Negative");
                    break;

            }
            
     }
 }
