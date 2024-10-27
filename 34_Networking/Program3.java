//open website

import java.awt.*;
import java.net.*;
import java.io.*;

class OpenWebsiteDemo{
    public static void main(String[]args)throws URISyntaxException,IOException{
        String url="www.core2web.in";

        URI obj=new URI(url);
        //URI obj=new URI("https://www.youtube.com");
        Desktop desk=Desktop.getDesktop();
        desk.browse(obj);
    }
}