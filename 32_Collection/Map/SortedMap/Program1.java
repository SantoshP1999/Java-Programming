import java.util.*;
class SortedMapDemo{
    public static void main(String[]args){
        SortedMap sm=new TreeMap();
        sm.put("Ind","India");
        sm.put("Pak","Pakistan");
        sm.put("Ban","Bangladesh");
        sm.put("SL","Shrilanka");
        sm.put("Aus","Australia");

        System.out.println(sm);         //{Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=Shrilanka}

        //subMap()
        System.out.println(sm.subMap("Aus","Pak"));         //{Aus=Australia, Ban=Bangladesh, Ind=India}
        
        //headMap()
        System.out.println(sm.headMap("Ind"));              //{Aus=Australia, Ban=Bangladesh}

        //tailMap()
        System.out.println(sm.tailMap("Ind"));              //{Ind=India, Pak=Pakistan, SL=Shrilanka}

        //firstKey()
        System.out.println(sm.firstKey());                  //Aus

        //lastKey()
        System.out.println(sm.lastKey());                   //SL

        //keySet()
        System.out.println(sm.keySet());                    //[Aus, Ban, Ind, Pak, SL]

        //values()
        System.out.println(sm.values());                    //[Australia, Bangladesh, India, Pakistan, Shrilanka]

        //entrySet()
        System.out.println(sm.entrySet());                  //[Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=Shrilanka]
    }
}