/*
    Sum of array Elements between the Given Range

    ....Bruteforce Approach

*/

import java.util.*;
class RangeSum{
    public static void main(String[]args){
        int arr[]=new int[]{2,5,3,11,7,9,4};
        int N=7;
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Start Index");
        int startIndex=sc.nextInt();

        System.out.println("Enter End Index");
        int endIndex=sc.nextInt();

        for(int i=startIndex;i<=endIndex;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Elements between Range "+startIndex+" To "+endIndex+" is " +sum);
    }
}