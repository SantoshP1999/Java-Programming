class StringBufferDemo4{
    public static void main(String[]args){

        String str1="Santosh";
        String str2=new String("Phatangare");

        StringBuffer str3=new StringBuffer("Core2Web");

        StringBuffer str4=str3.append(str1);

        System.out.println(str1);       //Santosh
        System.out.println(str2);       //Phatangare
        System.out.println(str3);       //Core2WebSantosh
        System.out.println(str4);       //Core2WebSantosh


    }
}