import java.util.*;
class TreeMapDemo{
    public static void main(String[]args){
        TreeMap tm=new TreeMap();
        
        tm.put("Ind","India");
        tm.put("Pak","Pakistan");
        tm.put("Ban","BAngladesh");
        tm.put("Aus","Australia");
        tm.put("SL","Shrilanka");

        System.out.println(tm);            //{Aus=Australia, Ban=BAngladesh, Ind=India, Pak=Pakistan, SL=Shrilanka}

    }
}