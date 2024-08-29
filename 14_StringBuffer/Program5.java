//method append()

class StringBufferDemo5{
    public static void main(String[]args){

        String str1="Santosh";
        String str2=new String("Phatangare");

        StringBuffer str3=new StringBuffer("Core2Web");

        str1.concat(str2);
        str3.append(str2);

        System.out.println(str1);       //Santosh
        System.out.println(str2);       //Phatangare
        System.out.println(str3);       //Core2WebPhatangare

    }
}