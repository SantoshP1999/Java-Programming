import java.util.*;
class HashSetDemo{
    public static void main(String[]args){
        HashSet hs=new HashSet();

        hs.add("Kanha");
        hs.add("Ashish");
        hs.add("Badhe");
        hs.add("Rahul");

        System.out.println(hs);             //[Rahul, Ashish, Badhe, Kanha]
    }
}