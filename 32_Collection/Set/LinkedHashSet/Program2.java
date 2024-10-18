import java.util.*;
class CrickPlayer{
    int jerNo=0;
    String name=null;

    CrickPlayer(int jerNo,String name){
        this.jerNo=jerNo;
        this.name=name;
    }

    public String toString(){
        return jerNo + ":"+ name;
    }
}

class LinkedHashSetDemo{
    public static void main(String[]args){
        LinkedHashSet hs=new LinkedHashSet();

        hs.add(new CrickPlayer(18,"Virat"));
        hs.add(new CrickPlayer(7,"Dhoni"));
        hs.add(new CrickPlayer(45,"Rohit"));
        hs.add(new CrickPlayer(7,"Dhoni"));

        System.out.println(hs);                     //[18:Virat, 7:Dhoni, 45:Rohit, 7:Dhoni]
    }
}