//Printing sum of Array Elements

import java.util.*;
class ArrayDemo6{
    public static void main(String args[]){
        int sum1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array  Elements");
        int arr[]=new int[5];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        //Printing Array Elements
        System.out.println("Print Array Elements");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);

            //Sum of Array Approach 1
            sum1=sum1+arr[i];
            
        }

        System.out.println("Sum of Array Elements is: "+sum1);

        //Sum of Array Elements Approach 2
        int sum2=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println("Sum of Array Elements is: "+sum2);
       
        
        
    }
}