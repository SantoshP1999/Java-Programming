//Accessing elements from an Array

class ArrayDemo4{
    public static void main(String args[]){
        //Array Declaration
        int arr[]={10,20,30,40,50};

        //Printing Array
        System.out.println(arr[0]);        //10
        System.out.println(arr[1]);        //20
        System.out.println(arr[2]);        //30
        System.out.println(arr[3]);        //40
        System.out.println(arr[4]);        //50

        //Printing Array using for loop
        System.out.println("Using For Loop");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}