//BufferedReader Example
import java.io.*;
class flatInfo{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Flat Information");

        System.out.println("Enter Society Name ");
        String name=br.readLine();

        System.out.println("Enter Wing");
        char wing =(char)br.read(); //readLine()method read upto \n hence for char reading read()is used
        br.skip(1);  // To handle Number format exception error we use br.skip() method.

        System.out.println("Enter Flat No");
        int flatNo=Integer.parseInt(br.readLine());

        System.out.println("Show Flat Information");
        System.out.println("Society name is: "+name);
        System.out.println("WIng is: "+wing);
        System.out.println("Flat Number is: "+flatNo);
    }
}