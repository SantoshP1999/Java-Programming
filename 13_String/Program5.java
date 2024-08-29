class StringDemo5{
    public static void main(String [] args){

        String str1="Core2Web";
        String str2=new String("Core2Web");

        System.out.println(System.identityHashCode(str1));      //2060468723
        System.out.println(System.identityHashCode(str2));      //622488023

        String str3="Core2Web";
        String str4=new String("Core2Web");

        System.out.println(System.identityHashCode(str3));      //2060468723
        System.out.println(System.identityHashCode(str4));      //1933863327
    }
}

/*
Strings on SCP are same
*/