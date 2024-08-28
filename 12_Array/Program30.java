//Null Pointer Exception Demo

class NullPointerDemo{
    public static void main(String[]args){
        int arr1[][]={{},{},{}};  //Complete Declaration
        int arr2[][]=new int[2][];  //Incomplete Declaration

        System.out.println(arr1.length);        //3
        System.out.println(arr1[0].length);     //0

        System.out.println(arr2.length);        //2
        System.out.println(arr2[0].length);     //Null Pointer Exception
    }
}