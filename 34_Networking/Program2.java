//URL & URL Connections

import java.net.*;
class URLDemo{
    public static void main(String[]args)throws MalformedURLException{
        URL obj=new URL("https://www.core2web.in:80");
        System.out.println(obj.getProtocol());      //https
        System.out.println(obj.getPort());          //80
        System.out.println(obj.getFile());

    }
}