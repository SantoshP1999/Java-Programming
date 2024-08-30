import java.io.*;
import java.util.*;
class StringTokenizerDemo3{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Player Information");
        String pInfo=br.readLine();

        StringTokenizer st =new StringTokenizer(pInfo," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        } 
    }
}