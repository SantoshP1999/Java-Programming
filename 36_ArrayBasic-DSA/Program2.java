// 2] Find Minimum & Maximum element in an array

//Given an array A of size N of integers. Your task is to find the minimum & maximum element in the array

class ArrayDemo{
    public static void main(String[]args){

        //=========Example 1

        int arr[]={3,2,1,56,100,167};
        int min1=arr[0];
        int max1=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min1=arr[i];
            }

            if(arr[i]>max1){
                max1=arr[i];
            }
            
        }
        System.out.println("Minimum Element is " + min1);
        System.out.println("Maximum Element is " + max1);

        //==========Example 2
        
        int arr2[]={1,345,234,21,567};

        int min=arr2[0];
        int max=arr2[0];

        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min){
                min=arr2[i];
            }

            if(arr2[i]>max){
                max=arr2[i];
            }
            
        }
        System.out.println("Minimum Element is " + min);
        System.out.println("Maximum Element is " + max);

    }
}