
class ArrayDemo22{
    public static void main(String[]args){
         int arr[][]=new int [2][2];
         arr[0][0]=10;
         arr[0][1]=10;
         arr[1][0]=10;
         arr[1][1]=10;

         System.out.println(arr[1][1]); //10
         System.out.println(arr[0]);    //[I@7ad041f3
         System.out.println(arr[1]);    //[I@251a69d7
         System.out.println(arr);       //[[I@7344699f

    }
}