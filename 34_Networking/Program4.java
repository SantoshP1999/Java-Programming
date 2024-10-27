//URL connection

import java.io.*;
import java.net.*;
import java.util.*;

class URLConnectionDemo{
    public static void main(String[]args)throws IOException{

        URL obj1=new URL("https://www.youtube.com");
        URLConnection conn1=obj1.openConnection();
        System.out.println("Last Modified"+ new Date(conn1.getLastModified()));      //Last ModifiedThu Jan 01 05:30:00 IST 1970

        URL obj=new URL("https://www.core2web.in");
        URLConnection conn=obj.openConnection();
        System.out.println("Last Modified"+ new Date(conn.getLastModified()));      //Last ModifiedSat Sep 30 16:54:52 IST 2023
    }
}