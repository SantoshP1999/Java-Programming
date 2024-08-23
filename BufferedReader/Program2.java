import java.io.*;
class IplExample{
    public static void main(String [] args)throws IOException{
        System.out.println("IPL DEMO");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Batsman Name");
        String Batsman=br.readLine();
        System.out.println("Batsman NAme is: "+Batsman);

        System.out.println("Enter Bowler Name");
        String Bowler =br.readLine();
        System.out.println("Bowler Name is: "+Bowler);
    } 
}