class StringBufferDemo3{
    public static void main(String[]args){

        StringBuffer sb= new StringBuffer(100);
        sb.append("biencaps");
        sb.append("Core2Web");

        System.out.println(sb);                 //biencapsCore2Web
        System.out.println(sb.capacity());      //100

        sb.append("Incubator"); 
        System.out.println(sb);                 //biencapsCore2WebIncubator
        System.out.println(sb.capacity());      //100

    }
}