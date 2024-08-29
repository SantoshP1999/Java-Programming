//method reverse()
class ReverseDemo{
    public static void main(String[]args){
        StringBuffer sb= new StringBuffer("Santosh");

        System.out.println(sb.reverse());       //hsotnaS

        String str1="Core2Web";
        StringBuffer sb2=new StringBuffer(str1);
        str1=sb2.reverse().toString();
        System.out.println(str1);       //beW2eroC
    }
}