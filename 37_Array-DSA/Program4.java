/*
    Return the count of pairs (i,j) with  arr[i]+arr[j]=k  
    N=10
    k=10

    Note: i!=j
    o/p:6

*/

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
        int N=10;
        int K=10;
        int count=0;
        int itr=0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i!=j){
                    arr[i] + arr[j] == K;
                    count ++;
                }
            }
        }
        System.out.println(count*2);
        System.out.println(itr);
    }
}