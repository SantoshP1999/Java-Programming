/*

    Given an integer Array of size N .Build an Array leftMax of Size N 

    leftMax of i contains the Maximum of the index 0 to index i 

    arr=[-3,6,2,4,5,2,8,-9,3,1]
    N=10
    leftMax=[-3,6,6,6,6,6,8,8,8,8]

*/

// 1) Bruteforce Approach

class LeftMax{
    public static void main(String[]args){
    int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
    int N=10;
    int leftMax[]=new int[N];
    for(int i=0;i<N;i++){
        int maxEle=Integer.MIN_VALUE;
        for(int j=0;j<=i;j++){
            if(maxEle<arr[j]){
                maxEle=arr[j];
            }

            leftMax[i]=maxEle;
        }
    }
    for (int i=0;i<N;i++){
        System.out.print(leftMax[i]+ " ");
    }
    
   
    }
}