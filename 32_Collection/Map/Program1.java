import java.util.*;
class HashMapDemo{
    public static void main(String[]args){

        HashMap hm=new HashMap();
        hm.put("Kanha","Infosys");
        hm.put("Ashish","Barclays");
        hm.put("Badhe","CarPro");
        hm.put("Rahul","BMC");
        hm.put("Kanha","BMC");

        System.out.println(hm);         //{Rahul=BMC, Ashish=Barclays, Badhe=CarPro, Kanha=BMC}
    }
}