//Internals of Array

class ArrayDemo9{
    public static void main(String [] args){
        int arr1[]={100,200,300,400};
        byte arr2[]={1,2,3,4};
        short arr3[]={10,20,30,40};
        boolean arr4[]={true,false,true};
        float arr5[]={10.5f,20.3f,40.65f}; 

        
        System.out.println(arr1);   //[I@7ad041f3
        System.out.println(arr2);   //[B@251a69d7
        System.out.println(arr3);   //[S@7344699f
        System.out.println(arr4);   //[Z@6b95977
        System.out.println(arr5);   //[F@7e9e5f8a
    }
}