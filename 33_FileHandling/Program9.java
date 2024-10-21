//Serialization

import java.io.*;
class Player implements Serializable{
    int jerNo=0;
    String name=null;

    Player(int jerNo,String name){
        this.jerNo=jerNo;
        this.name=name;
    }
}

class SerializationDemo{
    public static void main(String[]args)throws IOException{

        Player obj1=new Player(7,"Dhoni");
        Player obj2=new Player(18,"Virat");

        FileOutputStream fos=new FileOutputStream("Player.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(obj1);
        oos.writeObject(obj2);

        oos.close();
        fos.close();
    }
}