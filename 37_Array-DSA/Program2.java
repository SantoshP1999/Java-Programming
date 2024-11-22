// Count no of elements having atleast 1 elements greater than itself

//  2)  Optimized Approach

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
        int N=10;
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        count++;
        //System.out.println("Count=" +(N-count));
        System.out.println(N-count);
    }
}    