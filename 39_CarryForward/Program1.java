// Carry Forward methods

// Find Maximum element from an array

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{3,4,5,2,1,2,7,9,8};
        //int maxEle = Integer.MIN_VAlUE;
         int maxEle=Integer.MIN_VALUE;
        int i=3;
        for(int x=0;x<=i;x++){
            if(maxEle<arr[x])
                maxEle=arr[x];
        }
        System.out.println(maxEle);
    }
}