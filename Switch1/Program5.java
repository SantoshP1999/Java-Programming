/* Write a real time example which shows a index like above code



 */

 import java.util.*;
 class Program5{
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats your plan after 12th");

        System.out.println("1:Engineering");
        System.out.println("2:Graduation");
        
        System.out.println("Enter Your choice 1 0r 2");
        choice=sc.nextInt();

        
            switch(choice){
                case 1:{

                    int wish;
                    System.out.println("Your choice is Engineering");
                    System.out.println("1:Computer Engineering");
                    System.out.println("2:Civil Engineering");
                    System.out.println("3:Mechanical Engineering");
                    System.out.println("4:Chemical Engineering");
                    System.out.println("5:Electrical Engineering");

                    System.out.println("Enter Your choice");
                    wish=sc.nextInt();

                    switch(wish){
                        case 1:
                            System.out.println("Computer Engineering");
                            break;

                         case 2:
                            System.out.println("Civil Engineering");
                            break;

                         case 3:
                            System.out.println("Mechanical Engineering");
                            break;

                        case 4:
                            System.out.println("Chemical Engineering");
                            break;

                        case 5:
                            System.out.println("Electrical Engineering");
                            break;

                        
                        default:
                            System.out.println("Invalid choice");

                    }
            
                }

                case 2:{

                    int wish;
                    System.out.println("You selected Graduation");
                    System.out.println("1:BSC");
                    System.out.println("2:BCS");
                    System.out.println("3:BCA");
                    System.out.println("4:BBA");

                    System.out.println("Enter Your choice");
                    wish=sc.nextInt();

                    switch(wish){
                        case 1:
                            System.out.println("BSC");
                            break;

                         case 2:
                            System.out.println("BCS");
                            break;

                         case 3:
                            System.out.println("BCA");
                            break;

                        case 4:
                            System.out.println("BBA");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                     }
                }
        }
    }
 }