import java.util.*;
class SortedSetDemo{
    public static void main(String[]args){
        SortedSet ss=new TreeSet();
        
        ss.add("Kanha");
        ss.add("Rahul");
        ss.add("Rajesh");
        ss.add("Ashish");
        ss.add("Badhe");

        System.out.println(ss);                              //[Ashish, Badhe, Kanha, Rahul, Rajesh]

        //headSet()
        System.out.println(ss.headSet("Kanha"));             //[Ashish, Badhe]

        //tailSet()
        System.out.println(ss.tailSet("Kanha"));             //[Kanha, Rahul, Rajesh]   

        //subSet()
        System.out.println(ss.subSet("Kanha","Rajesh"));     //[Kanha, Rahul]

    }
}