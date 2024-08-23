class KLengthSubArrayCount{
    public static void main(String[]args){

        //  Approach 1

        int arr[]=new int[]{-3,4,2-2,5,3,-2,8,2,1,4};
        int k=4;
        int count=0;
        int end=k-1;
        int start=0;

        while(end<arr.length){
            count++;
            start++;
            end++;
        }
        System.out.println(count);

        ///------------------------------------

        // Approach 2
        
        // int arr[]=new int[]{-3,4,2-2,5,3,-2,8,2,1,4};
        // int k=4;
        // System.out.println(arr.length-k+1);
    }
}