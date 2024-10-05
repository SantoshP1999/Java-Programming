//Stream closed


import java.io.*;
class Input{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);
        br.close();
        String str2=br.readLine();
        System.out.println(str2);
    }
}


/*
Santosh
Santosh
Exception in thread "main" java.io.IOException: Stream closed
*/