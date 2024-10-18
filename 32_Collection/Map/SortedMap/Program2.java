import java.util.*;
class IterateMapDemo{
    public static void main(String[]args){
        SortedMap sm=new TreeMap();
        sm.put("Ind","India");
        sm.put("Pak","Pakistan");
        sm.put("Aus","Australia");
        sm.put("SL","Shrilanka");
        sm.put("Ban","Bangladesh");

        System.out.println(sm);                 //{Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=Shrilanka}

        Set<Map.Entry>data=sm.entrySet();
        Iterator<Map.Entry>itr=data.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
             Map.Entry abc=itr.next();
             System.out.println(abc.getKey()+":"+abc.getValue());
        }
    }
}