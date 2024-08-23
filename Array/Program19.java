//Integer Cache And identityHashCode

class ArrayDemo19{

    void fun(int arr[]){
        arr[1]=70;
        arr[2]=80;
    }

    public static void main(String []args){
        int arr[]={10,20,30,40};

        System.out.println(System.identityHashCode(arr[0]));    //434924654
        System.out.println(System.identityHashCode(arr[1]));    //255844473
        System.out.println(System.identityHashCode(arr[2]));    //1701106535
        System.out.println(System.identityHashCode(arr[3]));    //1555877548

        ArrayDemo19 obj = new ArrayDemo19();        //Constructor
        obj.fun(arr);
        for(int x : arr){
            System.out.println(x);
        }

        int x=70;
        int y=80;
        
        System.out.println(System.identityHashCode(x)); //188145295
        System.out.println(System.identityHashCode(y)); //1056217243

    }
}