import java.io.*;
class InputDemo{
    public static void main(String [] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Your name is: "+name);

        System.out.println("Enter your age");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Your Age is: "+age);

    }
}