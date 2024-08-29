class StringDemo2{
    public static void main(String[]args){
        String str1="core2web";
        String str2=new String("core2web");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println("================================");

        String str3="core2web";
        String str4=new String("core2web");

        System.out.println(System.identityHashCode(str3));//str1 & str3 unique ID are same because same strings on SCP are unique
        System.out.println(System.identityHashCode(str4));//str2 & str4 unique ID are Diffrent because same strings on HEAP are Diffrent
    }
}