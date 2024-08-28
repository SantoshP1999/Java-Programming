/*
    Given an Array of size N 
    Find the total sum of all SubArray sum

    arr={1,2,3,}

    O/P=20

*/

class SumOfSubArray{
    public static void main(String[]args){
        int totalSum=0;
      int arr[]=new int[]{1,2,3};
      for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum=sum+arr[j];
            totalSum=totalSum=sum;
        }
      }
      System.out.println(totalSum);
    }
}