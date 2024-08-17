/* WAP in which student should enter marks for 5 subjects ,If all subjects has the above passing marks
add them and provide to switch case to print grades(First class,Second class),if a student get failed 
in any subject program should print "You Failed the Exam"
 */

 import java.util.*;
 class Program1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter java marks");
        int java =sc.nextInt();
        System.out.println("Enter Python marks");
        int python =sc.nextInt();
        System.out.println("Enter OS marks");
        int os =sc.nextInt();
        System.out.println("Enter DBMS marks");
        int dbms =sc.nextInt();
        System.out.println("Enter C++ marks");
        int cpp =sc.nextInt();

        if(java<35||python<35||os<35||dbms<35||cpp<35){
            System.out.println("You Failed the Exam");
        }else{
            double avg=(java+python+os+dbms+cpp)/5;
            char ch;
            if(avg>75){
                ch='A';
            }else if(avg>60){
                ch='B';
            }else if(avg>50){
                ch='C';
            }else if(avg>40){
                ch='D';
            }else if(avg>=35){
                ch='E';
            }else{
                ch='F';
            }

            switch(ch){
                case 'A':
                    System.out.println("Distinction");
                    break;

                case 'B':
                    System.out.println("First class");
                    break;

                case 'C':
                    System.out.println("Second class");
                    break;

                case 'D':
                    System.out.println("Third class");
                    break;

                case 'E':
                    System.out.println("Pass");
                    break;

                case 'F':
                    System.out.println("Fail");
                    break;
            
            }
        }
    }
 }