//BufferedReader Example
import java.io.*;
class BufferedReaderDemo{
    public static void main(String args[])throws IOException{
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

        String str1=br1.readLine();
        System.out.println("String 1 is :"+str1);
        br1.close();                        //If  we close the br1 then connection between jvm & Keyboard are closed hence 
        String str2=br2.readLine();         //Runtime error occurs  
        System.out.println("String 2 is"+str2);
    }
}