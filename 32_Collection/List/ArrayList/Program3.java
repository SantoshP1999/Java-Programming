import java.util.*;
class CrickPlayer{
    int jerNo=0;
    String name=null;

    CrickPlayer(int jerNo,String name){
        this.jerNo=jerNo;
        this.name=name;
    }

    public String toString(){
        return jerNo + ":" + name;
    }
}

class ArrayListDemo{
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add(new CrickPlayer(7,"Dhoni"));
        al.add(new CrickPlayer(18,"Virat"));
        al.add(new CrickPlayer(45,"Rohit"));

        al.add(1,new CrickPlayer(33,"hardik"));


        System.out.println(al);
    }
}