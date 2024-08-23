//Program from to count even elements in an array

import java.util.*;
class EvenCount{
    public static void main(String args[]){
        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //Enter Array Elements
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //count
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count=count+1;
            }

        }
        System.out.println("Even Element count is: "+count);
    }
}