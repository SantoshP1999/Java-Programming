//Find factors of given numbers

//1)....BruteForce Approach

import java.util.*;
class FindFactors{
    static int factors(int num){
        int count=0;
        int itr=0;

        for(int i=1;i<=num;i++){
            itr++;
            if(num%i==0){
                count++;
            }
        }
        System.out.println("Iterations :"+itr);
        return count;
    }


public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=factors(num);        
    System.out.println("No of Factors :"+count);

}
}