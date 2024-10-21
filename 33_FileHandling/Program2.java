//Create Folder

import java.io.*;
class FileDemo{
    public static void main(String[]args)throws IOException{
        File fobj1=new File("FileHandling");
        fobj1.mkdir();

        File fobj2=new File("code1.txt");
        fobj2.createNewFile();
    }
}