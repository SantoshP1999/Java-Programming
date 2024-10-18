import java.util.*;
class HashMapDemo{
    public static void main(String[]args){

        HashMap hm=new HashMap();
        hm.put("Kanha","BMC");
        hm.put("Ashish","Barclays");
        hm.put("Kanha","CarPro");
        hm.put("Rahul","BMC");

        System.out.println(hm);         //{Rahul=BMC, Ashish=Barclays, Kanha=CarPro}
}