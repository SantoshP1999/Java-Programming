import java.io.*;
import java.util.*;
class StringTokenizerDemo2{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Match Information");
        System.out.println("Enter Team,Group,Runs,StrikeRate");
        String matchInfo=br.readLine();
        System.out.println(matchInfo);

        StringTokenizer st=new StringTokenizer(matchInfo," ");

        String token1=st.nextToken();
        String token2=st.nextToken();
        int token3=Integer.parseInt(st.nextToken());
        float token4=Float.parseFloat(st.nextToken());

        System.out.println("Team Name is: "+token1);
        System.out.println("Group is: "+token2);
        System.out.println("Runs are: "+token3);
        System.out.println("Strike Rate is: "+token4);


    }
}