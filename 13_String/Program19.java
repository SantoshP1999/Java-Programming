//method toCharArray()
class ToCharArrayDemo{

    static int myStrLen(String str){
        char arr[]=str.toCharArray();
        int count=0;
        for (int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }


    public static void main(String[]args){
        String str1="SantoshPhatangare";
        System.out.println(str1.length());      //17

        int len=myStrLen(str1);
        System.out.println(len);        //17
    }
}