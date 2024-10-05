
//ArrayIndexOutOfBoundException         RunTime Exception

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{10,20,30,40,50};
        for(int i=0;i<=arr.length;i++){     //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            System.out.println(arr[i]);
        }
    }
}