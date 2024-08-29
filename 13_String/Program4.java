// String Declaration

class StringDemo4{
    public static void main(String[]args){
        String str1="Core2Web";
        String str2=new String("Core2Web");
        char str3[]={'C','2','W'};

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(System.identityHashCode(str1));      //2060468723
        System.out.println(System.identityHashCode(str2));      //622488023
        System.out.println(System.identityHashCode(str3));      //1933863327      
    }

}