class ArrayDemo32{
    public static void main(String[]args){
        int arr1[]={10,20,30};
        int arr2[]={100,200,300};

        System.out.println(System.identityHashCode(arr1[0]));       //434924654
        System.out.println(System.identityHashCode(arr1[1]));       //255844473
        System.out.println(System.identityHashCode(arr1[2]));       //1701106535
        

        System.out.println(System.identityHashCode(arr2[0]));       //1137700386
        System.out.println(System.identityHashCode(arr2[1]));       //2060468723
        System.out.println(System.identityHashCode(arr2[2]));       //112810359


        System.out.println(System.identityHashCode(arr2[0]));       //1137700386
        System.out.println(System.identityHashCode(arr2[1]));       //2060468723
        System.out.println(System.identityHashCode(arr2[2]));       //112810359

    }
}