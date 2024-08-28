//Array Declarations 
class ArrayDemo2{
    public static void main(String [] args){      
        int arr1[]=new int[5];                //Array Declaration Type 1
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        int arr2[]={10,20,30,40,50};           //Array Declaration Type 2

        int arr3[]=new int[]{10,20,30,40,50};   //Array Declaration Type 3

        //int arr4[]=new int[5]{10,20,30,40,50};      //Error: array creation with both dimension expression and initialization is illegal
    }
}