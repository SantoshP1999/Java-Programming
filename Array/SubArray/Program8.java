/*
    Given an Array of size N 
    arr={2,4,1,3}

    print sum of every single SubArray using carryForward Approach

*/

class SumOfSubArray{
    public static void main(String[]args){
      int arr[]=new int[]{2,4,1,3};
      for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum=sum+arr[j];
            System.out.println(sum);
        }
      }  
    }
}