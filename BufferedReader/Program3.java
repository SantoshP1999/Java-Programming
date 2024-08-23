//BufferedReader Example

import java.io.*;
class PlayerInfo{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter Player Information"); 
        System.out.println("Enter Player Name");
        String pName=br.readLine();

        System.out.println("Enter JerNo");
        int jerNo=Integer.parseInt(br.readLine());

        System.out.println("Enter Average");
        float avg=Float.parseFloat(br.readLine());

        System.out.println("Show Player Info");
        System.out.println("Player Name is: "+pName);
        System.out.println("Jersey No is: "+jerNo);
        System.out.println("Player Average is: "+avg);
    }
}