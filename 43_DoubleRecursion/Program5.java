
// Reverse String

//Approach 2

class StringReverse{
    String reverseString(String str){
        if(str==null || str.length()<=1){
            return str;
        }
        return revString(str.subString(1))+str.charAt(0);
    }
    public static void main(String[]args){
        String str="Core2Web";
        StringRev obj=new StringRev();
        String reverse=obj.revString(str);
        System.out.println(revrseString);
      
    }
}