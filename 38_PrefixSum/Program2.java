/*
    Given an Array of size N &  Q no of Queries 
    Query contains two parameters (s,e)=> s-->startIndex,e-->endIndex
    For all Queries print sum of all elements from index s to e

    arr=[-3,6,2,4,5,2,8,-9,3,1]
    N=10
    Q=3

    Queries     s   e   sum

    1           1   3   12
    2           2   7   12
    3           1   1   6

*/

import java.util.*;
class RangeSum{
    public static void main(String[]args){
        int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N=10;
        int Q=3;
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Start Index");
        int startIndex=sc.nextInt();

        System.out.println("Enter End Index");
        int endIndex=sc.nextInt();

        for(int i=1;i<Q;i++){
            //sum=sum+arr[i];
            for(int j=startIndex;j<=endIndex;j++){
                sum=sum+arr[j];
            }
        }
        System.out.println(sum);
    }
}