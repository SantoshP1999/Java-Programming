// IOException

import java.io.*;
class Demo{
    public static void main(String[]args){
        System.out.println("Start main");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=null;
        try{
            str=br.readLine();
        }catch(IOException ie){

        }
        System.out.println(str);
        System.out.println("End main");


    }
}