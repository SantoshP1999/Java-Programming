// methods of FileHandling

import java.io.*;
class FileDemo{
    public static void main(String[]args)throws IOException{

        File fobj=new File("Incubator.txt");

        fobj.createNewFile();

        //getName()
        System.out.println(fobj.getName());     //Incubator.txt

        //getParent()
        System.out.println(fobj.getParent());   //null

        //getPath()
        System.out.println(fobj.getPath());     //Incubator.txt

        //getAbsolutePath()
        System.out.println(fobj.getAbsolutePath());     ///home/santosh/Java/ClassCodes/FileHandling/Incubator.txt

        //canRead()
        System.out.println(fobj.canRead());         //true

        //canWrite()
        System.out.println(fobj.canWrite());        //true

        //isDirectory()
        System.out.println(fobj.isDirectory());     //false

        //isFile()
        System.out.println(fobj.isFile());          //true

        //isHidden()
        System.out.println(fobj.isHidden());        //false

        //lastModified
        System.out.println(fobj.lastModified());    //1696062451999

        //delete()
        System.out.println(fobj.delete());          //true

        //list()
        System.out.println(fobj.list());        //null
    }
}