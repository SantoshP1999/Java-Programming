//Reverse Array

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{8,4,3,9,2,6,7};

        int N=7;
        int arr2[]=new int[7];

        for(int i=0;i<N;i++){
        arr2[N-1]=arr[i];

       // System.out.println(arr[i]);
       
        System.out.println(arr2[i]);
        }

    }
}