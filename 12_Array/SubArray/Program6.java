/*
    Given an Array of size N 
    arr={2,4,1,3}

    print sum of every single SubArray

*/

class PrintSubArray{
    public static void main(String[]args){
        int arr[]=new int[]{2,4,1,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println(sum);
                System.out.println();
            }
        }
    }
}