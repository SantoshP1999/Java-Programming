import java.util.Scanner; 
class DreamCompany{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Dream Company");
        String company=sc.next();

        System.out.println("Your Expected Salary");
        float salary=sc.nextFloat();

        System.out.println("Your Dream company is: "+company);
        System.out.println("Your Expected Salary is: "+salary);
    }
}