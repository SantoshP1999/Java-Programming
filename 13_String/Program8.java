class StringDemo8{
    public static void main(String[]args){
        String str1="Santosh";
        String str2="Santosh";
        String str3=new String("Santosh");
        String str4=new String("Santosh");
        String str5=new String("Shivam");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        System.out.println(System.identityHashCode(str1));      //2060468723
        System.out.println(System.identityHashCode(str2));      //2060468723
        System.out.println(System.identityHashCode(str3));      //622488023
        System.out.println(System.identityHashCode(str4));      //1933863327
        System.out.println(System.identityHashCode(str5));      //112810359



    }
}