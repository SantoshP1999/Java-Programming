class StringDemo9{
    public static void main(String[]args){
        String str1="Santosh";
        String str2="Phatangare";

        System.out.println(str1 + str2);        //SantoshPhatangare

        String str3="SantoshPhatangare";
        String str4=str1 + str2;

        System.out.println(System.identityHashCode(str3));      //2060468723
        System.out.println(System.identityHashCode(str4));      //622488023

    }
}
/*If we perform Runtime operatios on string then new object created on Heap
doesnt create object on SCP
 */