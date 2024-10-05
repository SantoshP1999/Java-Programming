import java.io.*;
class ExceptionDemo{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);

        int data=Integer.parseInt(br.readLine());
        System.out.println(data);


       // int data=0;
        try{
            data=Integer.parseInt(br.readLine());

        }catch(NumberFormatException obj){
            System.out.println("Please Enter Integer Number");
            data=Integer.parseInt(br.readLine());
        }
        System.out.println(data);
    }
}


/*
Santosh
Santosh
Santosh
Exception in thread "main" java.lang.NumberFormatException: For input string: "Santosh"
*/