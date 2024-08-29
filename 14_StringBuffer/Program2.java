class StringBufferDemo2{
    public static void main(String[]args){

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());      //16
        System.out.println(sb);                 //

        sb.append("Santosh");
        System.out.println(sb.capacity());      //16
        System.out.println(sb);                 //Santosh


    }
}