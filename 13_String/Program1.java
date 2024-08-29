

class StringDemo1{
    public static void main(String [] args){

        //String Declaration
        String str1="core2web";            // String created using String class without using new keyword are on String Constant Pool(SCP)
        String str2=new String("core2web"); // String created using String class using new keyword are on HEAP section
        char str3[]={'c','2','w'};        //String created using array on Integer Cache  

        //Printing String
        System.out.println(str1);              
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("==========================");

        // Printing Unique id 
        System.out.println(System.identityHashCode(str1)); 
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        


    }
}