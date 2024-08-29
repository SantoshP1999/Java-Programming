class StringBufferDemo1{
    public static void main(String[]args){

        StringBuffer str1=new StringBuffer("Santosh");
        System.out.println(System.identityHashCode(str1));      //2060468723
        str1.append("Phatangare");

        System.out.println(str1);                              //SantoshPhatangare
        System.out.println(System.identityHashCode(str1));      //2060468723

    }
}