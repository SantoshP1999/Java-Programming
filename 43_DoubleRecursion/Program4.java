
// Reverse String

//Approach 1

class StringReverse{
    public static void main(String[]args){
        String str=new String("Core2Web");
        System.out.println(str);
        char NewStr[]=str.toCharArray();
        int start=0;
        int end=NewStr.length-1;
        while(start<end){
            char temp=NewStr[start];
            NewStr[start]=NewStr[end];
            NewStr[end]=temp;

            start++;
            end--;
        }

        System.out.println(NewStr);
    }
}