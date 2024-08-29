//Hashcode Demo

class StringDemo12{
    public static void main(String[]args){
        String str1="Santosh";
        String str2=new String("Santosh");
        String str3="Santosh";
        String str4=new String("Santosh");

        System.out.println(str1.hashCode());        //764424752       
        System.out.println(str2.hashCode());        //764424752
        System.out.println(str3.hashCode());        //764424752
        System.out.println(str4.hashCode());        //764424752


    }
}