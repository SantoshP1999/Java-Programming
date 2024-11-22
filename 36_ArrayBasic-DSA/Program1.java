// 1] Search element in an array

//Given an integer array & another integer element. The task is to find if the given element is present in the arraay  or not

class ArrayDemo{
    public static void main(String[]args){

        //==========Example 1
        int arr[]={1,2,3,4};
        int n=3;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==3){
                System.out.println(n +" is Found at index "+ i);
            }
        }

        //============= Example 2
        int arr2[]={1,2,3,4,5};
        int x=5;
        for (int i=0;i<arr2.length;i++){
            if(arr2[i]==5){
                System.out.println(x +" is Found at index "+ i);
            }
        }
    }
}