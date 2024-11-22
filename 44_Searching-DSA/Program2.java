
//  Search Element

import java.util.*;
class SearchElement{
    static int searchEle(int arr[],int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return ;
            }
        }

        return -1;
    }

    public static void main(String[]args){
        int arr[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            int retVal=SearchEle(arr,-1);
            if(retVal==-1){
                System.out.println("Search Element Not Found");
            }else{
               System.out.println("Search Element Found At Index" +return ); 
            }
        }


    }

}