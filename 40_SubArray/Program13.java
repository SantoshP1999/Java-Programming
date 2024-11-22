/*
    Given an integer array of size N find the contiguous subarray (containing atleast one number ) which has the largest sum & return its sum
    I/P= [-2,1,-3,4,-1,2,1,-5,4]
    O/P=[4,-1,2,1]

*/

class SubArraySum{
    public static void main (String[]args){
      int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};  

      int sum=0;
      int maxSum=Integer.MIN_VALUE;
      int x=-1;
      int start=-1;
      int end=-1;

      for(int i=0;i<arr.length;i++){
      
            if(sum==sum){
                x=i;
            }
                sum=sum+arr[i];
            

            if(sum>maxSum){
                maxSum=sum;
                start=x;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
      }

            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }
        
      
      
      System.out.println();
    }
}