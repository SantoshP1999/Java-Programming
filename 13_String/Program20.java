//method strLen()
import java.util.Scanner;

class StringLenDemo{

    static int myStrLen(String str1, String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        int count=0;

        for (int i=0;i<arr1.length;i++){
            count++;
        }

        for(int j=0;j<arr2.length;j++){
            count++;
        }
        return count;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        if(myStrLen(str1) == myStrLen(str2)){
            System.out.println("Length are Equal");
        }else{
            System.out.println("Length are not Equal");
        }
    }
}