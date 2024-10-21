import java.io.*;
class FileDemo{
    public static void main(String[]args)throws IOException{
        int count=0;
        File fobj=new File("/home/santosh/Java/ClassCodes/FileHandling/Incubator.txt");
        System.out.println(fobj.exists());

        String Files[]=fobj.list();

        // for(String str:Files){
        //     //System.out.println(str);
        //     count++;
        // }
        // System.out.println(count);

        for(String str:Files){
            File f=new File(str);
            if(f.isFile());
            count++;
        }
        System.out.println(count);

    }

}