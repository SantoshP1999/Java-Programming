/* Take choice from user show this to user whats your interest

    1.Movies
    2.Series
    Enter your choice 1 or 2
    If user enters 1:
    movie you wish to watch today
        1.Founder
        2.Snowden
        3.Jobs
        4.Her
        5.Social Network
        6.Wall-E
        7.AI

    Enter your choice
        2: Showden
        if users entered 2
         Best series to watch
            1.Silicon Valley
            2.Devs
            3.The IT crowd
            4.Mr.Robot
        print users choice



 */

 import java.util.*;
 class Program4{
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats your Interest");

        System.out.println("1:Movies");
        System.out.println("2:Series");
        
        System.out.println("Enter Your choice 1 0r 2");
        choice=sc.nextInt();

        
            switch(choice){
                case 1:{

                    int wish;
                    System.out.println("Movies you wish to choice");
                    System.out.println("1:Founder");
                    System.out.println("2:Snowden");
                    System.out.println("3:Jobs");
                    System.out.println("4:Her");
                    System.out.println("5:Social Network");
                    System.out.println("6:Wall-E");
                    System.out.println("7:AI");

                    System.out.println("Enter Your choice");
                    wish=sc.nextInt();

                    switch(wish){
                        case 1:
                            System.out.println("Founder");
                            break;

                         case 2:
                            System.out.println("Snoeden");
                            break;

                         case 3:
                            System.out.println("Jobs");
                            break;

                        case 4:
                            System.out.println("Her");
                            break;

                        case 5:
                            System.out.println("Social Network");
                            break;

                         case 6:
                            System.out.println("Wall-E");
                            break;

                        case 7:
                            System.out.println("AI");
                            break;

                        default:
                            System.out.println("Invalid choice");

                    }
            
                }

                case 2:{

                    int wish;
                    System.out.println("Best series to watch");
                    System.out.println("1:Silicon Valley");
                    System.out.println("2:Devs");
                    System.out.println("3:The IT Crowd");
                    System.out.println("4:Mr.Robot");

                    System.out.println("Enter Your choice");
                    wish=sc.nextInt();

                    switch(wish){
                        case 1:
                            System.out.println("Silicon Valley");
                            break;

                         case 2:
                            System.out.println("Devs");
                            break;

                         case 3:
                            System.out.println("The IT Crowd");
                            break;

                        case 4:
                            System.out.println("Mr.Robot");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                     }
                }
        }
    }
 }