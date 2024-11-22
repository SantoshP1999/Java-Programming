/*
    Given an integer array of size N find the contiguous subarray (containing atleast one number ) which has the largest sum & return its sum
    I/P= [-2,1,-3,4,-1,2,1,-5,4]
    O/P=6

*/

//PrefixSum Approach

class SubArraySum{
    public static void main (String[]args){
      int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};  
      int prefixSum[]=new int[arr.length];
      prefixSum[0]=arr[0];
      int sum=0;
      int maxSum=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        prefixSum[i]=prefixSum[i-1]+arr[i];
      

      
        for(int j=i;j<arr.length;j++){
            
            if(1==0){
                sum=prefixSum[j];
            }
            else{
               sum=prefixSum[j]-prefixSum[i-1]; 
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
      }
      
      System.out.println(maxSum);
    }
}