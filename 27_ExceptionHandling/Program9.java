//NumberFormatException

import java.io.*;
class Demo{
    void getData()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int data=Integer.parseInt(br.readLine());
        System.out.println(data);
    }

    public static void main(String[]args)throws IOException{
        Demo obj=new Demo();
        obj.getData();
    }
}

/**
    santosh
    Exception in thread "main" java.lang.NumberFormatException: For input string: "santosh"
            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
 */