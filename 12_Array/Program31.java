class ArrayDemo31{
    public static void main(String[]args){
        int arr1[]={10,20,30};
        int arr2[]={10,20,30};

        System.out.println(System.identityHashCode(arr1[0]));       //434924654
        System.out.println(System.identityHashCode(arr1[1]));       //255844473
        System.out.println(System.identityHashCode(arr1[2]));       //1701106535


        System.out.println(System.identityHashCode(arr2[0]));       //434924654
        System.out.println(System.identityHashCode(arr2[1]));       //255844473
        System.out.println(System.identityHashCode(arr2[2]));       //1701106535



    }
}

/* 
identityHashCode of in integer cache is same
*/