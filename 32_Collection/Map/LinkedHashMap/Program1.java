import java.util.*;
class LinkedHashMapDemo{
    public static void main(String[]args){
        LinkedHashMap hm=new LinkedHashMap();
        hm.put("Badhe","Infosys");
        hm.put("Kanha","Barclays");
        hm.put("Ashish","CarPro");
        hm.put("Rahul","BMS");

        System.out.println(hm);                 //{Badhe=Infosys, Kanha=Barclays, Ashish=CarPro, Rahul=BMS}
    }
}