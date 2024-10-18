
import java.util.*;
class Platform{
    String name;
    int foundYear;
    Platform(String name,int foundYear){
        this.name=name;
        this.foundYear=foundYear;
    }

    public String toString(){
        return "{"+name+":"+foundYear+"}";
    }
}

class SortByName implements Comparator{
    public int compare(Object obj1,Object obj2){
        return ((Platform)obj1).name.compareTo(((Platform)obj2).name);
        //return ((Platform)obj1).name.compareTo(((Platform)obj2).name);
    }
}

class TreeMapDemo{
    public static void main(String[]args){
        TreeMap tm=new TreeMap(new SortByName());

        tm.put(new Platform("YouTube",2005),"Google");
        tm.put(new Platform("Instagram",2010),"Meta");
        tm.put(new Platform("Facebook",2004),"Meta");
        tm.put(new Platform("ChatGPT",2022),"OpenAI");

       

        System.out.println(tm);        //{{ChatGPT:2022}=OpenAI, {Facebook:2004}=Meta, {Instagram:2010}=Meta, {YouTube:2005}=Google}


    }
}