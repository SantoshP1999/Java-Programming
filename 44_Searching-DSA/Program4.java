
//  Binary Search

import java.util.*;

class BinarySearch{
    int binarySearch(int arr[],int start,int end,int search){
            if(start>end){
                return -1;
            }else{
                int mid=(start+end)/2;
                if(arr[mid]==search){
                    return mid;
                }
                if(arr[mid]<search){
                    return binarySearch(arr,mid+1,end,search);
                }else{
                    return binarySearch(arr,start,mid-1,search);
                }
            }

            
        
       
    }

    public static void main(String[]args){
        int arr[]=new int[]{4,7,11,24,35,57,75,87};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Search Element");
        int search=sc.nextInt();
        BinarySearch obj=new BinarySearch();
        int index=obj.binarySearch(arr,search);
        if(index== 1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found At Index "+ index);
        }


    }
}