import java.util.*;
class IdentityHashMapDemo{
    public static void main(String[]args){
        IdentityHashMap hm=new IdentityHashMap();

        hm.put(new Integer(10),"Kanha");
        hm.put(new Integer(10),"Rahul");
        hm.put(new Integer(10),"Ashish");

        System.out.println(hm);                 //{10=Kanha, 10=Rahul, 10=Ashish}
    }
}