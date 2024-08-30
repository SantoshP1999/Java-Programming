// StringTokenizer Example
import java.io.*;
import java.util.*;
class StringTokenizerDemo{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Society Name,Wing,Flat No");
        String flatInfo=br.readLine();
        System.out.println(flatInfo);

        StringTokenizer str=new StringTokenizer(flatInfo,",");//(Object,String Delimeter)
        String token1=str.nextToken();
        String token2=str.nextToken();
        String token3=str.nextToken();

        System.out.println("Society Name: "+token1);
        System.out.println("Wing: "+token2);
        System.out.println("Flat No is: "+token3);
    }
} 