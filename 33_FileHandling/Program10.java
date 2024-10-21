//Deserialization

import java.io.*;
class DeserializationDemo{
    public static void main(String[]args)throws IOException,ClassNotFoundException{

        FileInputStream fis=new FileInputStream("Player.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Player obj1=(Player)ois.readObject();
        Player obj2=(Player)ois.readObject();

        ois.close();
        fis.close();

        System.out.println("JerNo:"+obj1.jerNo);
        System.out.println("Name:"+obj1.name);

        System.out.println("JerNo:"+obj2.jerNo);
        System.out.println("Name:"+obj2.name);
    }
}